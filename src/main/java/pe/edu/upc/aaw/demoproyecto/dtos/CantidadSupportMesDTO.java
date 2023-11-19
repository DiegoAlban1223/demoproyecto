package pe.edu.upc.aaw.demoproyecto.dtos;

import java.time.LocalDate;

public class CantidadSupportMesDTO {

    private int quantitySupports;


    private String month;
    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getQuantitySupports() {
        return quantitySupports;
    }

    public void setQuantitySupports(int quantitySupports) {
        this.quantitySupports = quantitySupports;
    }
}
