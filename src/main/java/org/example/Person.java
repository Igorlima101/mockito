package org.example;

import java.time.LocalDate;

public class Person {

    private String name;
    private String document;
    private Integer age;
    private LocalDate birthDate;
    private Address address;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Person() {
    }

    public Person(String name, String document, LocalDate birthDate) {
        this.name = name;
        this.document = document;
        this.birthDate = birthDate;
    }

    public void addAddress(Address address){
        this.address = address;
    }
}
