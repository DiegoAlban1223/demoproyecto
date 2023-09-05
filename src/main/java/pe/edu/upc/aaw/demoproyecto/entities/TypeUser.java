package pe.edu.upc.aaw.demoproyecto.entities;

import javax.persistence.*;

@Entity
@Table(name = "TypeUser")
public class TypeUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTypeUser;
    @Column(name = "typeTupeUser",nullable = false,length = 15)
    private String typeTypeUser;

    public TypeUser() {
    }

    public TypeUser(int idTypeUser, String typeTypeUser) {
        this.idTypeUser = idTypeUser;
        this.typeTypeUser = typeTypeUser;
    }

    public int getIdTypeUser() {
        return idTypeUser;
    }

    public void setIdTypeUser(int idTypeUser) {
        this.idTypeUser = idTypeUser;
    }

    public String getTypeTypeUser() {
        return typeTypeUser;
    }

    public void setTypeTypeUser(String typeTypeUser) {
        this.typeTypeUser = typeTypeUser;
    }
}
