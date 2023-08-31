package pe.edu.upc.aaw.demoproyecto.dtos;

import java.time.LocalDate;

public class PagoDTO {
    private int id;
    private int Cantidad_Pago;
    private boolean Confirmar_Pago;
    private LocalDate Fecha_Pago;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad_Pago() {
        return Cantidad_Pago;
    }

    public void setCantidad_Pago(int cantidad_Pago) {
        Cantidad_Pago = cantidad_Pago;
    }

    public boolean isConfirmar_Pago() {
        return Confirmar_Pago;
    }

    public void setConfirmar_Pago(boolean confirmar_Pago) {
        Confirmar_Pago = confirmar_Pago;
    }

    public LocalDate getFecha_Pago() {
        return Fecha_Pago;
    }

    public void setFecha_Pago(LocalDate fecha_Pago) {
        Fecha_Pago = fecha_Pago;
    }
}
