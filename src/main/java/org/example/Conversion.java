package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.example.clientInfo.ClientFindInfo;
import org.example.clientInfo.ClientInfo;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.example.clientInfo.Dul;
import org.example.personInfo.FindPersonInfo;
import org.example.personInfo.IdentityCard;
import org.example.personInfo.PersonInfo;
import org.example.personInfo.PersonName;

import java.io.File;
import java.io.IOException;

public class Conversion {

    public ClientInfo getClientInfoFromXmlFile() {
        XmlMapper xmlMapper = new XmlMapper();
        ClientInfo clientInfo;
        try {
            clientInfo = xmlMapper.readValue(new File("clientInfo.xml"), ClientInfo.class);
        } catch (IOException io) {
            throw new RuntimeException(io);
        }
        return clientInfo;
    }

    public void createJsonFileFromPersonInfo(PersonInfo personInfo) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
            File file = new File("PersonInfo.json");
            objectMapper.writeValue(file, personInfo);
        } catch (IOException io) {
            throw new RuntimeException(io);
        }
    }

    public void createPersonInfoFromClientInfo() {
        ClientInfo clientInfo = getClientInfoFromXmlFile();

        ClientFindInfo clientFindInfo = clientInfo.getClientFindInfo();
        Dul dul = clientFindInfo.getDul();
        int partyId = clientFindInfo.getPartyId();
        PersonName personName = new PersonName(dul.getLastName(), dul.getFirstName(), dul.getSecondName());
        IdentityCard identityCard = new IdentityCard(dul.getDocumentType(), dul.getSeries(), dul.getNumber());
        FindPersonInfo findPersonInfo = new FindPersonInfo(personName, identityCard, partyId);
        PersonInfo personInfo = new PersonInfo(findPersonInfo);

        createJsonFileFromPersonInfo(personInfo);
    }
}
