package com.example.Lemelson.controller;

import com.example.Lemelson.dto.TicketDto;
import com.example.Lemelson.entity.Ticket;
import com.example.Lemelson.service.TicketService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @PostMapping("/create")
    public ResponseEntity<Ticket> purchaseTicket(@RequestBody TicketDto ticketDto) {
        Ticket ticket = new Ticket();
        ticket.setFlightId(ticketDto.getFlightId());
        ticket.setPassengerId(ticketDto.getPassengerId());
        Ticket newTicket = ticketService.purchaseTicket(ticket);
        return new ResponseEntity<>(newTicket, HttpStatus.CREATED);
    }


    @GetMapping("/{passengerId}")
    public ResponseEntity<List<Ticket>> getPassengerTickets(@PathVariable Long passengerId) {
        List<Ticket> tickets = ticketService.getTicketsByPassengerId(passengerId);
        return new ResponseEntity<>(tickets, HttpStatus.OK);
    }

    @DeleteMapping("/{ticketId}")
    public ResponseEntity<?> cancelTicket(@PathVariable Long ticketId) {
        ticketService.cancelTicket(ticketId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

