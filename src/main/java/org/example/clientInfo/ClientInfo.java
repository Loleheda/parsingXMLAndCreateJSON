package org.example.clientInfo;

import org.example.clientInfo.ClientFindInfo;

public class ClientInfo {
    private ClientFindInfo clientFindInfo;

    public ClientInfo() {}

    public ClientFindInfo getClientFindInfo() {
        return clientFindInfo;
    }

    @Override
    public String toString() {
        return "ClientInfo{" +
                "clientFindInfo=" + clientFindInfo +
                '}';
    }
}
