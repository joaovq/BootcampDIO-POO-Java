package br.com.dio.desafio;

import java.time.LocalDate;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
            Course course1 = new Course();

            course1.setTitle("Curso Java");
            course1.setDescription("descrição do curso de Java");
            course1.setWorkload(4);

            Mentors mentors = new Mentors();

            mentors.setTitle("Mentoria Java");
            mentors.setDescription("Descrição da mentoria Java");
            mentors.setDate(LocalDate.now());

//        System.out.println(course1);
//        System.out.println(mentors);

            Bootcamp bootcamp = new Bootcamp();

            bootcamp.setName("Bootcamp Java");
            bootcamp.setDescription("Descrição Bootcamp Java");
            bootcamp.getContents().add(course1);
            bootcamp.getContents().add(mentors);

            Dev devJoao = new Dev();
            devJoao.setName("João");
            devJoao.subscribe(bootcamp);
            System.out.println("Conteudos inscritos Joao: " + devJoao.getSubscribeContents());
            System.out.println("Conteudos concluidos"+ devJoao.getCompleteContents());
            devJoao.progress();
            System.out.println("Conteudos concluidos"+ devJoao.getCompleteContents());
            System.out.println("XP: "+ devJoao.xpCalculate());

            Dev devCamila = new Dev();
            devCamila.setName("Camila");
            devCamila.subscribe(bootcamp);
            System.out.println("Conteudos inscritos Camila: " + devCamila.getSubscribeContents());
            devCamila.progress();
            System.out.println("Conteudos concluidos"+ devCamila.getCompleteContents());
            System.out.println("XP: "+ devCamila.xpCalculate());





    }
}
