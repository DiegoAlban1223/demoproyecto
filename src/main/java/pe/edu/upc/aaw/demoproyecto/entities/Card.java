package pe.edu.upc.aaw.demoproyecto.entities;

import javax.persistence.*;

@Entity
@Table(name = "Card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCard;
    @Column(name = "typeTarjeta", nullable = false)
    private String typeTarjeta;



    public Card() {
    }

    public Card(int idCard, String typeTarjeta) {
        this.idCard = idCard;
        this.typeTarjeta = typeTarjeta;

    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public String getTypeTarjeta() {
        return typeTarjeta;
    }

    public void setTypeTarjeta(String typeTarjeta) {
        this.typeTarjeta = typeTarjeta;
    }

}
