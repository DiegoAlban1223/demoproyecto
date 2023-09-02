package pe.edu.upc.aaw.demoproyecto.dtos;

import java.time.LocalDate;

public class DispositivoDTO {
    private int idDispositivo;
    private String nameDispositivo;
    private String typeDispositivo;
    private String brandDispositivo;
    private String modelDispositivo;
    private LocalDate dateRegistro;
    private int account_id;

    public int getIdDispositivo() {
        return idDispositivo;
    }

    public void setIdDispositivo(int idDispositivo) {
        this.idDispositivo = idDispositivo;
    }

    public String getNameDispositivo() {
        return nameDispositivo;
    }

    public void setNameDispositivo(String nameDispositivo) {
        this.nameDispositivo = nameDispositivo;
    }

    public String getTypeDispositivo() {
        return typeDispositivo;
    }

    public void setTypeDispositivo(String typeDispositivo) {
        this.typeDispositivo = typeDispositivo;
    }

    public String getBrandDispositivo() {
        return brandDispositivo;
    }

    public void setBrandDispositivo(String brandDispositivo) {
        this.brandDispositivo = brandDispositivo;
    }

    public String getModelDispositivo() {
        return modelDispositivo;
    }

    public void setModelDispositivo(String modelDispositivo) {
        this.modelDispositivo = modelDispositivo;
    }

    public LocalDate getDateRegistro() {
        return dateRegistro;
    }

    public void setDateRegistro(LocalDate dateRegistro) {
        this.dateRegistro = dateRegistro;
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }
}
