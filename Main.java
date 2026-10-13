/*Author= Atharv Rasaikar
   */


public class Main {

    public static void main(String[] args) {


        //creating objects
        GoaBusinessSchool gbs = new GoaBusinessSchool(1, "Goa Business School");

        Program mca = new Program(101, "MCA");

        Course oot = new Course(201, "Object Oriented Technology", 4);

        Faculty faculty = new Faculty(301, "HHR", "hhr@gbs.com");

        Student student = new Student(401,"Atharv","Goa","1234567890");

        Exam exam = new Exam("Semester End");

        Result result = new Result(501, "Pass");

        gbs.offerProgram(mca);

        mca.addCourse(oot);

        faculty.teachCourse(oot);

        //encapsulation
        //getter
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Address: " + student.getAddress());


        //setter
        student.setName("Rakshak");

        System.out.println("Updated Name: " + student.getName());

        student.enroll(mca);


        //runtime polymorphism
        //object referencing
        Person p = new Student(402,"Viraj","Hyderabad","5678901234");

        p.displayRole();

        exam.conductExam();

        result.displayResult();
    }
}