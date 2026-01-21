package com.collections.policymanager;

import java.time.LocalDate;
import java.util.*;

//the manager class;
public class PolicyManager {
	private static HashMap<Integer,Policy>policies=new HashMap<>();
	private static LinkedHashMap<Integer,Policy> orderedPolicies=new LinkedHashMap<>();
	private static TreeMap<LocalDate,ArrayList<Policy>>sortedPolicies=new TreeMap<>();
	
	
	public static void  addPolicy(int number,String name,String date) {
		if(policies.containsKey(number)) {
			System.out.println("Policy already exists: ");
			return;
		}
		
		
		//adding to hashmap for faster retrieval
		Policy policy=new Policy(number,name,date);
		policies.put(policy.policyNumber,policy);
		
		//adding to ordered linkedhashmap
		
		orderedPolicies.put(policy.policyNumber, policy);
		
		//adding to treemap for sorted structure
		
		//if such key doesn't exist already
		if(!sortedPolicies.containsKey(policy.expiryDate)) {
			sortedPolicies.put(policy.expiryDate,new ArrayList<>());
			sortedPolicies.get(policy.expiryDate).add(policy);
		}
		
		sortedPolicies.get(policy.expiryDate).add(policy);
		
	}
	
	//SEARCH OPTIMISED
	public static void  searchPolicy(int number) {
		if(policies.containsKey(number)) {
			System.out.println("Policy found: ");
			System.out.println(policies.get(number).policyNumber+" "+policies.get(number).expiryDate.toString());
			return;
		}
		System.out.println("No such policy exist: ");
	}
	
	//POLICIES EXPIRING IN NEXT 30 DAYS
	
	public static void getPoliciesExpiringInNext30Days() {
		LocalDate today=LocalDate.now();
		LocalDate limit=today.plusDays(30);
	
		ArrayList<ArrayList<Policy>>expiringSoon=new ArrayList<>();
		
		//traversing sorted map
		
		for(Map.Entry<LocalDate,ArrayList<Policy>>entry: sortedPolicies.entrySet()) {
			if(entry.getKey().isAfter(today) && entry.getKey().isBefore(limit)) {
				expiringSoon.add(entry.getValue());
			}
		}
		
		System.out.println(expiringSoon.toString());
	}
	
	//search POLICY BY Holdername
	
	public static void searchPolicyByHolder(String name) {
		ArrayList<Policy> myPolicies=new ArrayList<>();
		
		
		for(Map.Entry<Integer,Policy>entry: policies.entrySet()) {
			if(entry.getValue().name.equalsIgnoreCase(name)) {
				myPolicies.add(entry.getValue());
			}
		}
		
		System.out.println(myPolicies.toString());
		
	}
	//REMOVING POLICIES
	
	public static void removePoliciesByHolderName(String holderName) {

	    List<Policy> toRemove = new ArrayList<>();

	    // 1️⃣ Traverse TreeMap (sorted by expiry date)
	    for (Map.Entry<LocalDate, ArrayList<Policy>> entry : sortedPolicies.entrySet()) {

	        ArrayList<Policy> policies = entry.getValue();

	        for (Policy p : policies) {
	            if (p.name.equalsIgnoreCase(holderName)) {
	                toRemove.add(p);
	            }
	        }
	    }

	    // 2️⃣ Remove from HashMap and LinkedHashMap
	    for (Policy p : toRemove) {
	        policies.remove(p.policyNumber);
	        orderedPolicies.remove(p.policyNumber);
	    }

	    // 3️⃣ Remove from TreeMap lists
	    for (ArrayList<Policy> policies : sortedPolicies.values()) {
	        policies.removeIf(
	            p -> p.name.equalsIgnoreCase(holderName)
	        );
	    }

	    // 4️⃣ Clean up empty expiry-date keys
	    sortedPolicies.entrySet().removeIf(
	        entry -> entry.getValue().isEmpty()
	    );
	}

	
}
