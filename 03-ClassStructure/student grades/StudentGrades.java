import java.util.*; 
public class StudentGrades {

    String studentName;
    double[] grades;

    StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
    }
    double LowestGrade(){
        Arrays.sort(grades);
        return grades[0];
    }
    double HighestGrade(){
        Arrays.sort(grades);
        int total=grades.length-1;
        return grades[total];
    }
    int NumberOfGrades(){
        return grades.length;
    }
    double GradeAverage(){
        double count = 0;
        for(double i : grades){
            count+=i;
        }
        return count/grades.length;
    }
    void DisplayRecord(){
        System.out.println(studentName);
        System.out.println(Arrays.toString(grades));
        System.out.println(NumberOfGrades());
        System.out.println(LowestGrade());
        System.out.println(HighestGrade());
        System.out.println(GradeAverage());
    }
    public static void main(String[] args){
        StudentGrades s1 = new StudentGrades("Amanda", new double[] {3.5, 4.5, 4.0, 2.0, 5.0, 3.5, 3.5});
        StudentGrades s2 = new StudentGrades("James", new double[] {2.0, 3.0, 2.0, 4.5, 4.5});
        s1.DisplayRecord();
        s2.DisplayRecord();
    }
}
