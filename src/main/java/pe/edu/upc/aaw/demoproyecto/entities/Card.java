package pe.edu.upc.aaw.demoproyecto.entities;

import javax.persistence.*;

@Entity
@Table(name = "Card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCard;
    @Column
    private int typeTarjeta;

    @OneToOne
    @JoinColumn(name = "id")
    private Pago pago;

    public Card() {
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public int getTypeTarjeta() {
        return typeTarjeta;
    }

    public void setTypeTarjeta(int typeTarjeta) {
        this.typeTarjeta = typeTarjeta;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }
}
