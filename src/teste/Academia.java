package teste;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Academia {
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		
		String nome;
		String sobreNome;
		
		System.out.println("insira o nome do aluno: ");
		nome= input.next().toLowerCase();
		
		System.out.println("Insira o sobre nome do aluno: ");
		sobreNome=input.next().toLowerCase();
		
		File diretorio= new File("src/teste","Diretorio");
		diretorio.mkdir();
		
		nome= nome.concat("_").concat(sobreNome).concat(".txt");
		File file = new File(diretorio, nome);
		
		file.createNewFile();
		input.close();
		
		
		System.out.println("O arquivo existe?"+file.exists());
		
		
		
		Path path = Paths.get(file.toURI());
		System.out.print(path+" é a URI do arquivo "+path.getFileName());
		
	}
	
}
