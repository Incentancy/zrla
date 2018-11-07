package tech.aspi.zrla.score.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Score {

    @Id
    private Long score_id;

    private String user_id;

    private Long sub_id;

    private double score_value;

    public Long getScore_id() {
        return score_id;
    }

    public void setScore_id(Long score_id) {
        this.score_id = score_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public Long getSub_id() {
        return sub_id;
    }

    public void setSub_id(Long sub_id) {
        this.sub_id = sub_id;
    }

    public double getScore_value() {
        return score_value;
    }

    public void setScore_value(double score_value) {
        this.score_value = score_value;
    }
}
