package edu.com.desafio.dio.dominio;

public class Cursos {
    private String title;
    private String description;
    private int cargaHoraria;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Cursos{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
