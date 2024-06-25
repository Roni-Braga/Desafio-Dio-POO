import edu.com.desafio.dio.dominio.Bootcamp;
import edu.com.desafio.dio.dominio.Cursos;
import edu.com.desafio.dio.dominio.Dev;
import edu.com.desafio.dio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cursos curso = new Cursos();
        curso.setTitle("Desvendadno Java");
        curso.setDescription("entendendo a sintaxe do java");
        curso.setCargaHoraria(200);

        Cursos curso1 = new Cursos();
        curso1.setTitle("Deep Learning");
        curso1.setDescription("entendendo a redes neurais");
        curso1.setCargaHoraria(100);



        Mentoria mentoria = new Mentoria();
        mentoria.setTitle("Desvendo a IA");
        mentoria.setData(LocalDate.now());
        mentoria.setDescription("Entendendo o universo do Machine Learning");

        /*System.out.println(curso);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Java Developer");
        bootcamp.setDescription("Descrição bootcamp");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Roni");
        dev.escreverBootcamp(bootcamp);

        System.out.println("Conteudo inscritos" + dev.getConteudosInscritos());
        dev.progredir();
        System.out.println("Conteudo inscritos" + dev.getConteudosInscritos());
        System.out.println("Conteudo Concluidos" + dev.getConteudosConcluidos());
        System.out.println("XP:" +dev.calcularTotalXp());

    }

}