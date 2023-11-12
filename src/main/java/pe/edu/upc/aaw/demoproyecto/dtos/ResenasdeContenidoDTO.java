package pe.edu.upc.aaw.demoproyecto.dtos;

import java.time.LocalDate;

public class ResenasdeContenidoDTO {

    private String name_usuario;
    private String text_resena;
    private LocalDate dateResena;

    public String getName_usuario() {
        return name_usuario;
    }

    public void setName_usuario(String name_usuario) {
        this.name_usuario = name_usuario;
    }

    public String getText_resena() {
        return text_resena;
    }

    public void setText_resena(String text_resena) {
        this.text_resena = text_resena;
    }

    public LocalDate getDateResena() {
        return dateResena;
    }

    public void setDateResena(LocalDate dateResena) {
        this.dateResena = dateResena;
    }
}
