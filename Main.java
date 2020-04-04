import java.util.*;

class Main {
  public static void main(String[] args) {
    // Testing Student Class //
    Student student = new Student("Bob", 90);
    System.out.println(student.toString());
    double gpa = 55.0;
    student.setGPA(gpa);
    System.out.println(student.getGPA());

    System.out.println("_______________________________");

    // Creating an ArrayList named Roster //
    ArrayList<Student> roster = new ArrayList<Student>();
    roster.add(new Student("Tahiya", 93));
    roster.add(new Student("Shuoshuo", 94));
    roster.add(new Student("Alex", 76));
    roster.add(new Student("Annie", 84));;
    roster.add(new Student("Amy", 45));

    HonorRoll topStudents = new HonorRoll(roster);
    System.out.println("\n" + topStudents.toString());
  
  }
}