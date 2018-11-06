package com.eledger.mongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "userDetailes")
public class UserMongoDetailes {

	@Id
	private String id;

	@Field("userId")
	private String userId;

	@Field("password")
	private String password;

	@Field("userType")
	private String userType;
}
