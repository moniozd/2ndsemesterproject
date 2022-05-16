package com.example.demo.service;


import com.example.demo.model.CustomerModel;
import com.example.demo.model.MotorhomeModel;
import com.example.demo.repository.MechanicRepository;
import com.example.demo.repository.MotorhomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MechanicService {

    @Autowired
    MechanicRepository mechanicRepository;

    public List<MotorhomeModel> fetchAll() {
        return mechanicRepository.fetchAll();
    }

    public CustomerModel updateService(long id, MotorhomeModel motorhomeModel) {
        return mechanicRepository.updateService(id, motorhomeModel);
    }

    public MotorhomeModel findMotorhomeById(long id) {
        return mechanicRepository.findMotorhomeById(id);
    }

}
