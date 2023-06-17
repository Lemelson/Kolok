package com.example.Lemelson.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;


import java.time.LocalDateTime;

@Entity
@Table(name = "flights")
@Data
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(name = "flight_number", nullable = false)
    private String flightNumber;

    @NotBlank
    @Column(name = "departure", nullable = false)
    private String departure;

    @NotBlank
    @Column(name = "destination", nullable = false)
    private String destination;

    @Column(name = "departure_time", nullable = false)
    private LocalDateTime departureTime;

    @Column(name = "arrival_time", nullable = false)
    private LocalDateTime arrivalTime;

}
