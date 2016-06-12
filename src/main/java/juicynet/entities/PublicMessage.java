package juicynet.entities;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
//import java.time.LocalDateTime;

/*@Entity
@Table(name = "PUBLIC_MSG")*/
public class PublicMessage implements Serializable {

    /*@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MESSAGE_ID")*/
    @Getter
    @Setter
    private Long id;

    /*@Column(name = "TEXT")*/
    @Getter
    @Setter
    private String text;

    /*@Column(name = "TIME")*/
    // private LocalDateTime time;

    /*@Column(name = "THEME", nullable = false)*/
    @Getter
    @Setter
    private String theme;
}
