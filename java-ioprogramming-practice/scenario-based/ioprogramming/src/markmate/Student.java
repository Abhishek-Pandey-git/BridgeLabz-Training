package markmate;

public class Student {
    int rollNo;
    String name;
    int mathMarks;
    int scienceMarks;
    int englishMarks;
    
    public Student(int rollNo, String name, int mathMarks, int scienceMarks, int englishMarks) {
        this.rollNo = rollNo;
        this.name = name;
        this.mathMarks = mathMarks;
        this.scienceMarks = scienceMarks;
        this.englishMarks = englishMarks;
    }
    
    public int getTotal() {
        return mathMarks + scienceMarks + englishMarks;
    }
    
    public double getAverage() {
        return getTotal() / 3.0;
    }
    
    public String getGrade() {
        double avg = getAverage();
        if (avg >= 90) return "A+";
        if (avg >= 80) return "A";
        if (avg >= 70) return "B";
        if (avg >= 60) return "C";
        if (avg >= 50) return "D";
        return "F";
    }
}
