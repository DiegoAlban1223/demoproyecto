package pe.edu.upc.aaw.demoproyecto.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "Card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCard;
    @Column(name = "typeCard", nullable = false)
    private String typeCard;
    @Column(name = "nameCard", nullable = false)
    private String nameCard;
    @Column(name = "fechaVencimientoCard", nullable = false)
    private LocalDate fechaVencimientoCard;
    @Column(name = "cvvCard", nullable = false)
    private int cvvCard;


    public Card() {
    }

    public Card(int idCard, String typeCard, String nameCard, LocalDate fechaVencimientoCard, int cvvCard) {
        this.idCard = idCard;
        this.typeCard = typeCard;
        this.nameCard = nameCard;
        this.fechaVencimientoCard = fechaVencimientoCard;
        this.cvvCard = cvvCard;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public String getTypeCard() {
        return typeCard;
    }

    public void setTypeCard(String typeCard) {
        this.typeCard = typeCard;
    }

    public String getNameCard() {
        return nameCard;
    }

    public void setNameCard(String nameCard) {
        this.nameCard = nameCard;
    }

    public LocalDate getFechaVencimientoCard() {
        return fechaVencimientoCard;
    }

    public void setFechaVencimientoCard(LocalDate fechaVencimientoCard) {
        this.fechaVencimientoCard = fechaVencimientoCard;
    }

    public int getCvvCard() {
        return cvvCard;
    }

    public void setCvvCard(int cvvCard) {
        this.cvvCard = cvvCard;
    }
}
