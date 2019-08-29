package fr.cesi.poec.Cinego.entities;

import lombok.*;

import javax.persistence.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

//JPA - DB Mapping
@Entity(name="users")
public class Users {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String email;
    @Column(name =  "motdepasse")
    private String password;
    public String getEmail(){return this.email;}
}
