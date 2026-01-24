package com.junit;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileProcessing {
	public void writeToFile(String filename,String str) throws IOException {
		BufferedWriter writer=new BufferedWriter(new FileWriter(filename));
		writer.write(str);
		writer.close();
	}
	
	// reading from the file
	public String readFromFile(String filename) throws IOException{
		BufferedReader reader=new BufferedReader(new FileReader(filename));
		StringBuilder ans=new StringBuilder("");
		String line;
		while((line=reader.readLine())!=null) {
			ans.append(line);
		}
		reader.close();
		
		return ans.toString();
	}
	
	public boolean fileExistence(String filename) {
		File file=new File(filename);
		
		if(file.exists()) {
			return true;
		}
		
		return false;
	}
	
}
