package com.jsonhandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ConvertJsonToXml {
    
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        
        try (FileReader reader = new FileReader("data.json")) {
            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            
            StringBuilder xml = new StringBuilder();
            xml.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
            xml.append("<root>\n");
            
            for (Object key : jsonObject.keySet()) {
                Object value = jsonObject.get(key);
                xml.append("  <").append(key).append(">");
                xml.append(value);
                xml.append("</").append(key).append(">\n");
            }
            
            xml.append("</root>");
            
            try (FileWriter writer = new FileWriter("output.xml")) {
                writer.write(xml.toString());
                System.out.println("JSON converted to XML successfully!");
                System.out.println("\nXML Content:");
                System.out.println(xml.toString());
            }
            
        } catch (IOException | ParseException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
