/*
package juicynet.entities;

import lombok.*;

import java.io.Serializable;
//import java.time.LocalDateTime;

*/
/*@Entity
@Table(name = "PRIVATE MSG_MSG")*//*

@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class PrivateMessage implements Serializable {

    */
/*@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "MESSAGE_ID")*//*

    @Getter
    @Setter
    private Long id;

    */
/*@Column(name = "USER1")*//*

    @Getter
    @Setter
    private JuicyUser user1;

    */
/*@Column(name = "USER2")*//*

    @Getter
    @Setter
    private JuicyUser user2;

    */
/*@Column(name = "TEXT")*//*

    @Getter
    @Setter
    private String text;

    */
/*@Column(name = "TIME")*//*

    //private LocalDateTime time;

}
*/
