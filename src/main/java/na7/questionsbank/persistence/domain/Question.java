package na7.questionsbank.persistence.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Question {

    private String id;
    private String index;
    private String question;
    private String possibility1;
    private String possibility2;
    private String possibility3;
    private String possibility4;
    private String correctAnswer;
    private String style;
    private String type;
    private String level;
    private String resourceInfo;
    private String parameter1;
    private String parameter2;
}
