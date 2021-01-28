package na7.questionsbank.logic;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import na7.questionsbank.persistence.domain.Question;
import na7.questionsbank.persistence.repository.QuestionRepository;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Component
@Service
@RequiredArgsConstructor
@ConfigurationProperties("info")
@Setter
@Getter

public class QuestionManger {

    private final QuestionRepository questionRepository;
    List<Question> questionsList = new ArrayList();
    Random rand = new Random();

    Question randQuestion(List<Question> list) {
        Random random = new Random();
        int randNum = random.ints(0, list.size() - 1)
                .findFirst()
                .getAsInt();
        Optional<Question> OQuestion = Optional.of(list.get(randNum));
        return OQuestion.get();
    }

    public Question save(Question question) {
        questionRepository.save(question);
        return question;
    }

    public Question getQuestion(String type) {
        questionsList = questionRepository.findAllByType(type);
        return randQuestion(questionsList);
    }

    public Question getQuestion(String type, Integer level) {
        questionsList = questionRepository.findAllByTypeAndLevel(type, level);
          return randQuestion(questionsList);
    }

    public Question getQuestion() {
        questionsList = questionRepository.findAll();
        return randQuestion(questionsList);
    }
}
