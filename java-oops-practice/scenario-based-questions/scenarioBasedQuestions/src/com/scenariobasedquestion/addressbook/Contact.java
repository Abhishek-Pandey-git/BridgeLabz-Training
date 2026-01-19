package com.scenariobasedquestion.addressbook;

// Plain data holder for contact information
public class Contact {
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String city;
    private String state;
    private String zip;

    public Contact(String firstName, String lastName, String phone, String email, 
                   String city, String state, String zip) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return String.format("%s %s | Phone: %s | Email: %s | %s, %s %s",
                firstName, lastName, phone, email, city, state, zip);
    }
}
