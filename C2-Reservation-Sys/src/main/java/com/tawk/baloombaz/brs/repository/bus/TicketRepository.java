package com.tawk.baloombaz.brs.repository.bus;

import com.tawk.baloombaz.brs.model.bus.Ticket;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface TicketRepository extends MongoRepository<Ticket, String> {
}
