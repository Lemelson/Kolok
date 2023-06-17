package com.example.Lemelson.service;

import com.example.Lemelson.entity.Flight;
import com.example.Lemelson.repository.FlightRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class FlightService {

    private final FlightRepository flightRepository;

    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }


    public Page<Flight> findAll(Pageable pageable) {
        return flightRepository.findAll(pageable);
    }
}
