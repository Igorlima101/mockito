package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SendMessage {

    private List<Message> messageList = new ArrayList<>();

    public void addMessage(Message message){
        this.messageList.add(message);
    }

    public List<Message> getMessage(){
        return Collections.unmodifiableList(this.messageList);
    }
}
