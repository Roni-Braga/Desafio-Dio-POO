package edu.com.desafio.dio.dominio;

public abstract class Conteudo {
    protected static final double XP_PADRAO = 10;
    private String title;
    private String description;

    public abstract double calcularXp();

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
}
