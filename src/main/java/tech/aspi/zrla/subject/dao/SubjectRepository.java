package tech.aspi.zrla.subject.dao;

import org.springframework.data.repository.CrudRepository;
import tech.aspi.zrla.subject.model.Subject;

public interface SubjectRepository extends CrudRepository<Subject, Long> {

    //Optional<Checkio> findById(ID stu_id);
}
