package com.scenariobasedquestion.universitycourse;

import java.util.List;

// Postgraduate student
public class Postgraduate extends Student {
    public Postgraduate(String id, String name) {
        super(id, name);
    }

    public Postgraduate(String id, String name, List<String> electives) {
        super(id, name, electives);
    }
}
