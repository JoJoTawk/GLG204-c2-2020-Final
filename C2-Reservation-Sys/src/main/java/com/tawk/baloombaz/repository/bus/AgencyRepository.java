package com.tawk.baloombaz.repository.bus;

import com.tawk.baloombaz.model.bus.Agency;
import com.tawk.baloombaz.model.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AgencyRepository extends MongoRepository<Agency, String> {
    Agency findByCode(String agencyCode);

    Agency findByOwner(User owner);

    Agency findByName(String name);
}
