package novo.desafio.path;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class NovoDesafioPath {

	public static void main(String[] args) throws IOException {
		//Fluxo de entrada com arquivo
		
		InputStream fis = System.in; //new FileInputStream("lorem.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream fos = System.out; //new FileOutputStream("lorem2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String linha = br.readLine();
		
			while(linha != null && linha.isEmpty()) {
				bw.write(linha);
				bw.newLine();
				bw.flush();
				linha = br.readLine();
			}
		
		bw.close();
		br.close();
	}

}
