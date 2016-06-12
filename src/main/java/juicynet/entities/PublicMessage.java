package main.java.juicynet.entities;

/*import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;*/

import java.io.Serializable;
import java.time.LocalDateTime;

/*@Entity
@Table(name = "PUBLIC_MSG")*/
public class PublicMessage implements Serializable {

    /*@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MESSAGE_ID")*/
    private Long id;

    /*@Column(name = "TEXT")*/
    private String text;

    /*@Column(name = "TIME")*/
    private LocalDateTime time;

    /*@Column(name = "THEME", nullable = false)*/
    private String theme;

    public PublicMessage() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }
}
