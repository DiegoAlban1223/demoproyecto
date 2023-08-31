package pe.edu.upc.aaw.demoproyecto.entities;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Pago")
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Cantidad_Pago",nullable = false)
    private int Cantidad_Pago;
    @Column(name = "Confirmar_Pago",nullable = false)
    private boolean Confirmar_pago;
    @Column(name = "Fecha_Pago",nullable = false)
    private LocalDate Fecha_Pago;

    public Pago() {}

    public Pago(int id, int cantidad_Pago, boolean confirmar_pago, LocalDate fecha_Pago) {
        this.id = id;
        Cantidad_Pago = cantidad_Pago;
        Confirmar_pago = confirmar_pago;
        Fecha_Pago = fecha_Pago;
    }

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

    public boolean isConfirmar_pago() {
        return Confirmar_pago;
    }

    public void setConfirmar_pago(boolean confirmar_pago) {
        Confirmar_pago = confirmar_pago;
    }

    public LocalDate getFecha_Pago() {
        return Fecha_Pago;
    }

    public void setFecha_Pago(LocalDate fecha_Pago) {
        Fecha_Pago = fecha_Pago;
    }
}
