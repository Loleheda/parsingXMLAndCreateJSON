package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.example.clientInfo.ClientInfo;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Conversion conversion = new Conversion();
        conversion.createPersonInfoFromClientInfo();
    }
}
