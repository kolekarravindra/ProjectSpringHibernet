package com.example.demo.serviceimp;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.TerminalDto;
import com.example.demo.entity.Organization;
import com.example.demo.entity.Terminal;
import com.example.demo.repository.OrganizationRepo;
import com.example.demo.repository.TerminalRepo;
import com.example.demo.services.OraginazationService;
@Service
public class OrginzationServiceImp implements OraginazationService{

	@Autowired
	private OrganizationRepo orgrep;
	
	@Autowired
	private TerminalRepo terrep;
	@Override
	public List<Organization> findByDelid(String delid) {
		
		return orgrep.findByDelid(delid);
		// TODO Auto-generated method stub
		
	}

	/*@Override
	public List<Terminal> findTerminialByOrgid(Organization orgid) {
		// TODO Auto-generated method stub
		Terminal ter= new Terminal();
		
		return terrep.findByOrgid(orgid);
	}*/
	
	@Override
	public List<TerminalDto> findTerminalByOrgid(int orgid) {
		// TODO Auto-generated method stub
		
		
		 List<Terminal> terminal= terrep.findTerminialByOrgid(orgid);
		 List<TerminalDto> tdto=new ArrayList<>();
		for(Terminal t:terminal) {
			TerminalDto dto=new TerminalDto();
			dto.setTrid(t.getTrid());
			dto.setTrname(t.getTrname());
			dto.setTrtype(t.getTrtype());
			dto.setCdid(t.getCdid().getOrgid());
			tdto.add(dto);
		}
		return tdto;
	}

	@Override
	public Organization saveOrganization(Organization org) {
		// TODO Auto-generated method stub
		return orgrep.save(org);
	}

	@Override
	public TerminalDto saveTerminal(Terminal ter) {
		// TODO Auto-generated method stub
		
	
		Terminal ter1 = terrep.save(ter);
		
			TerminalDto dto=new TerminalDto();
			dto.setTrid(ter1.getTrid());
			dto.setTrname(ter1.getTrname());
			dto.setTrtype(ter1.getTrtype());
			dto.setCdid(ter1.getCdid().getOrgid());
			
		return dto;
		
		
	}
	
	public String updateOragnization(Organization product) {

		Organization exsitingproduct = orgrep.findById(product.getOrgid()).orElse(null);
        if(product.getDelid()!=null) {
		exsitingproduct.setDelid(product.getDelid());
        }
        if(product.getOrgname()!=null) {
		exsitingproduct.setOrgname(product.getOrgname());
        }
        if(product.getOrgtype()!=null) {
		exsitingproduct.setOrgtype(product.getOrgtype());
        }

        orgrep.save(exsitingproduct);
        
       return "Update Succesfully";
	}

	@Override
	public String updateTerminal(Terminal term) {
		// TODO Auto-generated method stub
		Terminal exsitingproduct = terrep.findById(term.getTrid()).orElse(null);
        if(term.getTrname()!=null) {
		exsitingproduct.setTrname(term.getTrname());
        }
        if(term.getTrtype()!=null) {
		exsitingproduct.setTrtype(term.getTrtype());
        }
        if(term.getCdid()!=null) {
		exsitingproduct.setCdid(term.getCdid());
        }

		
		  terrep.save(exsitingproduct);
			return "Update Successful Termnial data";
	}
	
	
	
}
