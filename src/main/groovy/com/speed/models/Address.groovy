package com.speed.models

import groovy.transform.Canonical

import javax.persistence.*
import javax.validation.constraints.NotNull

@Entity
@Table(name = "ADDRESS")
@Canonical
class Address implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ADDRESSID")
    private int addressId;

    @Column(name = "STREETADDRESS")
    @NotNull
    private String streetAddress;
    @Column(name = "APARTMENT")
    private String apartment;
    @Column(name = "CITY")
    @NotNull
    private String city;
    @Column(name = "STATE")
    @NotNull
    private String state;
    @Column(name = "ZIP")
    @NotNull
    private int zip;
}
