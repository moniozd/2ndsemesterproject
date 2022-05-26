package com.example.demo.service;


import com.example.demo.model.AccessoryModel;
import com.example.demo.model.CustomerModel;
import com.example.demo.repository.AccessoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class AccessoryService {

    // @Autowired 'creates' an object of the class. This is used to 'connect' the different layers in the application.
    @Autowired
    AccessoryRepository accessoryRepository;

    //Accesses the accessory repository's fetchAll method
    // @Transactional makes it so, it only runs if it completes the whole query
    @Transactional
    public List<AccessoryModel> fetchAll() {
        return accessoryRepository.fetchAllAccessories();
    }

    public List<AccessoryModel> fetchIdAndName() {
        return accessoryRepository.fetchIdAndName();
    }


}
