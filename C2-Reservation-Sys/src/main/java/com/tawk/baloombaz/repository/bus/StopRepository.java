package com.tawk.baloombaz.repository.bus;

import com.tawk.baloombaz.model.bus.Stop;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StopRepository extends MongoRepository<Stop, String> {
    Stop findByCode(String code);
}
