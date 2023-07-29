package com.vivek.bej.usermodule.reository;


import com.vivek.bej.usermodule.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
