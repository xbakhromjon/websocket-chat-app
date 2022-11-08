package uz.bakhromjon.models;
import java.util.Date;

/**
 * @author : Bakhromjon Khasanboyev
 * @since : 07/11/22, Mon, 21:22
 **/
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ChatInMessage {
    private String senderID;
    private String senderName;
    private String message;
    private Date timestamp;
}
