package com.streams;
import java.time.LocalDate;
import java.util.stream.*;
import java.util.ArrayList;

//membership class
class Membership {

    String memberName;
    LocalDate expiryDate;

    public Membership(String memberNaString,LocalDate expiryDate) {
    	this.memberName=memberNaString;
    	this.expiryDate=expiryDate;
    }
    
    @Override
    public String toString() {
    	return this.memberName+" "+this.expiryDate.toString();
    }
}


//membership expiry check
public class MembershipApp {
	
	
	 public static void main(String[] args) {

	        ArrayList<Membership> members = new ArrayList<>();

	        // Sample data (expiry dates around today)
	        members.add(new Membership("Alice", LocalDate.now().plusDays(5)));
	        members.add(new Membership("Bob", LocalDate.now().plusDays(15)));
	        members.add(new Membership("Charlie", LocalDate.now().plusDays(35)));
	        members.add(new Membership("David", LocalDate.now().plusDays(1)));
	        members.add(new Membership("Eva", LocalDate.now().plusDays(60)));
	        members.add(new Membership("Frank", LocalDate.now().plusDays(25)));
	        members.add(new Membership("Grace", LocalDate.now().minusDays(2))); // already expired
	        members.add(new Membership("Helen", LocalDate.now().plusDays(30)));
	        members.add(new Membership("Ian", LocalDate.now().plusDays(45)));
	        members.add(new Membership("Julia", LocalDate.now().plusDays(10)));

	        // Stream to extract data
	        
	       ArrayList<Membership>expired=members.stream().filter(m->m.expiryDate.isBefore(LocalDate.now().plusDays(30))).collect(Collectors.toCollection(ArrayList::new));
	       
	        
	        // 3. Print or collect result
	       
	       for(Membership m:expired) {
	    	   System.out.println(m+" !!!EXPIRED");
	       }
	    }
}
