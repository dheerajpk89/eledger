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
@Document(collection = "registrationDetails")
public class RegisterMongoModel {

	@Id
	private String id;

	@Field("registrationRype")
	private String registrationRype;

	@Field("firstNameAndLastName")
	private String firstNameAndLastName;

	@Field("doctorLicenseID")
	private String doctorLicenseID;

	@Field("specialtyO")
	private String specialtyO;

	@Field("contactNumber")
	private String contactNumber;

	@Field("nameOfTheLabServicesCompany")
	private String nameOfTheLabServicesCompany;

	@Field("laboratoryLicenseNumber")
	private String laboratoryLicenseNumber;

	@Field("address")
	private String address;

	@Field("country")
	private String country;

	@Field("province")
	private String province;

	@Field("userID")
	private String userID;

	@Field("password")
	private String password;
}
