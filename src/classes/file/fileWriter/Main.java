package classes.file.fileWriter;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File arq = new File("D:\\PROJETOS\\desafio\\src\\desafio\\texto.txt");
        File dir = new File("D:\\PROJETOS\\desafio\\src\\desafio");

        RelatorioArquivo.exibirRelatorio(arq);

        ModificaArquivoTexto.modificar(arq);
//		ModificaArquivoTexto.inserirLinha(arq);
    }
}
