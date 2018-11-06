package com.eledger.ui.model;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterModel {

	private String registrationRype;
	
	private String firstNameAndLastName;
	
	private String doctorLicenseID;
	
	private String specialtyO;

	private String contactNumber;
	
	private String nameOfTheLabServicesCompany;
	
	private String laboratoryLicenseNumber;
	
	private String address;
	
	private String country;
	
	private String province;
	
	private String userID;
	
	private String password;
	
}
