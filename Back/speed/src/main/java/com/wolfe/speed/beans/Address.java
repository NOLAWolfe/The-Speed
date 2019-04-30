package com.wolfe.speed.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "ADDRESS")
public class Address implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addressId;
	
	@Column
	@NotNull
	private String streetAddress;
	@Column
	@NotNull
	private String apartment;
	@Column
	@NotNull
	private String city;
	@Column
	@NotNull
	private String state;
	@Column
	@NotNull
	private int zip;
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getApartment() {
		return apartment;
	}
	public void setApartment(String apartment) {
		this.apartment = apartment;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int addressId, @NotNull String streetAddress, @NotNull String apartment, @NotNull String city,
			@NotNull String state, @NotNull int zip) {
		super();
		this.addressId = addressId;
		this.streetAddress = streetAddress;
		this.apartment = apartment;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	public Address(@NotNull String streetAddress, @NotNull String apartment, @NotNull String city,
			@NotNull String state, @NotNull int zip) {
		super();
		this.streetAddress = streetAddress;
		this.apartment = apartment;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", streetAddress=" + streetAddress + ", apartment=" + apartment
				+ ", city=" + city + ", state=" + state + ", zip=" + zip + "]";
	}
	
	
}
