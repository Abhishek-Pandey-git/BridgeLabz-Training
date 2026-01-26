package com.csvhandling;

import java.io.*;
import java.util.*;
import javax.crypto.*;
import javax.crypto.spec.*;
import java.util.Base64;

public class EncryptDecryptCSV {
	
	private static final String SECRET_KEY = "MySecretKey12345";
	
	public static void main(String[] args) {
		
		String inputFile = "employees.csv";
		String encryptedFile = "employees_encrypted.csv";
		String decryptedFile = "employees_decrypted.csv";
		
		try {
			encryptCSV(inputFile, encryptedFile);
			System.out.println("CSV encrypted successfully!");
			
			decryptCSV(encryptedFile, decryptedFile);
			System.out.println("CSV decrypted successfully!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void encryptCSV(String inputFile, String outputFile) throws Exception {
		
		BufferedReader br = new BufferedReader(new FileReader(inputFile));
		FileWriter writer = new FileWriter(outputFile);
		
		String header = br.readLine();
		writer.write(header + "\n");
		
		String line;
		while ((line = br.readLine()) != null) {
			String[] data = line.split(",");
			
			// encrypt salary and email
			data[3] = encrypt(data[3]);
			
			writer.write(String.join(",", data) + "\n");
		}
		
		br.close();
		writer.close();
	}
	
	public static void decryptCSV(String inputFile, String outputFile) throws Exception {
		
		BufferedReader br = new BufferedReader(new FileReader(inputFile));
		FileWriter writer = new FileWriter(outputFile);
		
		String header = br.readLine();
		writer.write(header + "\n");
		
		String line;
		while ((line = br.readLine()) != null) {
			String[] data = line.split(",");
			
			data[3] = decrypt(data[3]);
			
			writer.write(String.join(",", data) + "\n");
		}
		
		br.close();
		writer.close();
	}
	
	private static String encrypt(String value) throws Exception {
		SecretKeySpec key = new SecretKeySpec(SECRET_KEY.getBytes(), "AES");
		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.ENCRYPT_MODE, key);
		
		byte[] encrypted = cipher.doFinal(value.getBytes());
		return Base64.getEncoder().encodeToString(encrypted);
	}
	
	private static String decrypt(String encrypted) throws Exception {
		SecretKeySpec key = new SecretKeySpec(SECRET_KEY.getBytes(), "AES");
		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.DECRYPT_MODE, key);
		
		byte[] decrypted = cipher.doFinal(Base64.getDecoder().decode(encrypted));
		return new String(decrypted);
	}
}
