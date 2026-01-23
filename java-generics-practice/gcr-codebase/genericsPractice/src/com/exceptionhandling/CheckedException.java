package com.exceptionhandling;
import java.io.*;


public class CheckedException {
	
	public static void readFile() throws FileNotFoundException,IOException{
		BufferedReader reader=new BufferedReader(new FileReader("D:\\Java Programming Workspace\\java-generics-practice\\gcr-codebase\\genericsPractice\\src\\com\\exceptionhandling\\input.txt"));
			String line;
			while((line=reader.readLine())!=null) {
				System.out.println(line);
			}
			
		reader.close();
	}
	
	
	public static void main(String[] args) {
		try {
			readFile();
		}
		catch(FileNotFoundException e) {
			System.out.println("Error: "+e.getMessage());
		}
		catch(IOException e) {
			System.out.println("Error: "+e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Error: "+e.getMessage());
		}
	}
}
