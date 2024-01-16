package org.example;

import java.time.LocalDate;

public class PersonRegister {

    private MailServiceApi mailServiceApi;

    public PersonRegister(final MailServiceApi mailServiceApi){
        this.mailServiceApi = mailServiceApi;
    }

    public Person registerPersonAddress(String name, String document, LocalDate birthDate, String zipcode){
        Person person = new Person(name, document, birthDate);
        Address address = mailServiceApi.findPersonZipcode(zipcode);
        person.addAddress(address);
        return person;
    }
}
