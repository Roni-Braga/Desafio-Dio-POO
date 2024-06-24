import edu.com.desafio.dio.dominio.Cursos;
import edu.com.desafio.dio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cursos curso = new Cursos();
        curso.setTitle("Desvendadno Java");
        curso.setDescription("entendendo a sintaxe do java");
        curso.setCargaHoraria(200);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitle("Desvendo a IA");
        mentoria.setData(LocalDate.now());
        mentoria.setDescription("Entendendo o universo do Machine Learning");

        System.out.println(curso);
        System.out.println(mentoria);
    }

}