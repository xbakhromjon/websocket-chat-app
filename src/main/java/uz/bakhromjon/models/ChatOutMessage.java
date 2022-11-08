package uz.bakhromjon.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ChatOutMessage {
    private String content;
    private String groupName;
    private Date timestamp;

    public ChatOutMessage(String content) {
        this.content = content;
    }
}
