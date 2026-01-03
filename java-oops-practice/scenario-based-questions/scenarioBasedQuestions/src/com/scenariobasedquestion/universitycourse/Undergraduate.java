package com.scenariobasedquestion.universitycourse;

import java.util.List;

// Undergraduate student
public class Undergraduate extends Student {
    public Undergraduate(String id, String name) {
        super(id, name);
    }

    public Undergraduate(String id, String name, List<String> electives) {
        super(id, name, electives);
    }
}
