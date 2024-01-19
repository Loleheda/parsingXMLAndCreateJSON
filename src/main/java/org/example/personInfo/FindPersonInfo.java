package org.example.personInfo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FindPersonInfo {
    private PersonName personName;
    private IdentityCard identityCard;
    private int partyId;

    public FindPersonInfo(PersonName personName, IdentityCard identityCard, int partyId) {
        this.personName = personName;
        this.identityCard = identityCard;
        this.partyId = partyId;
    }

    @JsonProperty("PersonName")
    public PersonName getPersonName() {
        return personName;
    }

    @JsonProperty("IdentityCard")
    public IdentityCard getIdentityCard() {
        return identityCard;
    }

    @JsonProperty("PartyId")
    public int getPartyId() {
        return partyId;
    }

    @Override
    public String toString() {
        return "FindPersonInfo{" +
                "personName=" + personName +
                ", identityCard=" + identityCard +
                ", partyId=" + partyId +
                '}';
    }
}
