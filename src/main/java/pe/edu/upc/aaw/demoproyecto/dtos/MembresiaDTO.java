package pe.edu.upc.aaw.demoproyecto.dtos;

public class MembresiaDTO {

    private int idMembresia;
    private String typeMembresia;
    private String descripMembresia;
    private int priceMembresia;
    private int idUsuario;

    public int getIdMembresia() {
        return idMembresia;
    }

    public void setIdMembresia(int idMembresia) {
        this.idMembresia = idMembresia;
    }

    public String getTypeMembresia() {
        return typeMembresia;
    }

    public void setTypeMembresia(String typeMembresia) {
        this.typeMembresia = typeMembresia;
    }

    public String getDescripMembresia() {
        return descripMembresia;
    }

    public void setDescripMembresia(String descripMembresia) {
        this.descripMembresia = descripMembresia;
    }

    public int getPriceMembresia() {
        return priceMembresia;
    }

    public void setPriceMembresia(int priceMembresia) {
        this.priceMembresia = priceMembresia;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}
