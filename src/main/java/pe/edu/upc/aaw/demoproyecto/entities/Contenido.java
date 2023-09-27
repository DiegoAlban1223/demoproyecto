package pe.edu.upc.aaw.demoproyecto.entities;

import javax.persistence.*;

@Entity
@Table(name ="Contenido")
public class Contenido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContenido;
    @Column(name = "titleContenido",nullable = false,length = 45)
    private String titleContenido;
    @Column(name = "descripContenido",nullable = false,length = 60)
    private String descripContenido;

    @Column(name = "yearContenido",nullable = false,length = 45)
    private int yearContenido;
    @Column(name = "directorContenido",nullable = false,length = 45)
    private String directorContenido;
    @Column(name = "typeContenido",nullable = false,length = 45)
    private String typeContenido;
    @Column(name = "genderContenido",nullable = false,length = 45)
    private String genderContenido;
    @Column(name = "originCountryContenido",nullable = false,length = 45)
    private  String originCountryContenido;
    @Column(name = "urlContenido",nullable = false,length = 100)
    private String urlContenido;
    @Column(name = "languageContenido",nullable = false,length = 45)
    private String languageContenido;
    @ManyToOne
    @JoinColumn(name = "idListaDeReproduccion")
    private ListaDeReproduccion listadereproduccion;


    public Contenido() {
    }

    public Contenido(int idContenido, String titleContenido, String descripContenido, int yearContenido, String directorContenido, String typeContenido, String genderContenido, String originCountryContenido, String urlContenido, String languageContenido, ListaDeReproduccion listadereproduccion) {
        this.idContenido = idContenido;
        this.titleContenido = titleContenido;
        this.descripContenido = descripContenido;
        this.yearContenido = yearContenido;
        this.directorContenido = directorContenido;
        this.typeContenido = typeContenido;
        this.genderContenido = genderContenido;
        this.originCountryContenido = originCountryContenido;
        this.urlContenido = urlContenido;
        this.languageContenido = languageContenido;
        this.listadereproduccion = listadereproduccion;
    }

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

    public int getYearContenido() {
        return yearContenido;
    }

    public void setYearContenido(int yearContenido) {
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

    public ListaDeReproduccion getListadereproduccion() {
        return listadereproduccion;
    }

    public void setListadereproduccion(ListaDeReproduccion listadereproduccion) {
        this.listadereproduccion = listadereproduccion;
    }
}
