package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Files  {
	String ruta =null;
	File file =null;
	FileReader fileReader = null;
	BufferedReader bufferFile =null;
	public Files(String arg0) throws FileNotFoundException {	
		ruta=arg0;
		file = new File(ruta);
		fileReader = new FileReader(file);
		bufferFile = new BufferedReader(fileReader);
	}
	
	
	public static void main(String[] args) throws IOException {
		try {
			Files archivo = new Files("C:\\eclipceJava\\fisica.txt");
			String linea;
	         while((linea=archivo.bufferFile.readLine())!=null)
	            System.out.println(linea);
	      }
		 catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
