package com.speed.daos

import com.speed.models.Address
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AddressDAO extends JpaRepository<Address, Integer>{

    Address findAllByZipLikeAndStreetAddressLikeAndApartment(Integer zipcode, String streetAddress, String apartment)

}
