package desafio;

import java.io.File;

public class Main {
	public static void main(String[] args) {
		File arq = new File("D:\\PROJETOS\\desafio\\src\\desafio\\texto.txt");
		File dir = new File("D:\\PROJETOS\\desafio\\src\\desafio");
// Exibe um relat�rio do arquivo passado como par�metro		
//		RelatorioArquivo.exibirRelatorio(arq);
//Modifica um arquivo passado como par�metro (o arquivo � completamente substitu�do pela string passada)		
//		ModificaArquivoTexto.modificar(arq);
//Cria ou acessa um arquivo com o nome do arquivo (1� par�metro) no diret�rio passado no 2� par�metro)
//Caso o dirt�rio j� exista ele cria o arquivo no diret�rio existente
		File aluno1 = FabricaArquivoTexto.criar("aluno1", "alunos");
//Insere uma linha no arquivo passado como par�metro		
		ModificaArquivoTexto.inserirLinha(aluno1);
	}
}
