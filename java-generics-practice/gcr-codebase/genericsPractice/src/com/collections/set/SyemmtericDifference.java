package com.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SyemmtericDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> set1 = new HashSet<>(Set.of(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Set.of(3, 4, 5));
        
        //symmetric difference
        
        //first union 
        Set<Integer> union=new HashSet<>(set1);
        union.addAll(set2);
        
        Set<Integer>intersection= new HashSet<>(set1);
        intersection.retainAll(set2);
        
        //symmetric difference
        
        Set<Integer>symmetricDifference=new HashSet<Integer>(union);
        symmetricDifference.removeAll(intersection);
        
        System.out.println("Symmetric Difference: "+symmetricDifference);
        
        

	}

}
