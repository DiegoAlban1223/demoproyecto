package pe.edu.upc.aaw.demoproyecto.entities;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Pago")
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "quantityPago",nullable = false)
    private int quantityPago;
    @Column(name = "payConfirmed",nullable = false)
    private boolean payConfirmed;
    @Column(name = "datePago",nullable = false)
    private LocalDate datePago;

    public Pago() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantityPago() {
        return quantityPago;
    }

    public void setQuantityPago(int quantityPago) {
        this.quantityPago = quantityPago;
    }

    public boolean isPayConfirmed() {
        return payConfirmed;
    }

    public void setPayConfirmed(boolean payConfirmed) {
        this.payConfirmed = payConfirmed;
    }

    public LocalDate getDatePago() {
        return datePago;
    }

    public void setDatePago(LocalDate datePago) {
        this.datePago = datePago;
    }
}
