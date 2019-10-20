package com.sa.saproject.repository;

import com.sa.saproject.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepositiry extends CrudRepository<User, Long>{
}
