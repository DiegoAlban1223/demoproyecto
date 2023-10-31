package pe.edu.upc.aaw.demoproyecto.dtos;

import pe.edu.upc.aaw.demoproyecto.entities.Pago;

import java.util.Date;

public class CardDTO {
    private int idCard;
    private String typeTarjeta;
    private String nameTarjeta;
    private Date FechaVencimiento;
    private int CVV;


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

    public String getNameTarjeta() {
        return nameTarjeta;
    }

    public void setNameTarjeta(String nameTarjeta) {
        this.nameTarjeta = nameTarjeta;
    }

    public Date getFechaVencimiento() {
        return FechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        FechaVencimiento = fechaVencimiento;
    }

    public int getCVV() {
        return CVV;
    }

    public void setCVV(int CVV) {
        this.CVV = CVV;
    }
}
