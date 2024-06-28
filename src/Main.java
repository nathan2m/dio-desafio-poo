import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        final Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        final Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        final Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        final Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        final Dev nathan = new Dev();
        nathan.setNome("Nathan");
        nathan.inscreverBootcamp(bootcamp);
        nathan.imprimirConteudosInscritos();
        nathan.progredir();
        nathan.progredir();
        System.out.println("-");
        nathan.imprimirConteudosInscritos();
        nathan.imprimirConteudosConcluidos();
        System.out.println("XP:" + nathan.calcularTotalXp());

        System.out.println("-------");

        final Dev manera = new Dev();
        manera.setNome("Manera");
        manera.inscreverBootcamp(bootcamp);
        manera.imprimirConteudosInscritos();
        manera.progredir();
        manera.progredir();
        manera.progredir();
        System.out.println("-");
        manera.imprimirConteudosInscritos();
        manera.imprimirConteudosConcluidos();
        System.out.println("XP:" + manera.calcularTotalXp());
    }
}
