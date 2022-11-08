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
public class ChatParticipant {
    private String firstName;
    private String lastName;
    private String shortName;
    private String participantType;
}
