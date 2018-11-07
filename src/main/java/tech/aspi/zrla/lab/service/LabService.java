package tech.aspi.zrla.lab.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tech.aspi.zrla.lab.dao.LabRepository;
import tech.aspi.zrla.lab.model.Lab;

import javax.annotation.Resource;

@Service
public class LabService {

    @Resource
    private LabRepository labRepository;

    /**
     * save, update, delete方法需要绑定事务
     * 使用@Transactional进行事务绑定
     */

    // 保存数据
    @Transactional
    public void save(Lab lab){
        labRepository.save(lab);
    }

    // 删除数据
    @Transactional
    public void delete(int lab_id) {
        labRepository.delete(lab_id);
    }

    // 查询数据
    @Transactional
    public Iterable<Lab> findAll() {
        return labRepository.findAll();
    }

    @Transactional
    public Lab findOne(int lab_id){
        return labRepository.findOne(lab_id);
    }
}
