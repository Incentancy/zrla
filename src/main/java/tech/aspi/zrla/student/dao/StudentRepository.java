package tech.aspi.zrla.student.dao;

import com.sun.xml.internal.bind.v2.model.core.ID;
import org.springframework.data.repository.CrudRepository;
import tech.aspi.zrla.student.model.Student;

import java.util.Optional;

public interface StudentRepository extends CrudRepository<Student, String> {

    //Optional<Checkio> findById(ID stu_id);
}
