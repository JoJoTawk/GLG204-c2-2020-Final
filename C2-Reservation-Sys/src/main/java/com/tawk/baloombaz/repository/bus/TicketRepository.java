package com.tawk.baloombaz.repository.bus;

import com.tawk.baloombaz.model.bus.Ticket;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TicketRepository extends MongoRepository<Ticket, String> {
}
