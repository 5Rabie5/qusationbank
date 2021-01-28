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
    private int index;
    private String question;
    private List<String> possibility;
    private String correctAnswer;
    private String style;
    private String type;
    private int level;
    private String resourceInfo;
}
