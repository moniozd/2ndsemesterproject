package com.example.demo.service;


import com.example.demo.model.CustomerModel;
import com.example.demo.model.MotorhomeModel;
import com.example.demo.repository.MotorhomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MotorhomeService {

    @Autowired
    MotorhomeRepository motorhomeRepository;

    @Transactional
    public List<MotorhomeModel> fetchAllMotorhome() {
        return motorhomeRepository.fetchAllMotorhome();
    }

    public List<MotorhomeModel> fetchIdAndName() {
        return motorhomeRepository.fetchIdAndName();
    }

}
