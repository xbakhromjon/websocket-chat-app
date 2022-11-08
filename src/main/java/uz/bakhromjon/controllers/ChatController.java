package uz.bakhromjon.controllers;

import org.springframework.messaging.handler.annotation.MessageExceptionHandler;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;
import uz.bakhromjon.models.ChatInMessage;
import uz.bakhromjon.models.ChatOutMessage;

/**
 * @author : Bakhromjon Khasanboyev
 * @since : 07/11/22, Mon, 21:33
 **/
@Controller
public class ChatController {


    @MessageMapping("/guestchat")  // here
    @SendTo("/topic/guestchats")  // here
    public ChatOutMessage handleMessaging(ChatInMessage message) throws Exception {
        Thread.sleep(1000); // simulated delay
        message = null;
        message.getMessage();
        return new ChatOutMessage(HtmlUtils.htmlEscape(message.getMessage()));
    }

    @MessageMapping("/guestupdate")
    @SendTo("/topic/guestupdates")
    public ChatOutMessage handleUserTyping(ChatInMessage message) throws Exception {
        return new ChatOutMessage("Someone is typing...");
    }

    @MessageMapping("/guestjoin")
    @SendTo("/topic/guestnames")
    public ChatOutMessage handleMemberJoins(ChatInMessage message) throws Exception {
        return new ChatOutMessage(message.getMessage());
    }

    @MessageExceptionHandler
    @SendTo("/topic/errors")
    public ChatOutMessage handleExcpetion(Throwable exception) {

        ChatOutMessage myError = new ChatOutMessage("An error happened.");
        return myError;
    }
}

