package domain;

import javax.persistence.*;

@Entity
@Table(name = "MEMBER")
public class Member {
    @Id @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;

    private String name;


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
