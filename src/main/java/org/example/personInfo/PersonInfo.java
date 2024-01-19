package org.example.personInfo;

import com.fasterxml.jackson.annotation.JsonProperty;


public class PersonInfo {
    private FindPersonInfo findPersonInfo;

    public PersonInfo(FindPersonInfo findPersonInfo) {
        this.findPersonInfo = findPersonInfo;
    }

    public PersonInfo() {
    }

    @JsonProperty("FindPersonInfo")
    public FindPersonInfo getFindPersonInfo() {
        return findPersonInfo;
    }

    @Override
    public String toString() {
        return "PersonInfo{" +
                "findPersonInfo=" + findPersonInfo +
                '}';
    }
}
