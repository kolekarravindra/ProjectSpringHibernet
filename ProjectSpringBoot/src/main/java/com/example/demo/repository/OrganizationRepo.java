package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Organization;

@Repository
public interface OrganizationRepo extends JpaRepository<Organization, Integer> {

	public List<Organization> findByDelid(String id);
	 

}
