package com.eledger.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.eledger.mongo.model.UserMongoDetailes;
import com.eledger.services.EledgerServices;
import com.eledger.ui.model.*;

@Controller
public class AppController {
	@Autowired
	private EledgerServices eledgerServices;
	
    @GetMapping("/")
    public String root(Model model) {
    	LoginModel loginModel= LoginModel.builder().password("password").userId("userId").build();
    	model.addAttribute("loginModel",loginModel);
        return "index";
    }

    @GetMapping("/user")
    public String userIndex() {
    	System.out.println("user");
        return "dashbord";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute(value="loginModel") final LoginModel loginModel) {
    	UserMongoDetailes userDetailes=eledgerServices.getUserDetail(loginModel);
    	if(userDetailes!=null) {
    		
    		return "dashbord";
    	}
    	return "redirect:/";
    }

    @GetMapping("/access-denied")
    public String accessDenied() {
    	System.out.println("denied");
        return "/error/access-denied";
    }
    @GetMapping("/dashbord")
    public String dashbord() {
        return "/dashbord";
    }
    @GetMapping("/tables")
    public String tables() {
        return "/tables";
    }
    @GetMapping("/logout")
    public String logout() {
        return "/";
    }
    @GetMapping("/register")
    public String registerGet(Model model) {
    	final RegisterModel registerModel= RegisterModel.builder()
    								.registrationRype("registrationRype")
    								.firstNameAndLastName("firstNameAndLastName")
    								.doctorLicenseID("doctorLicenseID")
    								.specialtyO("specialtyO")
    								.contactNumber("contactNumber")
    								.nameOfTheLabServicesCompany("nameOfTheLabServicesCompany")
    								.laboratoryLicenseNumber("laboratoryLicenseNumber")
    								.address("address")
    								.country("country")
    								.province("province")
    								.userID("userID")
    								.password("password")
    								.build();
    	
    	model.addAttribute("registerModel",registerModel);
        return "/register";
    }
    @PostMapping("/registration")
    public String registerPost(@ModelAttribute(value="registerModel")final RegisterModel registerModel,Model model) {
    	
    	eledgerServices.saveRegistration(registerModel);
    	model.addAttribute("successMsg",registerModel.getFirstNameAndLastName()+" Thank you for you are registration..! will reach you shortly");
    	return "redirect:/";
    }
    
}
