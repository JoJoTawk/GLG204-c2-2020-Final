package com.tawk.baloombaz.repository.user;

import com.tawk.baloombaz.model.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

    User findByEmail(String email);

}
