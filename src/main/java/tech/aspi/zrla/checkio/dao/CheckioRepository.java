package tech.aspi.zrla.checkio.dao;

import org.springframework.data.repository.CrudRepository;
import tech.aspi.zrla.checkio.model.Checkio;

public interface CheckioRepository extends CrudRepository<Checkio, Integer> {

    //Optional<Checkio> findById(ID stu_id);
}
