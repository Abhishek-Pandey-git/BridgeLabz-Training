package com.lambdaexpression;

import java.util.Arrays;
import java.util.List;

class StudentRank {
    String name;
    int rank;
    
    StudentRank(String name, int rank) {
        this.name = name;
        this.rank = rank;
    }
    
    public String toString() {
        return name + "(Rank: " + rank + ")";
    }
}

public class StudentRankSorter {
    public static void main(String[] args) {
        List<StudentRank> students = Arrays.asList(
            new StudentRank("John", 5),
            new StudentRank("Alice", 2),
            new StudentRank("Bob", 8)
        );
        
        System.out.println("Before sorting: " + students);
        
        // Lambda to sort by rank
        students.sort((s1, s2) -> s1.rank - s2.rank);
        
        System.out.println("After sorting: " + students);
    }
}
