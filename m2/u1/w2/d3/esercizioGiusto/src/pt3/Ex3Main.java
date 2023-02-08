package pt3;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//TODO


import pt1.Ex1Main;

public class Ex3Main {

	static Logger log = LoggerFactory.getLogger(Ex1Main.class);
	static Scanner sc = new Scanner(System.in);
	static File file = new File("dirFile/test.txt");
	static String[] elenco = new String[9];
	
	public static void main(String[] args) throws IOException {
		
		arrayIt();
				
		
		scriviFile();
		String testoFile = leggiFile();
		log.info(testoFile);

	}
	
	
	public static void scriviFile(String str) throws IOException{
		  
		FileUtils.writeStringToFile(file, str,"utf-8",true);
				
	}
	
	public static String leggiFile() throws IOException {
		String ciao = FileUtils.readFileToString(file,"UTF-8");
		return ciao;
	}
	
	public static void cancellaFile() throws IOException {
		FileUtils.delete(file);
	}
	
	public static void arrayIt() {
		elenco[0]="Operaio 1 = 2";
		elenco[1]="Operaio 2 = 3";
		elenco[2]="Operaio 3 = 4";
		elenco[3]="Operaio 4 = 7";
		elenco[4]="Operaio 5 = 0";
		elenco[5]="Operaio 6 = 1";
		elenco[6]="Operaio 7 = 2";
		elenco[7]="Operaio 8 = 6";
		elenco[8]="Operaio 9 = 4";
		elenco[9]="Operaio 10 = 7";
	}

}
