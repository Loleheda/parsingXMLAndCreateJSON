package org.example.clientInfo;

public class Dul {
    private int documentType;
    private String firstName;
    private String lastName;
    private String secondName;
    private int number;
    private int series;

    public int getDocumentType() {
        return documentType;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getNumber() {
        return number;
    }

    public int getSeries() {
        return series;
    }

    @Override
    public String toString() {
        return "Dul{" +
                "documentType=" + documentType +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", number=" + number +
                ", series=" + series +
                '}';
    }
}
