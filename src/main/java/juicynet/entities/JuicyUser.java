package main.java.juicynet.entities;


//import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/*@Entity
@Table(name = "USERS")*/
public class JuicyUser implements Serializable {

    /*@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "HAPPY_USER_ID")*/
    private Long id;

    /*@Column(name = "NAME")*/
    private String name;

    /*@Column(name = "SURNAME")*/
    private String surname;

    /*@Column(name = "LOGIN")*/
    private String login;

    /*@Column(name = "EMAIL")*/
    private String email;

    /*@Column(name = "CITY")*/
    private String city;

    /*@Column(name = "ABOUT_USER")*/
    private String aboutUser;

    //@Column(name = "AVATAR")
    private String avatar;

    public JuicyUser() {
    }

    //@JoinColumn(name = "FRIENDS")//todo может join columns?
    /*@ManyToMany
    @JoinTable(name = "FRIENDS",
            joinColumns = {@JoinColumn(name = "HAPPY_USER_ID")},
            inverseJoinColumns = {@JoinColumn(name = "HAPPY_USER_ID")}
    )*/
    //@ForeignKey(name = "FK_SNT_FRIENDS", inverseName = "")
    private Set<JuicyUser> friends = new HashSet<>();

    /*@JoinColumn(name = "MESSAGES")
    @OneToMany*/
    private Set<PrivateMessage> messages = new HashSet<PrivateMessage>();//todo when this list should be initialized?

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAboutUser() {
        return aboutUser;
    }

    public void setAboutUser(String aboutUser) {
        this.aboutUser = aboutUser;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Set<PrivateMessage> getMessages() {
        return messages;
    }

    public void setMessages(Set<PrivateMessage> messages) {
        this.messages = messages;
    }

    public Set<JuicyUser> getFriends() {
        return friends;
    }

    public void setFriends(Set<JuicyUser> friends) {
        this.friends = friends;
    }
}
