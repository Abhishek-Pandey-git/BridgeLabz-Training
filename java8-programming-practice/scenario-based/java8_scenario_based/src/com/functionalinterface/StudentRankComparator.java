package com.functionalinterface;

import java.util.Comparator;

class StudentRank {
    String name;
    int rank;
    
    StudentRank(String name, int rank) {
        this.name = name;
        this.rank = rank;
    }
}

public class StudentRankComparator {
    public static void main(String[] args) {
        StudentRank s1 = new StudentRank("Alice", 5);
        StudentRank s2 = new StudentRank("Bob", 3);
        
        // Comparator to compare by rank
        Comparator<StudentRank> rankComparator = (st1, st2) -> Integer.compare(st1.rank, st2.rank);
        
        int result = rankComparator.compare(s1, s2);
        System.out.println(result > 0 ? s1.name + " has lower rank" : s2.name + " has lower rank");
    }
}
