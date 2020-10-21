package com.tawk.baloombaz.repository.user;

import com.tawk.baloombaz.model.user.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role, String> {

    Role findByRole(String role);

}