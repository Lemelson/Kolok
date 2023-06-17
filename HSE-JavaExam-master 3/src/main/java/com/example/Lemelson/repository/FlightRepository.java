package com.example.Lemelson.repository;


import com.example.Lemelson.entity.Flight;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FlightRepository extends PagingAndSortingRepository<Flight, Long> {
}
