package novo.desafio.path;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.net.URI;
import java.net.URISyntaxException;

public class NovoDesafioPath {

	public static void main(String[] args) throws IOException {
		
		//variavel
		 URI uri = null;
		try {
			uri = new URI("C:\\estudo\\challengemjv\\lorem2.txt");
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		//Fluxo de entrada com arquivo
		
		//criando arquivo
		File doc = new File("texto.txt");
		//doc.createNewFile();
		System.out.println(doc.exists());
		
		InputStream fis = System.in; //new FileInputStream("lorem.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream fos = new FileOutputStream("lorem2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String linha = br.readLine();
		
			while(linha != null && linha.isEmpty()) {
				bw.write(linha);
				bw.newLine();
				bw.flush();
				linha = br.readLine();
				
				Path path = (Path)Paths.get(uri);
				System.out.println(path);
			}
		
		bw.close();
		br.close();
	}

}
