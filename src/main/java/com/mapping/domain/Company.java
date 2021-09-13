package com.mapping.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String itcompany;
	private String softwareCompany;
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getItcompany() {
		return itcompany;
	}


	public void setItcompany(String itcompany) {
		this.itcompany = itcompany;
	}


	public String getSoftwareCompany() {
		return softwareCompany;
	}


	public void setSoftwareCompany(String softwareCompany) {
		this.softwareCompany = softwareCompany;
	}



	
	
	
}
