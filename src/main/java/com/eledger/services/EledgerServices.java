package com.eledger.services;

import com.eledger.mongo.model.UserMongoDetailes;
import com.eledger.ui.model.LoginModel;
import com.eledger.ui.model.RegisterModel;

public interface EledgerServices {

	public UserMongoDetailes getUserDetail(final LoginModel loginModel);
	
	public void saveRegistration(final RegisterModel registerModel);
	
}
