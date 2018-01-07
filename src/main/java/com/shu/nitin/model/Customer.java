package com.shu.nitin.model;

public class Customer {

    private String customerId;

    private String firstName;

    private String lastName;

    public Customer(String customerId, String firstName, String lastName) {
        super();
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

}
