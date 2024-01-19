package org.example.clientInfo;

public class ClientFindInfo {
    private Dul dul;
    private int partyId;

    public ClientFindInfo() {}

    public Dul getDul() {
        return dul;
    }

    public int getPartyId() {
        return partyId;
    }

    @Override
    public String toString() {
        return "ClientFindInfo{" +
                "dul=" + dul +
                ", partyId=" + partyId +
                '}';
    }
}
