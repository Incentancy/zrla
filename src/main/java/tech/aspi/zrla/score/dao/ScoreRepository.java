package tech.aspi.zrla.score.dao;

import org.springframework.data.repository.CrudRepository;
import tech.aspi.zrla.score.model.Score;

public interface ScoreRepository extends CrudRepository<Score, Long> {

    //Optional<Checkio> findById(ID stu_id);
}
