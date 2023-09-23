package pe.edu.upc.aaw.demoproyecto.dtos;

import pe.edu.upc.aaw.demoproyecto.entities.Card;
import pe.edu.upc.aaw.demoproyecto.entities.Membresia;

import javax.persistence.*;
import java.time.LocalDate;

public class PagoDTO {
    private int id;
    private int quantityPago;
    private boolean payConfirmed;
    private LocalDate datePago;
    private Membresia membresia;
    private Card card;

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
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
}
