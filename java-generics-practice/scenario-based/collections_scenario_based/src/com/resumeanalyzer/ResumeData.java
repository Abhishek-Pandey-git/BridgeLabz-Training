package com.resumeanalyzer;

import java.util.List;

public class ResumeData {
    private String name;
    private String email;
    private String phone;
    private List<String> keywords;
    private int keywordCount;

    public ResumeData(String name, String email, String phone, List<String> keywords) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.keywords = keywords;
        this.keywordCount = keywords.size();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public int getKeywordCount() {
        return keywordCount;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Email: " + email + ", Phone: " + phone + 
               ", Keywords: " + keywords + ", Count: " + keywordCount;
    }
}
