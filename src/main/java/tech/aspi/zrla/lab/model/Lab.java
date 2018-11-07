package tech.aspi.zrla.lab.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Lab {

    @Id
    private int lab_id;

    private String lab_name;

    private String lab_manager_id;

    public int getLab_id() {
        return lab_id;
    }

    public void setLab_id(int lab_id) {
        this.lab_id = lab_id;
    }

    public String getLab_name() {
        return lab_name;
    }

    public void setLab_name(String lab_name) {
        this.lab_name = lab_name;
    }

    public String getLab_manager_id() {
        return lab_manager_id;
    }

    public void setLab_manager_id(String lab_manager_id) {
        this.lab_manager_id = lab_manager_id;
    }
}
