package pe.edu.upc.aaw.demoproyecto.dtos;

import pe.edu.upc.aaw.demoproyecto.entities.Pago;

public class CardDTO {
    private int idCard;
    private String typeTarjeta;


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
