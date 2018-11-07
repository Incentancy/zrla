package tech.aspi.zrla.lab.dao;

import org.springframework.data.repository.CrudRepository;
import tech.aspi.zrla.lab.model.Lab;

public interface LabRepository extends CrudRepository<Lab, Integer> {

    //Optional<Checkio> findById(ID stu_id);
}
