package com.tawk.baloombaz.brs.repository.user;

import com.tawk.baloombaz.brs.model.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<User, String> {

    User findByEmail(String email);

}
