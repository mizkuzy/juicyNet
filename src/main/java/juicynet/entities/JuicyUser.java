package juicynet.entities;


//import javax.persistence.*;

import lombok.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/*@Entity
@Table(name = "USERS")*/
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class JuicyUser implements Serializable {

    /*@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "HAPPY_USER_ID")*/
    @Getter
    @Setter
    private Long id;

    /*@Column(name = "NAME")*/
    @Getter
    @Setter
    private String name;

    /*@Column(name = "SURNAME")*/
    @Getter
    @Setter
    private String surname;

    /*@Column(name = "LOGIN")*/
    @Getter
    @Setter
    private String login;

    /*@Column(name = "EMAIL")*/
    @Getter
    @Setter
    private String email;

    /*@Column(name = "CITY")*/
    @Getter
    @Setter
    private String city;

    /*@Column(name = "ABOUT_USER")*/
    @Getter
    @Setter
    private String aboutUser;

    //@Column(name = "AVATAR")
    @Getter
    @Setter
    private String avatar;

    //@JoinColumn(name = "FRIENDS")//todo может join columns?
    /*@ManyToMany
    @JoinTable(name = "FRIENDS",
            joinColumns = {@JoinColumn(name = "HAPPY_USER_ID")},
            inverseJoinColumns = {@JoinColumn(name = "HAPPY_USER_ID")}
    )*/
    //@ForeignKey(name = "FK_SNT_FRIENDS", inverseName = "")
    @Getter
    @Setter
    private Set<JuicyUser> friends = new HashSet<JuicyUser>();

    /*@JoinColumn(name = "MESSAGES")
    @OneToMany*/
    @Getter
    @Setter
    private Set<PrivateMessage> messages = new HashSet<PrivateMessage>();//todo when this list should be initialized?
}
