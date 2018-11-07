package tech.aspi.zrla.subject.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Subject {

    @Id
    private long sub_id;

    private String sub_name;

    private Date sub_in_time;

    public long getSub_id() {
        return sub_id;
    }

    public void setSub_id(long sub_id) {
        this.sub_id = sub_id;
    }

    public String getSub_name() {
        return sub_name;
    }

    public void setSub_name(String sub_name) {
        this.sub_name = sub_name;
    }

    public Date getSub_in_time() {
        return sub_in_time;
    }

    public void setSub_in_time(Date sub_in_time) {
        this.sub_in_time = sub_in_time;
    }
}
