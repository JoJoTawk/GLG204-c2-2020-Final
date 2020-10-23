package com.tawk.baloombaz.brs.repository.bus;

import com.tawk.baloombaz.brs.model.bus.Agency;
import com.tawk.baloombaz.brs.model.bus.Bus;
import com.tawk.baloombaz.brs.model.bus.Stop;
import com.tawk.baloombaz.brs.model.bus.Trip;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface TripRepository extends MongoRepository<Trip, String> {
    Trip findBySourceStopAndDestStopAndBus(Stop source, Stop destination, Bus bus);

    List<Trip> findAllBySourceStopAndDestStop(Stop source, Stop destination);

    List<Trip> findByAgency(Agency agency);
}
