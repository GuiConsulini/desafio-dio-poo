package br.com.dio.desafio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descri��o curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		
		curso2.setTitulo("Curso JavaScript");
		curso2.setDescricao("Descri��o curso JavaScript");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria de Java");
		mentoria1.setDescricao("Descri��o mentoria Java");
		mentoria1.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descri��o Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devGuilherme = new Dev();
		devGuilherme.setNome("Guilherme");
		devGuilherme.inscreverBootcamp(bootcamp);
		devGuilherme.progredir();
		System.out.println("Conte�dos inscritos Guilherme: " + devGuilherme.getConteudosInscritos());
		System.out.println("Conte�dos conclu�dos Guilherme: " + devGuilherme.getConteudosConcluidos());
		System.out.println("XP Guilherme: " + devGuilherme.calcularTotalXp());
		
		System.out.println("*-------------------------------*");
		
		Dev devJamilton = new Dev();
		devJamilton.setNome("Jamilton");
		devJamilton.inscreverBootcamp(bootcamp);
		System.out.println("Conte�dos inscritos Jamilton: " + devJamilton.getConteudosInscritos());
		System.out.println("Conte�dos conclu�dos Jamilton: " + devJamilton.getConteudosConcluidos());
	}

}
