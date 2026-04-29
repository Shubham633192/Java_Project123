package com.example.demo.service;

import com.example.demo.model.Vehicle;
import com.example.demo.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository repo;

    public Vehicle save(Vehicle v) {
        return repo.save(v);
    }

    public List<Vehicle> getAll() {
        return repo.findAll();
    }
}