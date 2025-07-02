
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;



class Student{
  int age;
  String name;

  public Student(int age,String name){
    this.age = age;
    this.name = name ;
  }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{");
        sb.append("age=").append(age);
        sb.append(", name=").append(name);
        sb.append('}');
        return sb.toString();
    } 
}

public class compaaaaarator{
  public static void main(String[] args) {

    Comparator<Student> com = new Comparator<Student>() //Comparator interface to define custom rules for sorting objects 
    {
      public int compare(Student i,Student j){ // collections work with wrapper classes
        if(i.age > j.age ){
          return 1;
        }else{
          return -1;
        }
      }


    };
    

    List<Student> studs = new ArrayList<>();

    studs.add(new Student(21,"Vishwakarma"));
    studs.add(new Student(20,"Shreyash"));
    studs.add(new Student(27,"Sasha"));
    studs.add(new Student(23,"Sisodiya"));


    //Collections.sort(nums,com);

    for(Student s : studs){
      System.out.println(s);
    }
    System.out.println(studs);
    

  }
}