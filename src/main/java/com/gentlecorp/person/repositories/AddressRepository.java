package com.gentlecorp.person.repositories;

import com.gentlecorp.person.models.entities.Address;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AddressRepository extends MongoRepository<Address, String> {
    List<Address> findByCity(String city);
}
