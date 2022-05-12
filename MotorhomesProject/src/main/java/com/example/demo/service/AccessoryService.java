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

    @Autowired
    AccessoryRepository accessoryRepository;

    @Transactional
    public List<AccessoryModel> fetchAll() {
        return accessoryRepository.fetchAllAccessories();
    }

    public List<AccessoryModel> fetchIdAndName() {
        return accessoryRepository.fetchIdAndName();
    }


}
