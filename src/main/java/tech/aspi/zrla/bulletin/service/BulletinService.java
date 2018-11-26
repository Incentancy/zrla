package tech.aspi.zrla.bulletin.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tech.aspi.zrla.bulletin.dao.BulletinRepository;
import tech.aspi.zrla.bulletin.model.Bulletin;

import javax.annotation.Resource;

@Service
public class BulletinService {

    @Resource
    private BulletinRepository bulletinRepository;

    /**
     * save, update, delete方法需要绑定事务
     * 使用@Transactional进行事务绑定
     */

    // 保存数据
    @Transactional
    public void save(Bulletin bulletin){
        bulletinRepository.save(bulletin);
    }

    // 删除数据
    @Transactional
    public void delete(int bull_id) {
        bulletinRepository.delete(bull_id);
    }

    // 查询数据
    @Transactional
    public Iterable<Bulletin> findAll() {
        return bulletinRepository.findAll();
    }

    @Transactional
    public Bulletin findOne(int bull_id){
        return bulletinRepository.findOne(bull_id);
    }

    // 按实验室Id查询公告数据
    @Transactional
    public Iterable<Bulletin> findBulletinByLabId(int labId) {
        return bulletinRepository.findBulletinByLabId(labId);
    }

}
