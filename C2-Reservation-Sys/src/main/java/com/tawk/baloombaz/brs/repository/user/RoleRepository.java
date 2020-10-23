package com.tawk.baloombaz.brs.repository.user;

import com.tawk.baloombaz.brs.model.user.Role;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface RoleRepository extends MongoRepository<Role, String> {

    Role findByRole(String role);

}
