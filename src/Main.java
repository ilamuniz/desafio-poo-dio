import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java Básico");
        curso1.setDescricao("Descrição do Curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JavaScript");
        curso2.setDescricao("Descrição do Curso de JavaScript");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria de Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devIla = new Dev();
        devIla.setNome("Ila Muniz");
        devIla.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Ila Muniz: " + devIla.getConteudosInscritos());
        devIla.progredir();
        devIla.progredir();
        System.out.println("---");
        System.out.println("Conteúdos inscritos de Ila Muniz: " + devIla.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de Ila Muniz: " + devIla.getConteudosConcluidos());
        System.out.println("XP: " + devIla.calcularTotalXp());

        System.out.println("-------------------------------");

        Dev devMiguel = new Dev();
        devMiguel.setNome("Miguel");
        devMiguel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Miguel: " + devMiguel.getConteudosInscritos());
        devMiguel.progredir();
        devMiguel.progredir();
        devMiguel.progredir();
        System.out.println("---");
        System.out.println("Conteúdos inscritos de Miguel: " + devMiguel.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de Miguel: " + devMiguel.getConteudosConcluidos());
        System.out.println("XP: " + devMiguel.calcularTotalXp());
    }
}