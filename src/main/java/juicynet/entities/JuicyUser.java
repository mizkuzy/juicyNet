/*
package juicynet.entities;


//import javax.persistence.*;

import lombok.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

*/
/*@Entity
@Table(name = "USERS")*//*

public @Data class JuicyUser implements Serializable {

    */
/*@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "HAPPY_USER_ID")*//*

    private Long id;

    */
/*@Column(name = "NAME")*//*

    private String name;

    */
/*@Column(name = "SURNAME")*//*

    private String surname;

    */
/*@Column(name = "LOGIN")*//*

    private String login;

    */
/*@Column(name = "EMAIL")*//*

    private String email;

    */
/*@Column(name = "CITY")*//*

    private String city;

    */
/*@Column(name = "ABOUT_USER")*//*

    private String aboutUser;

    //@Column(name = "AVATAR")
    private String avatar;

    //@JoinColumn(name = "FRIENDS")//todo может join columns?
    */
/*@ManyToMany
    @JoinTable(name = "FRIENDS",
            joinColumns = {@JoinColumn(name = "HAPPY_USER_ID")},
            inverseJoinColumns = {@JoinColumn(name = "HAPPY_USER_ID")}
    )*//*

    //@ForeignKey(name = "FK_SNT_FRIENDS", inverseName = "")
    private Set<JuicyUser> friends = new HashSet<JuicyUser>();

    */
/*@JoinColumn(name = "MESSAGES")
    @OneToMany*//*

    private Set<PrivateMessage> messages = new HashSet<PrivateMessage>();//todo when this list should be initialized?
}
*/
