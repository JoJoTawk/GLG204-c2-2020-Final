package com.tawk.baloombaz.dto.mapper;

import com.tawk.baloombaz.dto.model.bus.TripDto;
import com.tawk.baloombaz.model.bus.Trip;

public class TripMapper {
    public static TripDto toTripDto(Trip trip) {
        return new TripDto()
                .setId(trip.getId());







//                .setId(trip.getId())
//                .setSourceStopCode(trip.getSourceStop().getCode())
//                .setSourceStopName(trip.getSourceStop().getName())
//                .setDestinationStopCode(trip.getDestStop().getCode())
//                .setDestinationStopName(trip.getDestStop().getName())
//                .setJourneyTime(trip.getJourneyTime())
//                .setFare(trip.getFare());
    }
}
