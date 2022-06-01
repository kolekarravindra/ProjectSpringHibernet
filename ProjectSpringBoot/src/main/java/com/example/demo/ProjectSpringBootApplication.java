package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.entity.Organization;
import com.example.demo.entity.Terminal;
import com.example.demo.repository.TerminalRepo;

@SpringBootApplication
public class ProjectSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(ProjectSpringBootApplication.class, args);
		System.out.println("Welcome Spring-BootAssignment");
	
	
		/*TerminalRepo terminalRepository = context.getBean(TerminalRepo.class);
		Terminal terminal = new Terminal();
		terminal.setTrname("T1");
		terminal.setTrtype("S124");
		Organization organization = new Organization();
		organization.setOrgid(1);
		terminal.setCdid(organization);
		terminalRepository.save(terminal);*/
	
	}
	
	
	

}
