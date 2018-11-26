package tech.aspi.zrla.bulletin.dao;

import org.springframework.data.repository.CrudRepository;
import tech.aspi.zrla.bulletin.model.Bulletin;

public interface BulletinRepository extends CrudRepository<Bulletin, Integer> {

    //Optional<Checkio> findById(ID stu_id);

    Iterable<Bulletin> findBulletinByLabId(int labId);
}
