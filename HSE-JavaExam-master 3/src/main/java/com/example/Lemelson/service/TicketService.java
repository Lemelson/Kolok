package com.example.Lemelson.service;

import com.example.Lemelson.entity.Ticket;
import com.example.Lemelson.exception.PassengerNotFoundException;
import com.example.Lemelson.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {

    private final TicketRepository ticketRepository;

    @Autowired
    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public Ticket purchaseTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    public List<Ticket> getTicketsByPassengerId(Long passengerId) {
        List<Ticket> tickets = ticketRepository.findByPassengerId(passengerId);
        if (tickets.isEmpty()) {
            throw new PassengerNotFoundException(passengerId);
        }
        return tickets;
    }


    public void cancelTicket(Long ticketId) {
        ticketRepository.deleteById(ticketId);
    }
}
