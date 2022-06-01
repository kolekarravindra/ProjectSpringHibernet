package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.TerminalDto;
import com.example.demo.entity.Organization;
import com.example.demo.entity.Terminal;
@Repository
public interface TerminalRepo extends JpaRepository<Terminal, Integer>{

	//@Query(value = "SELECT c.trid from terminial c WHERE c.orgid = :orgid",nativeQuery = true)
	/*(@Query(value = " select t.trid, t.trname, t.trtype ,t.cdid_orgid "
			+ "from terminal t WHERE t.cdid_orgid = :orgid",nativeQuery = true)*/
    
	@Query(value="SELECT * FROM terminal t WHERE t.cdid_orgid= :orgid or t.cdid_orgid IN "
			+    " (SELECT o.ORGID FROM organization o WHERE o.DELID =:orgid ) ",nativeQuery = true) 
	public List<Terminal> findTerminialByOrgid(@Param("orgid") int orgid);


	

	
	
	
	//public List<Terminal> findByOrgid(Organization orgid);
	
	
	
}
