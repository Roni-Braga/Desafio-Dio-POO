package edu.com.desafio.dio.dominio;

public class Cursos extends Conteudo{
    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
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
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
