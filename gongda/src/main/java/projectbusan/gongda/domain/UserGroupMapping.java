package projectbusan.gongda.domain;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "group_tbl")
public class UserGroupMapping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name= "group_code")
    private Group group;
}
