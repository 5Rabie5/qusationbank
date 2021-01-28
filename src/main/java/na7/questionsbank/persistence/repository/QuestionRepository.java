package na7.questionsbank.persistence.repository;

import na7.questionsbank.persistence.domain.Question;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
//import java.util.Optional;

public interface QuestionRepository extends MongoRepository<Question, String> {
//    Optional<Question> findOneByIndex(Integer index);

    List<Question> findAllByType(String type);

    List<Question> findAllByTypeAndLevel(String type, Integer level);

//    List<Question> findByType(String type);

//    List<Question> findByLevel(Integer type);

//    List<Question> findByNameAndPrice(String sofa, double price);
//
//    List<Question> findByPriceLessThan(double price);
//
//    List<Question> findByPriceBetween(double price1, double price2);
//
//    List<Question> findByOrderByPriceAsc();
}
