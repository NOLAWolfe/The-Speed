package com.wolfe.speed.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wolfe.speed.beans.Address;
import com.wolfe.speed.repositories.AddressDAO;

@Service
public class AddressService {

	private AddressDAO addressDAO;
	
	/*
	 * Should possibly thing logic for 
	 * Saved Address Pool
	 * 
	 * If a User uses an Address for an Event, 
	 * Find a way to Persist recent address for quick selction for next event post
	 * --- Possible Use Cases, UI-Drop Down List at Address Input box
	 */

	public AddressService() {
	}

	public AddressDAO getAddressDAO() {
		return addressDAO;
	}

	@Autowired
	public void setAddressDAO(AddressDAO addressDAO) {
		this.addressDAO = addressDAO;
	}
	
	public void addAddress(Address address) {
		addressDAO.save(address);
	}
	
	public Address getAddressById(int id) {
		Optional<Address> a = addressDAO.findById(id);
		if (a.isPresent()) {
			return a.get();
		} else {
			return null;
		}
	}

	public Address checkAddress(Address address) {
		Integer zip = address.getZip();
		String streetAddress = address.getStreetAddress();
		String apartment = address.getApartment();
		Address checkedAddress = addressDAO.findAllByZipLikeAndStreetAddressLikeAndApartment(zip, streetAddress,
				apartment);
		if (checkedAddress == null) {
			addressDAO.save(address);
			return address;
		}
		return checkedAddress;
	}

}
