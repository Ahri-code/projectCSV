package com.betacom.random;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {
	
	public static void main (String[] args) {
		
		try {
		String filePath = "/Users/oneco/Desktop/betacom/source.txt";
		System.out.println(new String(readCharsFromFile(filePath, 1 ,4 )));
	
		writeDate(filePath, "ciao", 4 );
		
		appendData(filePath,"mondo");
		
		} catch (IOException e){
			
			System.out.println("errore" + e.getMessage());
			}
		}
	
	
	private static byte[] readCharsFromFile(String path , int seek , int chars) throws IOException {
		RandomAccessFile file = new RandomAccessFile(path, "r");
		file.seek(seek);
		byte[] bytes =  new byte[chars];
		file.read(bytes);
		file.close();
		return bytes;
		
	}
	
	private static void writeDate(String path , String data, int seek) throws IOException {
		RandomAccessFile file = new RandomAccessFile(path, "rw");
		file.seek(seek);
		file.write(data.getBytes());
		file.close();
	
	}	
	
	private static void appendData(String path , String data)throws IOException {
		RandomAccessFile file = new RandomAccessFile(path, "rw");
		file.seek(file.length());
		
		file.write(data.getBytes());
		file.close();
	}
	
	
}
	
