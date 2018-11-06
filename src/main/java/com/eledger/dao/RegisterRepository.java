package com.eledger.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.eledger.mongo.model.*;

public interface RegisterRepository extends MongoRepository<RegisterMongoModel, String> {

}
