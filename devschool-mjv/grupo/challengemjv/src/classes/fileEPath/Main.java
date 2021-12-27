package classes.fileEPath;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {

        File file = new File("C:\\usando_file_path\\aplicando_io_file.txt");//java . io. file, usado para criar arquivo

        try {
            boolean arquivoCriado = file.createNewFile();//se houver erro o programa pode manipular o tratamento das excecoes
            System.out.println("Arquivo criado com sucesso " + arquivoCriado);
            boolean exists = file.exists();

            System.out.println("path absolute " + file.getAbsolutePath()); // caminho absoluto do arquivo

            System.out.println("ultima modificacao " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).toLocalDateTime()); // nos do grupo 5 estamos colocando o date time antes da impressão
            //pois se colocarmos depois da exclusão vai retornar nulo já que o java não le modificacao de um arquivo que foi deletado.


            if(exists) {				//verifica se o arquivo exite usando um metodo que fica dentro do file chamado exists, para ai sim se existir arquivo aplicar o delete


                System.out.println("Agora o arquivo foi deletado "+ file.delete()); //só vai exibir se o arquivo foi deletado
            }

        }catch(IOException exception) {
            exception.printStackTrace();
        }
    }
}
