package pe.edu.upc.aaw.demoproyecto.dtos;

import pe.edu.upc.aaw.demoproyecto.entities.Membresia;
import pe.edu.upc.aaw.demoproyecto.entities.Pago;

public class AccountPayDTO {

    private int idPayAccount;

    private Membresia membresia;

    private Pago pago;

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
