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

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		//Fluxo de entrada com arquivo
		
		OutputStream fos =  new FileOutputStream("lorem2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
		bw.newLine();
		bw.write("huiashauidhauishduisadhsuiahduiashduisahduiasdhauisd");
		bw.close();
			
	
		}	
		
	}

