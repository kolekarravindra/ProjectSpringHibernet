package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.TerminalDto;
import com.example.demo.entity.Organization;
import com.example.demo.entity.Terminal;

public interface OraginazationService {
	
	public List<Organization> findByDelid(String delid);
	
	//public List<Terminal> findTerminialByOrgid(Organization orgid);

	public List<TerminalDto> findTerminalByOrgid(int orgid);

	public Organization saveOrganization(Organization org);
	
	public TerminalDto saveTerminal(Terminal ter);

	public String updateOragnization(Organization org);

	public String updateTerminal(Terminal term);

	
}
