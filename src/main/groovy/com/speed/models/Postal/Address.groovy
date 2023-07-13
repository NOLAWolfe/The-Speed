package com.speed.models.Postal

import com.speed.models.Events.Event
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
    @Column(name = "ID")
    private int addressId;

    @Column(name = "AddressName")
    @NotNull
    private String AddressName;

    @Column(name = "ADDRESSLINE1")
    @NotNull
    private String addressLine1;

    @Column(name = "ADDRESSLINE2")
    @NotNull
    private String addressLine2;

    @Column(name = "APARTMENT")
    private String apartment;

    @Column(name = "CITY")
    @NotNull
    private String city;

    @Column(name = "STATE")
    @NotNull
    private String state;

    @Column(name = "COUNTRYCODE")
    @NotNull
    private String countryCode;

    @Column(name = "ZIP")
    @NotNull
    private int zip;

    @OneToOne
    @NotNull
    private Event event
}
