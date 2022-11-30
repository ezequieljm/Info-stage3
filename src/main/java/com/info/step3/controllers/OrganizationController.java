package com.info.step3.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.info.step3.entity.Address;
import com.info.step3.entity.Organization;
import com.info.step3.repository.IAddress;
import com.info.step3.repository.IOrganization;

@RestController
@RequestMapping(value = OrganizationController.BASIS)
public class OrganizationController {

    public static final String BASIS = "/organization";

    @Autowired
    private IOrganization organizationService;

    @Autowired
    private IAddress addressService;

    @GetMapping
    public String helloFromOrganizationPath() {
        return "Hello from organization path";
    }

    @GetMapping("/all")
    public ResponseEntity<Map<String,Object>> allOrganizations() {
        Map<String, Object> response = new HashMap<String, Object>();
		List<Organization> organizations = organizationService.findAll();

		response.put("Organizations", organizations);
		
		return new ResponseEntity<Map<String,Object>>(response, HttpStatus.OK);

    }

    @GetMapping("/address")
    public ResponseEntity<Map<String,Object>> allAddress() {
        Map<String, Object> response = new HashMap<String, Object>();
		List<Address> organizations = addressService.findAll();

		response.put("Organizations", organizations);
		
		return new ResponseEntity<Map<String,Object>>(response, HttpStatus.OK);

    }

}
