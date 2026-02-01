package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class CustomerApp {

    public static void main(String[] args) {

        List<String> customerNames = new ArrayList<>();

        // Sample customer names
        customerNames.add("abhishek");
        customerNames.add("rohan");
        customerNames.add("neha");
        customerNames.add("amit");
        customerNames.add("sneha");
        customerNames.add("vikram");
        customerNames.add("priya");
        
        
        // Use stream()
        
        ArrayList<String> modifiedNames=customerNames.stream().map((c)->c.toUpperCase()).sorted((a,b)->a.compareTo(b)).collect(Collectors.toCollection(ArrayList::new));
        
        
        // Display the result
        for(String str:modifiedNames) {
        	System.out.println(str);
        }
        
        
    }
}

