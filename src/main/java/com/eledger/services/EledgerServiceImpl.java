package com.eledger.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eledger.api.EledgerAPICall;
import com.eledger.dao.*;
import com.eledger.mongo.model.RegisterMongoModel;
import com.eledger.mongo.model.UserMongoDetailes;
import com.eledger.ui.model.*;

@Service
public class EledgerServiceImpl implements EledgerServices{
	@Autowired
	private UserDetailesRepository userDetailesRepository;
	
	@Autowired
	private RegisterRepository registerRepository;
	
	@Autowired
	private EledgerAPICall eledgerAPICall;
	
	public UserMongoDetailes getUserDetail(final LoginModel loginModel) {
		UserMongoDetailes userMongoDetailes=userDetailesRepository.findByUserIdAndPassword(loginModel.getUserId(), loginModel.getPassword());
	if(userMongoDetailes!=null) {
		String returnVal=eledgerAPICall.eledgerPost("http://192.168.125.129:4000/users","{\"username\":\"aditya\",\r\n" + 
				"\"orgname\":\"Patient\"\r\n" + 
				"}");
		if(returnVal!=null) {
			System.out.println(">>>"+returnVal);
		return userMongoDetailes;
		}
	}
	return null;
	}
	
	public void saveRegistration(final RegisterModel registerModel) {
		registerRepository.save(this.registerModelToMongo(registerModel));
	}
	
	private RegisterMongoModel registerModelToMongo(final RegisterModel registerModel) {
		return  RegisterMongoModel.builder()
				.registrationRype(registerModel.getRegistrationRype())
				.firstNameAndLastName(registerModel.getFirstNameAndLastName())
				.doctorLicenseID(registerModel.getDoctorLicenseID())
				.specialtyO(registerModel.getSpecialtyO())
				.contactNumber(registerModel.getContactNumber())
				.nameOfTheLabServicesCompany(registerModel.getNameOfTheLabServicesCompany())
				.laboratoryLicenseNumber(registerModel.getLaboratoryLicenseNumber())
				.address(registerModel.getAddress())
				.country(registerModel.getCountry())
				.province(registerModel.getProvince())
				.userID(registerModel.getUserID())
				.password(registerModel.getPassword())
				.build();
	}
}
