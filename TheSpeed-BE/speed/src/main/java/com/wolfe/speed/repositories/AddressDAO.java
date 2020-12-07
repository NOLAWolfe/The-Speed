package com.wolfe.speed.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wolfe.speed.beans.Address;
@Repository
public interface AddressDAO extends JpaRepository<Address, Integer> {

	
	public Address findAllByZipLikeAndStreetAddressLikeAndApartment(Integer zipcode, String streetAddress, String apartment);
}
