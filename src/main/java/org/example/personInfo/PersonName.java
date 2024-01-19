package org.example.personInfo;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;

public class PersonName {
    private String lastName;
    private String firstName;
    private String middleName;

    public PersonName(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    @JsonProperty("LastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("FirstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("MiddleName")
    public String getMiddleName() {
        return middleName;
    }

    @Override
    public String toString() {
        return "PersonName{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", MiddleName='" + middleName + '\'' +
                '}';
    }
}
