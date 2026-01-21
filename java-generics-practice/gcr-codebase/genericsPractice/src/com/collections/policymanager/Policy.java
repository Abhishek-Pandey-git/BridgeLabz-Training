package com.collections.policymanager;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
//defined the policy
public class Policy {
	int policyNumber;
	String name;
	LocalDate expiryDate;
	
	public Policy(int policyNumber,String name,String expiry) {
		this.policyNumber=policyNumber;
		this.name=name;
		this.expiryDate=LocalDate.parse(expiry,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	}
	@Override
	public String toString() {
		String ans=String.valueOf(this.policyNumber);
		ans+=" "+this.name;
		ans+=" "+this.expiryDate.toString();
		return ans;
	}
}
