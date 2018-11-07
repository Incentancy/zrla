package tech.aspi.zrla.lab.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.aspi.zrla.lab.model.Lab;
import tech.aspi.zrla.lab.service.LabService;

import javax.annotation.Resource;


@RestController
@RequestMapping("/lab")
public class LabController {

    @Resource
    private LabService labService;

    //保存数据
    @PostMapping("/save")
    public String save(Lab lab){
        labService.save(lab);
        return "SUCCESS";
    }

    @PostMapping("/delete")
    public String delete(int lab_id){
        labService.delete(lab_id);
        return "SUCCESS";
    }

    @GetMapping("/findall")
    public Iterable<Lab> findAll(){
        return labService.findAll();
    }

    @GetMapping("/findbyid")
    public Lab findOne(int lab_id){
        return labService.findOne(lab_id);
    }
}
