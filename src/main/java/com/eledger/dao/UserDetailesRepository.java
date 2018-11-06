package com.eledger.dao;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.eledger.mongo.model.UserMongoDetailes;

public interface UserDetailesRepository extends MongoRepository<UserMongoDetailes, String> {

	public UserMongoDetailes findByUserIdAndPassword(String userID,String password);
}
