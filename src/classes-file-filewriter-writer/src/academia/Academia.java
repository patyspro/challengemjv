package academia;

import java.io.File;
import java.util.Scanner;

import desafio.FabricaArquivoTexto;

public class Academia {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Cadastre um novo aluno!");
		System.out.println("Insira o nome do aluno: ");
		//recebe o nome do usu�rio
		String nome = entrada.nextLine();
		System.out.println("Insira o n�mero de matr�cula do aluno: ");
		String matricula = entrada.nextLine();
		Aluno a1 = new Aluno(nome, matricula);
		//cria um arquivo com o nome do aluno no diret�rio alunos e retorna um arquivo
		File aluno1 = FabricaArquivoTexto.criar(nome, "alunos");
		a1.setFile(aluno1);
		a1.preencheArquivo();
		
		
	}
}
