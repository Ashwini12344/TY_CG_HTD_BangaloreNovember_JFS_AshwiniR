package com.capgemini.retailer.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.retailer.dto.OrderInfo;
import com.capgemini.retailer.dto.ProductInfo;
import com.capgemini.retailer.dto.RetailResponse;
import com.capgemini.retailer.dto.UserInfo;
import com.capgemini.retailer.service.RetailService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
public class RetailController {
	@Autowired
	RetailService service;
	private RetailResponse response;

	@PostMapping(path = "/create-profile", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public RetailResponse createProfile(@RequestBody UserInfo user) {
		RetailResponse response = new RetailResponse();
		if (service.createProfile(user)) {
			response.setStatusCode(200);
			response.setMessage("Success");
			response.setDescription("Successfully created your Profile...");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("User emailId already Exists!!!");
		}
		return response;
	}

	@GetMapping(path = "/user-login", produces = MediaType.APPLICATION_JSON_VALUE)
	public RetailResponse login(@RequestParam("email") String email, @RequestParam("password") String password) {
		RetailResponse response = new RetailResponse();
		UserInfo user = service.login(email, password);

		if (user.getEmail().equalsIgnoreCase(email) && user.getPassword().equalsIgnoreCase(password)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Login Successful...");
			response.setUser(Arrays.asList(user));
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Incorrect credentials!!!");
		}
		return response;
	}

	@GetMapping(path = "/get-product", produces = MediaType.APPLICATION_JSON_VALUE)
	public RetailResponse getProduct(@RequestParam("id") int id) {
		RetailResponse response = new RetailResponse();
		ProductInfo product = service.getProduct(id);
		if (product != null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Product found");
			response.setProduct(Arrays.asList(product));
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Product id does not exist");
		}
		return response;
	}

	@PutMapping(path = "/update", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public RetailResponse updatePassword(@RequestBody String password) {
		RetailResponse response = new RetailResponse();

		UserInfo user = new UserInfo();
		user.setPassword(password);
		if (service.updatePassword(user, password)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription(" Password updated successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("unable to updated");
		}
		return response;
	}
	@GetMapping(path="/get-allorders",produces = MediaType.APPLICATION_JSON_VALUE)
	public RetailResponse viewAllProducts() {
		RetailResponse response = new RetailResponse();
		List<OrderInfo> list=service.getAllOrders();
		if(list.size()!=0) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Products found");
			response.setOrder(list);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("No data");
		}
		return response;
		
	}

}
