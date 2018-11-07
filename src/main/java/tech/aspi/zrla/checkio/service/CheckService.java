package tech.aspi.zrla.checkio.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tech.aspi.zrla.checkio.dao.CheckioRepository;
import tech.aspi.zrla.checkio.model.Checkio;

import javax.annotation.Resource;

@Service
public class CheckService {

    @Resource
    private CheckioRepository checkioRepository;

    /**
     * save, update, delete方法需要绑定事务
     * 使用@Transactional进行事务绑定
     */

    // 保存数据
    @Transactional
    public void save(Checkio checkio){
        checkioRepository.save(checkio);
    }

    // 删除数据
    @Transactional
    public void delete(int check_id) {
        checkioRepository.delete(check_id);
    }

    // 查询数据
    @Transactional
    public Iterable<Checkio> findAll() {
        return checkioRepository.findAll();
    }

    @Transactional
    public Checkio findOne(int check_id){
        return checkioRepository.findOne(check_id);
    }

}
