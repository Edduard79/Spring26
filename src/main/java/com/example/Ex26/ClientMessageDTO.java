package com.example.Ex26;

import org.springframework.stereotype.Component;

@Component
public class ClientMessageDTO {

    private String clientName;
    private String clientAlert;
    private String clientMessage;

    public ClientMessageDTO() {
    }

    public ClientMessageDTO(String clientName, String clientAlert, String clientMessage) {
        this.clientName = clientName;
        this.clientAlert = clientAlert;
        this.clientMessage = clientMessage;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientAlert() {
        return clientAlert;
    }

    public void setClientAlert(String clientAlert) {
        this.clientAlert = clientAlert;
    }

    public String getClientMessage() {
        return clientMessage;
    }

    public void setClientMessage(String clientMessage) {
        this.clientMessage = clientMessage;
    }
}
