package com.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.*;

//insurance class
class InsuranceClaim {
	String claimType;
	double claimAmount;

	public InsuranceClaim(String claimType, double claimAmount) {
		this.claimType = claimType;
		this.claimAmount = claimAmount;
	}
}

public class InsuranceApp {

	public static void main(String[] args) {
		 ArrayList<InsuranceClaim> claims = new ArrayList<>();
			//add insurance
			  claims.add(new InsuranceClaim("Health", 5000));
		      claims.add(new InsuranceClaim("Health", 12000));
		      claims.add(new InsuranceClaim("Vehicle", 8000));
		      claims.add(new InsuranceClaim("Vehicle", 15000));
		      claims.add(new InsuranceClaim("Property", 25000));
		      claims.add(new InsuranceClaim("Property", 30000));
		      claims.add(new InsuranceClaim("Health", 7000));
		      claims.add(new InsuranceClaim("Vehicle", 10000));
		      
		      HashMap<String, Double> averagingClaims=claims.stream().collect(Collectors.groupingBy(c->c.claimType,HashMap::new,Collectors.averagingDouble(c->c.claimAmount)));			
		      
		      //printing all this
		      
		      for(Map.Entry<String, Double>entry:averagingClaims.entrySet()) {
		    	  System.out.println(entry.getKey()+" "+entry.getValue());
		      }
		      
		      
	}
}
