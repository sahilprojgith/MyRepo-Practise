class Student{
  int rollno;
  String name;
  int marks;
}

public class arrobjenhfrlp {
  public static void main(String[] args) {
      Student s1 = new Student();
      s1.rollno=49;
      s1.name="Dhruv Dongardive";
      s1.marks=69;

      Student s2 = new Student();
      s2.rollno=55;
      s2.name="Nayan Salte";
      s2.marks=75;

      Student s3 = new Student();
      s3.rollno=24;
      s3.name="tanmay khatua";
      s3.marks=60;

      System.out.println(s1.name + " : " + s1.marks);

      Student student[] = new Student[3];
      student[0]=s1;
      student[1]=s2;
      student[2]=s3;

      for(Student stud: student){
        System.out.println(stud.name + " : " + stud.marks);
      }






  }
}
