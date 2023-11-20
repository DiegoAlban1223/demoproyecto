package pe.edu.upc.aaw.demoproyecto.entities;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

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

        @ManyToOne
        @JoinColumn(name = "idMembresia")
        private Membresia membresia;

        @ManyToOne
        @JoinColumn(name = "idCard")
        private Card card;




    public Pago() {
    }

    public Pago(int id, int quantityPago, boolean payConfirmed, LocalDate datePago, Membresia membresia, Card card) {
        this.id = id;
        this.quantityPago = quantityPago;
        this.payConfirmed = payConfirmed;
        this.datePago = datePago;
        this.membresia = membresia;
        this.card = card;
    }

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

    public Membresia getMembresia() {
        return membresia;
    }

    public void setMembresia(Membresia membresia) {
        this.membresia = membresia;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
