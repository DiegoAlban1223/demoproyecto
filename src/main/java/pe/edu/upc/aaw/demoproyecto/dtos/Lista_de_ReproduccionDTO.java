package pe.edu.upc.aaw.stream.dtos;

public class Lista_de_ReproduccionDTO {
    private int idLista_de_Reproduccion;
    private String nameLista_de_Reproduccion;
    private String descriptionLista_de_Reproduccion;
    private String list_contentsLista_de_Reprodccion;
    private int account_id;

    public int getIdLista_de_Reproduccion() {
        return idLista_de_Reproduccion;
    }

    public void setIdLista_de_Reproduccion(int idLista_de_Reproduccion) {
        this.idLista_de_Reproduccion = idLista_de_Reproduccion;
    }

    public String getNameLista_de_Reproduccion() {
        return nameLista_de_Reproduccion;
    }

    public void setNameLista_de_Reproduccion(String nameLista_de_Reproduccion) {
        this.nameLista_de_Reproduccion = nameLista_de_Reproduccion;
    }

    public String getDescriptionLista_de_Reproduccion() {
        return descriptionLista_de_Reproduccion;
    }

    public void setDescriptionLista_de_Reproduccion(String descriptionLista_de_Reproduccion) {
        this.descriptionLista_de_Reproduccion = descriptionLista_de_Reproduccion;
    }

    public String getList_contentsLista_de_Reprodccion() {
        return list_contentsLista_de_Reprodccion;
    }

    public void setList_contentsLista_de_Reprodccion(String list_contentsLista_de_Reprodccion) {
        this.list_contentsLista_de_Reprodccion = list_contentsLista_de_Reprodccion;
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }
}
