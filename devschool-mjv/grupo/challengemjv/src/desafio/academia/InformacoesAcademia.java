package desafio.academia;

import java.io.File;
import java.util.Scanner;

public class InformacoesAcademia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cadastre um novo aluno!");
        System.out.println("Insira o nome do aluno: ");
        //recebe o nome do usuário
        String nome = entrada.nextLine();
        System.out.println("Insira o número de matrícula do aluno: ");
        String matricula = entrada.nextLine();
        Aluno a1 = new Aluno(nome, matricula);
        //cria um arquivo com o nome do aluno no diretório alunos e retorna um arquivo
        File aluno1 = FabricaArquivoTexto.criar(nome, "src/desafio/academia/");
//		a1.setFile(aluno1);
        //preenche
        a1.preencheArquivo();


    }
}
