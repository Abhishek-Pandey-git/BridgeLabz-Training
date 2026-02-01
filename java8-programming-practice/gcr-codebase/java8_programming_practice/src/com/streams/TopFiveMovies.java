package com.streams;

import static java.util.Comparator.*;

import java.util.List;
//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
//import java.util.stream.Collector;
//Movies class
import java.util.stream.Collectors;

class Movies{
	String name;
	double rating;
	int releaseYear;
	
	
	public Movies(	String name,
	double rating,
	int releaseYear) {
		this.name=name;
		this.rating=rating;
		this.releaseYear=releaseYear;
	}
	
	@Override
	public String toString() {
		return this.name+" "+String.valueOf(this.rating)+" "+String.valueOf(this.releaseYear);
	}
}

//logic for access

public class TopFiveMovies {
	public static void main(String[] args) {
		//creating list to save then movies
		ArrayList<Movies> movies=new ArrayList<Movies>();
		
		//movies
		
		movies.add(new Movies("Inception", 8.8, 2010));
	    movies.add(new Movies("Interstellar", 8.6, 2014));
	    movies.add(new Movies("The Dark Knight", 9.0, 2008));
	    movies.add(new Movies("Parasite", 8.5, 2019));
	    movies.add(new Movies("Avengers: Endgame", 8.4, 2019));
	    movies.add(new Movies("Joker", 8.4, 2019));
	    movies.add(new Movies("Dune", 8.2, 2021));
	    movies.add(new Movies("Oppenheimer", 8.6, 2023));
	    movies.add(new Movies("Tenet", 7.8, 2020));
	    movies.add(new Movies("The Batman", 7.9, 2022));
	     
	        
	   //applying stream for extracting the logic
	    
	    List<Movies> finalMovies=movies.stream().filter(m->m.releaseYear>2015).sorted(comparing((Movies m)->m.rating,reverseOrder())
	    				
	    						.thenComparing((m)->m.releaseYear)).collect(Collectors.toList());
	    
	    //printing the movies
	    for(Movies m:finalMovies) {
	    	System.out.println(m);
	    }
		
	}
}
