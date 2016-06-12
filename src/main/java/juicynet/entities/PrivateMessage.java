package main.java.juicynet.entities;

/*import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;*/

import java.io.Serializable;
import java.time.LocalDateTime;

/*@Entity
@Table(name = "PRIVATE MSG_MSG")*/
public class PrivateMessage implements Serializable {

    /*@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "MESSAGE_ID")*/
    private Long id;

    /*@Column(name = "USER1")*/
    private JuicyUser user1;

    /*@Column(name = "USER2")*/
    private JuicyUser user2;

    /*@Column(name = "TEXT")*/
    private String text;

    /*@Column(name = "TIME")*/
    private LocalDateTime time;

    public PrivateMessage() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public JuicyUser getUser1() {
        return user1;
    }

    public void setUser1(JuicyUser user1) {
        this.user1 = user1;
    }

    public JuicyUser getUser2() {
        return user2;
    }

    public void setUser2(JuicyUser user2) {
        this.user2 = user2;
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
}
