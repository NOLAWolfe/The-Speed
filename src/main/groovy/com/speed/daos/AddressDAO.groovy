package com.speed.daos

import com.speed.models.Events.Event
import com.speed.models.Postal.Address
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AddressDAO extends JpaRepository<Address, Integer>{
    Address findAddressByEventEventId(int eventId)
}
