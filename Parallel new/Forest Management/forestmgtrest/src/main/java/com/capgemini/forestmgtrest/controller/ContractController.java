package com.capgemini.forestmgtrest.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.forestmgtrest.dto.ContractBean;
import com.capgemini.forestmgtrest.dto.ContractResponse;
import com.capgemini.forestmgtrest.service.ContractService;



@RestController
@CrossOrigin(origins="*",allowedHeaders="*",allowCredentials="true")
public class ContractController {
	@Autowired
	ContractService service;
	
	@PostMapping(path="/add-contract",produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public ContractResponse addContract(@RequestBody ContractBean bean) {
		ContractResponse response = new ContractResponse();
		if(service.addContractor(bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Contract added");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Contractct not added!!!");
		}
		return response;
	}
	@GetMapping(path="/get-contract",produces = MediaType.APPLICATION_JSON_VALUE)
	public ContractResponse getContract(@RequestParam("contract_no") int contract_no) {
		ContractResponse response = new ContractResponse();
		ContractBean bean=service.getContract(contract_no);
		if(bean!=null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Contract found");
			response.setBean(Arrays.asList(bean));
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Contract id does not exist");
		}
		return response;
	}
	
	@GetMapping(path="/get-allcontracts",produces = MediaType.APPLICATION_JSON_VALUE)
	public ContractResponse getAllContracts() {
		ContractResponse response = new ContractResponse();
		List<ContractBean> list=service.getAllContracts();
		if(list.size()!=0) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Contractor found");
			response.setBean(list);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("No data");
		}
		return response;
		
	}
	
	@DeleteMapping(path = "/delete-contractor/{customerid}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ContractResponse deleteContract(@PathVariable("customerid") int customerid) {
		ContractResponse response = new ContractResponse();
		if(service.deleteContractor(customerid)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Contract deleted");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Contract not found");
		}
		return response;
	}

}