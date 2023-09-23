package pe.edu.upc.aaw.demoproyecto.dtos;

public class ContenidoPorListaDTO {
    private String nameListaDeReproduccion;
    private int quantityContenido;

    public String getNameListaDeReproduccion() {
        return nameListaDeReproduccion;
    }

    public void setNameListaDeReproduccion(String nameListaDeReproduccion) {
        this.nameListaDeReproduccion = nameListaDeReproduccion;
    }

    public int getQuantityContenido() {
        return quantityContenido;
    }
    public void setQuantityContenido(int quantityContenido) {
        this.quantityContenido = quantityContenido;
    }
}
