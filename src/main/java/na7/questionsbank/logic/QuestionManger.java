package na7.questionsbank.logic;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import na7.questionsbank.persistence.domain.Question;
import na7.questionsbank.persistence.repository.QuestionRepository;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
@RequiredArgsConstructor
@ConfigurationProperties("info")
@Setter
@Getter

public class QuestionManger {

    private  final QuestionRepository questionRepository;

    public Question save(Question question){
        questionRepository.save(question);
        return question;
    }


    public List<Question> getQuestions() {
       return questionRepository.findAll();
            }
}
