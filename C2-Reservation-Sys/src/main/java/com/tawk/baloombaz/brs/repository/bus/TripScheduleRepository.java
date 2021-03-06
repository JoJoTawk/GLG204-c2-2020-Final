package com.tawk.baloombaz.brs.repository.bus;

import com.tawk.baloombaz.brs.model.bus.Trip;
import com.tawk.baloombaz.brs.model.bus.TripSchedule;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface TripScheduleRepository extends MongoRepository<TripSchedule, String> {
    TripSchedule findByTripDetailAndTripDate(Trip tripDetail, String tripDate);
}