package pe.edu.upc.aaw.demoproyecto.entities;

import javax.persistence.*;

@Entity
@Table(name="AccountPay")

public class AccountPay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPayAccount;

    @ManyToOne
    @JoinColumn(name="idMembresia")
    private Membresia membresia;

    @ManyToOne
    @JoinColumn(name="id")
    private Pago pago;

    public AccountPay() {
    }

    public int getIdPayAccount() {
        return idPayAccount;
    }

    public void setIdPayAccount(int idPayAccount) {
        this.idPayAccount = idPayAccount;
    }

    public Membresia getMembresia() {
        return membresia;
    }

    public void setMembresia(Membresia membresia) {
        this.membresia = membresia;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }
}
