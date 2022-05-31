// Author: Team

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

    // @Autowired 'creates' an object of the class. This is used to 'connect' the different layers in the application.
    @Autowired
    MechanicRepository mechanicRepository;


    //Accesses the mechanic repository's fetchAll, updateService, findMotorhomeById

    public List<MotorhomeModel> fetchAll() {
        return mechanicRepository.fetchAll();
    }

    public MotorhomeModel updateService(long id, MotorhomeModel motorhomeModel) {
        return mechanicRepository.updateService(id, motorhomeModel);
    }

    public MotorhomeModel findMotorhomeById(long id) {
        return mechanicRepository.findMotorhomeById(id);
    }

}
