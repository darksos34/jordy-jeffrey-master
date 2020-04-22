package nl.prime.software.role.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor // No Args Constructor generated by Lombok
@Getter // Getters generated by Lombok
@Setter // Setters generated by Lombok
@Entity // Announce JPA entity
@Table(	name = "roles" )
public class Role {

    @Id // Database table key is the ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Create key value sequence
    private int id;

    @Enumerated(EnumType.STRING) // Stringify enumerated role names
    @Column(length = 20) // A role may consist of a maximum of 20 characters
    private ERole name;

}
