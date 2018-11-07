package tech.aspi.zrla.bulletin.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class Bulletin {

    @Id
    @GeneratedValue
    private int bull_id;

    private String bull_title;

    private String bull_publisher_id;

    private Date bull_published_date;

    private String bull_tags;

    private String bull_img;            // 存储图像路径

    private String bull_markdown_path;  // 存储markdown路径

    public int getBull_id() {
        return bull_id;
    }

    public void setBull_id(int bull_id) {
        this.bull_id = bull_id;
    }

    public String getBull_title() {
        return bull_title;
    }

    public void setBull_title(String bull_title) {
        this.bull_title = bull_title;
    }

    public String getBull_publisher_id() {
        return bull_publisher_id;
    }

    public void setBull_publisher_id(String bull_publisher_id) {
        this.bull_publisher_id = bull_publisher_id;
    }

    public Date getBull_published_date() {
        return bull_published_date;
    }

    public void setBull_published_date(Date bull_published_date) {
        this.bull_published_date = bull_published_date;
    }

    public String getBull_tags() {
        return bull_tags;
    }

    public void setBull_tags(String bull_tags) {
        this.bull_tags = bull_tags;
    }

    public String getBull_img() {
        return bull_img;
    }

    public void setBull_img(String bull_img) {
        this.bull_img = bull_img;
    }

    public String getBull_markdown_path() {
        return bull_markdown_path;
    }

    public void setBull_markdown_path(String bull_markdown_path) {
        this.bull_markdown_path = bull_markdown_path;
    }
}
