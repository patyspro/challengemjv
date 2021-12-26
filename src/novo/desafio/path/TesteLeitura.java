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

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		//Fluxo de entrada com arquivo
		
		InputStream fis = new FileInputStream("lorem.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		
		String linha = br.readLine();
		
			while(linha != null) {
				br.readLine();
				linha = br.readLine();
			}
		
		br.close();
	}

}
