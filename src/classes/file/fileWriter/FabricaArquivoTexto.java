package classes.file.fileWriter;

import java.io.File;
import java.io.IOException;

public class FabricaArquivoTexto {

	
	public static File criar(String nome, String pasta) {
		if(new File("/"+ pasta).exists()) {
			File diretorio = new File("/"+ pasta);
			if(new File(diretorio.getAbsolutePath() + "/" + nome + ".txt").exists()) {
				File arquivo = new File(diretorio.getAbsolutePath() + "/" + nome + ".txt");
				System.out.println("O arquivo " + nome + ".txt já existe.\n");
				System.out.println("Caminho do arquivo:  " + diretorio.getPath()+ "/" + nome + ".txt\n");
				return arquivo;
				
			}else {				
				File arquivo = new File(diretorio.getAbsolutePath() + "/" + nome + ".txt");
				try {
					arquivo.createNewFile();
				} catch (IOException e) {
					System.out.println("Não foi possível criar o arquivo");
				}
				System.out.println("Diretório já existe:  " + diretorio.getPath()+ "\n");
				return arquivo;
			}
			
		}else {
			File diretorio = new File("/"+ pasta);
			diretorio.mkdir();
			File arquivo = new File(diretorio.getAbsolutePath() + nome + ".txt");
			try {
				arquivo.createNewFile();
			} catch (IOException e) {
				System.out.println("Não foi possível criar o arquivo");
			}
			System.out.println("Diretorio e arquivo criado agora: " + arquivo.getPath());
			return arquivo;
		}
		
	}
		
}
