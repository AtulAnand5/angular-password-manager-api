package com.barclays.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class DomainWrapper {
	
	private List<Person> domainList;
	
	public DomainWrapper() {
	}

	public List<Person> getDomain() {
		return domainList;
	}

	public void setDomain(List<Person> domainList) {
		this.domainList = domainList;
	}
	
}
