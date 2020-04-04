import java.util.*;

public class HonorRoll {

  // Fields //
  private ArrayList<Student> honorStudents;

  // Constructor //
  HonorRoll(ArrayList<Student> studentList){ 
    honorStudents = new ArrayList<Student>();
    for(int i = 0; i < studentList.size(); i++) {
      if(studentList.get(i).getGPA() >= 90) {
        honorStudents.add(studentList.get(i));
      }
    }
  }
  
  @Override
  public String toString(){
    return "Honor Students: \n" + honorStudents;
  }

}