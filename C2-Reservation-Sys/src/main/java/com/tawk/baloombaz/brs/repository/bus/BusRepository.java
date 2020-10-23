package com.tawk.baloombaz.brs.repository.bus;

import com.tawk.baloombaz.brs.model.bus.Agency;
import com.tawk.baloombaz.brs.model.bus.Bus;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface BusRepository extends MongoRepository<Bus, String> {
    Bus findByCode(String busCode);

    Bus findByCodeAndAgency(String busCode, Agency agency);
}
