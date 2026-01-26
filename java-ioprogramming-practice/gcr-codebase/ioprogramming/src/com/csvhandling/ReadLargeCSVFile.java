package com.csvhandling;

import java.io.*;

public class ReadLargeCSVFile {
	
	public static void main(String[] args) {
		
		String fileName = "large_data.csv";
		int batchSize = 100;
		int totalProcessed = 0;
		int batchCount = 0;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			
			br.readLine();
			
			String line;
			int count = 0;
			
			while ((line = br.readLine()) != null) {
				count++;
				
				if (count == batchSize) {
					batchCount++;
					totalProcessed += count;
					// process batch
					System.out.println("Batch " + batchCount + " processed: " + count + " records");
					count = 0;
				}
			}
			
			if (count > 0) {
				batchCount++;
				totalProcessed += count;
				System.out.println("Batch " + batchCount + " processed: " + count + " records");
			}
			
			br.close();
			
			System.out.println("\nTotal records processed: " + totalProcessed);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
