package com.example.addressbook.model;

public class Contact {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    /**
     * A simple model class representing a contact with a first name, last name, email, and phone number.
     */
    public Contact(String firstName, String lastName, String email, String phone) {
        /**
         * Constructs a new Contact with the specified first name, last name, email, and phone number.
         * @param firstName The first name of the contact
         * @param lastName The last name of the contact
         * @param email The email of the contact
         * @param phone The phone number of the contact
         */
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    public int getId() {
        /**
         * Gets the id of the contact
         * @param id The id of the contact
         */
        return id;
    }

    public void setId(int id) {
        /**
         * Sets the id of the contact
         */
        this.id = id;
    }

    public String getFirstName() {
        /**
         * Gets the firstname of the contact
         */
        return firstName;
    }

    public void setFirstName(String firstName) {
        /**
         * Sets the firstname of the contact
         */
        this.firstName = firstName;
    }

    public String getLastName() {
        /**
         * Gets the Lastname of the contact
         */
        return lastName;
    }

    public void setLastName(String lastName) {
        /**
         * Sets the Lastname of the contact
         */
        this.lastName = lastName;
    }

    public String getEmail() {
        /**
         * Gets the email of the contact
         */
        return email;
    }

    public void setEmail(String email) {
        /**
         * Sets the email of the contact
         */
        this.email = email;
    }

    public String getPhone() {
        /**
         * Gets the Phone Number of the contact
         */
        return phone;
    }

    public void setPhone(String phone) {
        /**
         * Sets the Phone Number of the contact
         */
        this.phone = phone;
    }

    public String getFullName() {
        /**
         * Gets the Full name of the contact
         */
        return firstName + " " + lastName;
    }
}