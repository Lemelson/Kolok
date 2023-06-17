package com.example.Lemelson.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tickets")
@Data
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "flight_id")
    private Long flightId;

    @Column(name = "passenger_id")
    private Long passengerId;

}
