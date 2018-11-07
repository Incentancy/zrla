package tech.aspi.zrla.checkio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.aspi.zrla.checkio.model.Checkio;
import tech.aspi.zrla.checkio.service.CheckService;

import javax.annotation.Resource;


@RestController
@RequestMapping("/check")
public class CheckController {

    @Resource
    private CheckService checkService;

    //保存数据
    @PostMapping("/save")
    public String save(Checkio checkio){
        checkService.save(checkio);
        return "SUCCESS";
    }

    @PostMapping("/delete")
    public String delete(int check_id){
        checkService.delete(check_id);
        return "SUCCESS";
    }

    @GetMapping("/findall")
    public Iterable<Checkio> findAll(){
        return checkService.findAll();
    }

    @GetMapping("/findbyid")
    public Checkio findOne(int check_id){
        return checkService.findOne(check_id);
    }
}
