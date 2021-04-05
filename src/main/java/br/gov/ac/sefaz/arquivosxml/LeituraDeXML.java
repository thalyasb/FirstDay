package br.gov.ac.sefaz.arquivosxml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LeituraDeXML {
		  public static void main(String[] args) {
		    LeituraDeXML exemplo = new LeituraDeXML();
		    exemplo.lerArquivo("C:\\Users\\Administrador\\Documents\\teste1.xml");
		  }

		private void lerArquivo(String caminho) {
			FileInputStream fis = null;
			
			try {
				fis = new FileInputStream(caminho);
				
				int c;
				while((c = fis.read()) != -1) {
			        System.out.println((char) c);
			      }
			    } catch (FileNotFoundException ex) {
			      System.out.println("Erro ao abrir o arquivo.");
			    } catch (IOException ex) {
			      System.out.println("Erro ao ler o arquivo.");
			    } finally {
			      try {
			        if(fis != null) {
		
			          fis.close();
			        }
			      } catch (IOException ex) {
			        System.out.println("Erro ao fechar o arquivo.");
			      }
			    } 
		}
}