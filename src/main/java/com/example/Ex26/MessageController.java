package com.example.Ex26;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    private SimpMessagingTemplate template;

    public MessageController(SimpMessagingTemplate template) {
        this.template = template;
    }

    @MessageMapping("/message")
    public void broadcastMessage(@RequestBody MessageDTO message) {
        template.convertAndSend("/broadcast/broadcast-msg", message);
    }

    @MessageMapping("/client-message")
    @SendTo("/broadcast/broadcast-msg")
    public MessageDTO clientMessage(@RequestBody ClientMessageDTO clientMessage) {

        MessageDTO message = new MessageDTO();
        message.setSender(clientMessage.getClientName());
        message.setType(clientMessage.getClientAlert());
        message.setMessage(clientMessage.getClientMessage());

        return message;
    }
}
