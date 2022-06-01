package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.TerminalDto;
import com.example.demo.entity.Organization;
import com.example.demo.entity.Terminal;
import com.example.demo.services.OraginazationService;


@RestController
public class OrganizationController {

	@Autowired
	private OraginazationService serv;
	
	@RequestMapping("/")
	public String hello() {
		
		return "Welcome-Spring Boot Project";
	}
	
	//fecthing get customers for dealerid
	
	@GetMapping("/dealer/{delid}")
	public List<Organization> findByDelarid(@PathVariable String delid) {

		//System.out.println(delid);
		//return org.findByDelid(delid);
		return serv.findByDelid(delid);
		
		
	}
	
	//fetching get terminals for customers id
	
	@GetMapping("/Terminal/{orgid}")
	public List<TerminalDto> findByOrgid(@PathVariable int orgid){
		
		return serv.findTerminalByOrgid(orgid);
	}
	
	// add dealer and customers
	
	@PostMapping("/adddealerCustomers")
	public Organization addOrganization(@RequestBody Organization org) {
		
		return serv.saveOrganization(org);
		
		
	}
	// add Terminal 
	@PostMapping("/addTerminal")
	public TerminalDto addTerminal(@RequestBody Terminal ter) {
		
		return serv.saveTerminal(ter);
		
		
	}
	@PutMapping("/updatedelCust")
    public String updateDelCust(@RequestBody Organization org) {
		
		return serv.updateOragnization(org);
		
		
	}
	
	@PutMapping("/updateterminal")
    public String updateTerm(@RequestBody Terminal term) {
		
		return serv.updateTerminal(term);
		
		
	}
	
	
	
	
}
