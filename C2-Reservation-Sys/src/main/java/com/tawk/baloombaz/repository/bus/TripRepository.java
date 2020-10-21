package com.tawk.baloombaz.repository.bus;

import com.tawk.baloombaz.model.bus.Agency;
import com.tawk.baloombaz.model.bus.Bus;
import com.tawk.baloombaz.model.bus.Stop;
import com.tawk.baloombaz.model.bus.Trip;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TripRepository extends MongoRepository<Trip, String> {
    Trip findBySourceStopAndDestStopAndBus(Stop source, Stop destination, Bus bus);

    List<Trip> findAllBySourceStopAndDestStop(Stop source, Stop destination);

    List<Trip> findByAgency(Agency agency);
}
