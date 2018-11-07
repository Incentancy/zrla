package tech.aspi.zrla.checkio.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Checkio {

    @Id
    private int check_id;

    private String user_id;

    private short check_type;

    private Date check_time;

    private String check_loc;

    public int getCheck_id() {
        return check_id;
    }

    public void setCheck_id(int check_id) {
        this.check_id = check_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public short getCheck_type() {
        return check_type;
    }

    public void setCheck_type(short check_type) {
        this.check_type = check_type;
    }

    public Date getCheck_time() {
        return check_time;
    }

    public void setCheck_time(Date check_time) {
        this.check_time = check_time;
    }

    public String getCheck_loc() {
        return check_loc;
    }

    public void setCheck_loc(String check_loc) {
        this.check_loc = check_loc;
    }
}
