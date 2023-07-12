package com.speed.services

import com.speed.daos.AddressDAO
import com.speed.daos.EventDAO
import com.speed.daos.HostDAO
import com.speed.models.Events.Event
import com.speed.models.Hosts.Host
import com.speed.models.Postal.Address
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AddressService {
    AddressDAO addressDAO
    EventDAO eventDAO
    EventService eventService

    @Autowired
    void setAddressDAO(AddressDAO addressDAO) { this.addressDAO = addressDAO}

    @Autowired
    void setEventDAO(EventDAO eventDAO) { this.eventDAO = eventDAO}

    void createAddress(Address address) { addressDAO.save(address)}

    List<Address> findAllAddress(){ addressDAO.findAll()}

    Address getAddressById(int addressId) { addressDAO.getByAddressid(addressId)}

    Address findAddressByEventId(int eventId) {
        Event event = eventService.getEventById(eventId)
        addressDAO.findAddressByEventId(eventId)
    }


}
