package com.tawk.baloombaz.repository.bus;

import com.tawk.baloombaz.model.bus.Agency;
import com.tawk.baloombaz.model.bus.Bus;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BusRepository extends MongoRepository<Bus, String> {
    Bus findByCode(String busCode);

    Bus findByCodeAndAgency(String busCode, Agency agency);
}
