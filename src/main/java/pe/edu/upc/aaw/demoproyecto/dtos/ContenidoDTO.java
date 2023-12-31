package pe.edu.upc.aaw.demoproyecto.dtos;

import pe.edu.upc.aaw.demoproyecto.entities.ListaDeReproduccion;

import javax.persistence.*;
import java.time.LocalDate;

public class ContenidoDTO {

    private int idContenido;
    private String titleContenido;
    private String descripContenido;
    private LocalDate yearContenido;
    private String directorContenido;
    private String typeContenido;
    private String genderContenido;
    private  String originCountryContenido;
    private String urlContenido;
    private String urlImageContenido;
    private String languageContenido;

    public int getIdContenido() {
        return idContenido;
    }

    public void setIdContenido(int idContenido) {
        this.idContenido = idContenido;
    }

    public String getTitleContenido() {
        return titleContenido;
    }

    public void setTitleContenido(String titleContenido) {
        this.titleContenido = titleContenido;
    }

    public String getDescripContenido() {
        return descripContenido;
    }

    public void setDescripContenido(String descripContenido) {
        this.descripContenido = descripContenido;
    }

    public LocalDate getYearContenido() {
        return yearContenido;
    }

    public void setYearContenido(LocalDate yearContenido) {
        this.yearContenido = yearContenido;
    }

    public String getDirectorContenido() {
        return directorContenido;
    }

    public void setDirectorContenido(String directorContenido) {
        this.directorContenido = directorContenido;
    }

    public String getTypeContenido() {
        return typeContenido;
    }

    public void setTypeContenido(String typeContenido) {
        this.typeContenido = typeContenido;
    }

    public String getGenderContenido() {
        return genderContenido;
    }

    public void setGenderContenido(String genderContenido) {
        this.genderContenido = genderContenido;
    }

    public String getOriginCountryContenido() {
        return originCountryContenido;
    }

    public void setOriginCountryContenido(String originCountryContenido) {
        this.originCountryContenido = originCountryContenido;
    }

    public String getUrlContenido() {
        return urlContenido;
    }

    public void setUrlContenido(String urlContenido) {
        this.urlContenido = urlContenido;
    }

    public String getLanguageContenido() {
        return languageContenido;
    }

    public void setLanguageContenido(String languageContenido) {
        this.languageContenido = languageContenido;
    }


    public String getUrlImageContenido() {
        return urlImageContenido;
    }

    public void setUrlImageContenido(String urlImageContenido) {
        this.urlImageContenido = urlImageContenido;
    }
}
