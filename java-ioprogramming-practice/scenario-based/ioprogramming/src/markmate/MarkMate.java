package markmate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MarkMate {
    
    public static void main(String[] args) {
        MarkMate markmate = new MarkMate();
        
        try {
            List<Student> students = markmate.readCSV("marks.csv");
            markmate.generateJSONReport(students, "report_card.json");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public List<Student> readCSV(String filename) throws IOException {
        List<Student> students = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line = br.readLine(); // skip header
            
            System.out.println("=== Reading Marks from CSV ===\n");
            
            while ((line = br.readLine()) != null) {
                try {
                    String[] parts = line.split(",");
                    
                    if (parts.length != 5) {
                        System.out.println("Invalid entry: " + line);
                        continue;
                    }
                    
                    int rollNo = Integer.parseInt(parts[0].trim());
                    String name = parts[1].trim();
                    int mathMarks = Integer.parseInt(parts[2].trim());
                    int scienceMarks = Integer.parseInt(parts[3].trim());
                    int englishMarks = Integer.parseInt(parts[4].trim());
                    
                    Student student = new Student(rollNo, name, mathMarks, scienceMarks, englishMarks);
                    students.add(student);
                    
                    System.out.println("Processed: " + name + " (Roll: " + rollNo + ")");
                    
                } catch (NumberFormatException e) {
                    System.out.println("Invalid marks format in: " + line);
                }
            }
        }
        
        System.out.println("\nTotal students processed: " + students.size());
        return students;
    }
    
    public void generateJSONReport(List<Student> students, String outputFile) throws IOException {
        StringBuilder json = new StringBuilder();
        
        json.append("{\n");
        json.append("  \"reportCards\": [\n");
        
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            
            json.append("    {\n");
            json.append("      \"rollNo\": ").append(s.rollNo).append(",\n");
            json.append("      \"name\": \"").append(s.name).append("\",\n");
            json.append("      \"marks\": {\n");
            json.append("        \"math\": ").append(s.mathMarks).append(",\n");
            json.append("        \"science\": ").append(s.scienceMarks).append(",\n");
            json.append("        \"english\": ").append(s.englishMarks).append("\n");
            json.append("      },\n");
            json.append("      \"total\": ").append(s.getTotal()).append(",\n");
            json.append("      \"average\": ").append(String.format("%.2f", s.getAverage())).append(",\n");
            json.append("      \"grade\": \"").append(s.getGrade()).append("\"\n");
            json.append("    }");
            
            if (i < students.size() - 1) {
                json.append(",");
            }
            json.append("\n");
        }
        
        json.append("  ]\n");
        json.append("}\n");
        
        try (FileWriter writer = new FileWriter(outputFile)) {
            writer.write(json.toString());
            System.out.println("\n=== JSON Report Generated ===");
            System.out.println("File: " + outputFile);
            System.out.println("\nSample Output:");
            System.out.println(json.toString());
        }
    }
}
