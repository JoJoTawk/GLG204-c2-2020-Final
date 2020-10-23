package com.starterkit.springboot.brs.repository.user;

import com.starterkit.springboot.brs.model.user.Role;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface RoleRepository extends MongoRepository<Role, String> {

    Role findByRole(String role);

}
