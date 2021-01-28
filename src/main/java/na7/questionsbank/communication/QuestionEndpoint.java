package na7.questionsbank.communication;

import lombok.RequiredArgsConstructor;
import na7.questionsbank.logic.QuestionManger;
import na7.questionsbank.persistence.domain.Question;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
@RequiredArgsConstructor

public class QuestionEndpoint {
private final QuestionManger questionManger;

    @GetMapping
    Question getQuestion(){
        return  questionManger.getQuestion();
           }
    @GetMapping("/{type}")
    Question getQuestion(@PathVariable String type){
        return  questionManger.getQuestion(type);
    }

    @GetMapping("/{type}/{level}")
    Question getQuestion(@PathVariable String type,@PathVariable Integer level){
        return  questionManger.getQuestion(type,level);
    }

    @PostMapping
    Question post(@RequestBody Question question) {
      questionManger.save(question);
        return question;
    }

}
