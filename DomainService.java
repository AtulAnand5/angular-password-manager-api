package com.barclays.service;

import java.util.ArrayList;
import java.util.List;

import com.barclays.domain.Person;
import com.barclays.domain.DomainWrapper;

public class DomainService {
	
	public List<Person> getPersons() {
		
		List<Person> domainList = new ArrayList<Person> ();
		
		Person p = new Person();
		p.setId(1);
		p.setName("Atul");
		p.setAge(20);
		p.setWeight(65);
		
		domainList.add(p);
		
		p = new Person();
		p.setId(2);
		p.setName("Anand");
		p.setAge(21);
		p.setWeight(70);
		
		domainList.add(p);
		
		return domainList;
		
	}
	
	
	public DomainWrapper getDomainWrapper() {
		
		DomainWrapper domainWrapper = new DomainWrapper();
		
		domainWrapper.setDomain(this.getPersons());
		
		return domainWrapper;
		
	}
	
	
}
