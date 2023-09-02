package pe.edu.upc.aaw.demoproyecto.dtos;

import java.time.LocalDate;

public class PagoDTO {
    private int id;
    private int quantityPago;
    private boolean payConfirmed;
    private LocalDate datePago;

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
