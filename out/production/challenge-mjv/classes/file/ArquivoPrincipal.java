import java.io.File;

public class ArquivoPrincipal {
    public static void main(String[] args) {

        File arq = new File("D:\\PROJETOS\\MJV_JAVA\\aulas\\aula_6\\src\\desafio\\texto.txt");
        File diretorio = new File ("D:\\PROJETOS\\MJV_JAVA\\aulas\\aula_6\\src\\desafio\\");

        System.out.println(arq.exists());//se houver arquivo
        System.out.println(arq.getPath());//retorna o caminho do arquivo
        System.out.println(arq.length());//retorna a quantidade de bytes do arquivo
        System.out.println(arq.isFile());//verifica se é um arquivo
        System.out.println(arq.isDirectory());//verifica se é um diretório

        System.out.println(diretorio.isDirectory());
    }
}
