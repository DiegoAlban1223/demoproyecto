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
    @Column(name = "descripContenido",nullable = false,length = 45)
    private String descripContenido;
    @Column(name = "cateContenido",nullable = false,length = 45)
    private String cateContenido;
    @Column(name = "yearContenido",nullable = false,length = 45)
    private int yearContenido;
    @Column(name = "typeContenido",nullable = false,length = 45)
    private String typeContenido;
    @Column(name = "seasonsContenido",nullable = false,length = 45)
    private int seasonsContenido;

    @ManyToOne
    @JoinColumn(name = "idLista_de_Reproduccion")
    private ListaDeReproduccion listadereproduccion;
    @Column(name = "languageContenido",nullable = false,length = 45)
    private String languageContenido;
    @Column(name = "subContenido",nullable = false,length = 45)
    private String subContenido;
    @Column(name = "typequalityContenido",nullable = false,length = 45)
    private String typequalityContenido;
    @Column(name = "speedContenido",nullable = false,length = 45)
    private int speedContenido;

    public Contenido() {
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

    public String getCateContenido() {
        return cateContenido;
    }

    public void setCateContenido(String cateContenido) {
        this.cateContenido = cateContenido;
    }

    public int getYearContenido() {
        return yearContenido;
    }

    public void setYearContenido(int yearContenido) {
        this.yearContenido = yearContenido;
    }

    public String getTypeContenido() {
        return typeContenido;
    }

    public void setTypeContenido(String typeContenido) {
        this.typeContenido = typeContenido;
    }

    public int getSeasonsContenido() {
        return seasonsContenido;
    }

    public void setSeasonsContenido(int seasonsContenido) {
        this.seasonsContenido = seasonsContenido;
    }

  

    public ListaDeReproduccion getListadereproduccion() {
        return listadereproduccion;
    }

    public void setListadereproduccion(ListaDeReproduccion listadereproduccion) {
        this.listadereproduccion = listadereproduccion;
    }

    public String getLanguageContenido() {
        return languageContenido;
    }

    public void setLanguageContenido(String languageContenido) {
        this.languageContenido = languageContenido;
    }

    public String getSubContenido() {
        return subContenido;
    }

    public void setSubContenido(String subContenido) {
        this.subContenido = subContenido;
    }

    public String getTypequalityContenido() {
        return typequalityContenido;
    }

    public void setTypequalityContenido(String typequalityContenido) {
        this.typequalityContenido = typequalityContenido;
    }

    public int getSpeedContenido() {
        return speedContenido;
    }

    public void setSpeedContenido(int speedContenido) {
        this.speedContenido = speedContenido;
    }
}
