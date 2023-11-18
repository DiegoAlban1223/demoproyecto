package pe.edu.upc.aaw.demoproyecto.dtos;

public class CantidadDeClientesActivosDTO {
    private Long cantidad_usuarios_activos;
    private Long cantidad_usuarios_inactivos;

    public Long getCantidad_usuarios_activos() {
        return cantidad_usuarios_activos;
    }

    public void setCantidad_usuarios_activos(Long cantidad_usuarios_activos) {
        this.cantidad_usuarios_activos = cantidad_usuarios_activos;
    }

    public Long getCantidad_usuarios_inactivos() {
        return cantidad_usuarios_inactivos;
    }

    public void setCantidad_usuarios_inactivos(Long cantidad_usuarios_inactivos) {
        this.cantidad_usuarios_inactivos = cantidad_usuarios_inactivos;
    }
}
