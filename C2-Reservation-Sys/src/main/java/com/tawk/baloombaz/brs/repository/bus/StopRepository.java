package com.tawk.baloombaz.brs.repository.bus;

import com.tawk.baloombaz.brs.model.bus.Stop;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface StopRepository extends MongoRepository<Stop, String> {
    Stop findByCode(String code);
}
