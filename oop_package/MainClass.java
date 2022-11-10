package oop_package;

public class MainClass {

    public static void main(String args[]){

        Student raisul  = new Student(1, "Raisul Islam", 3.50);
        Student sakib   = new Student(2, "Ahmed Sakib", 3.60);
        Student piash   = new Student(3, "Afikur Rahman", 3.70);
        Student amit    = new Student(4, "Amit Hasan", 3.75);
        Student nirzon  = new Student();




        /*
        raisul.setId(1);
        raisul.setName("Raisul Islam");
        raisul.setCgpa(3.50);
        */
        nirzon.setId(2);
        nirzon.setName("Nirzon Ahmed");
        nirzon.setCgpa(3.90);


        System.out.println("-----------Properties of raisul object--------------");
        System.out.println("id: " + raisul.getId());
        System.out.println("Name: " + raisul.getName());
        System.out.println("CGPA: " + raisul.getCgpa());
        System.out.println("instructor: " + Student.getInstructor());
        System.out.println("CountOfStudent: " + Student.getCountOfStudents());

        System.out.println("-----------Properties of sakib object--------------");
        System.out.println("id: " + sakib.getId());
        System.out.println("name: " + sakib.getName());
        System.out.println("CGPA: " + sakib.getCgpa());
        System.out.println("instructor: " + Student.getInstructor());
        System.out.println("CountOfStudent: " + Student.getCountOfStudents());

        System.out.println("-----------Properties of piash object--------------");
        System.out.println("id: " + piash.getId());
        System.out.println("Name: " + piash.getName());
        System.out.println("CGPA: " + piash.getCgpa());
        System.out.println("Instructor: " + Student.getInstructor());
        System.out.println("CountOfStudent: " + Student.getCountOfStudents());

        System.out.println("-----------Properties of amit object--------------");
        System.out.println("id: " + amit.getId());
        System.out.println("Name: " + amit.getName());
        System.out.println("CGPA: " + amit.getCgpa());
        System.out.println("Instructor: " + Student.getInstructor());
        System.out.println("CountOfStudent: " + Student.getCountOfStudents());

        System.out.println("-----------Properties of Nirzon object--------------");
        System.out.println("id: " + nirzon.getId());
        System.out.println("Name: " + nirzon.getName());
        System.out.println("CGPA: " + nirzon.getCgpa());
        System.out.println("Instructor: " + Student.getInstructor());
        System.out.println("CountOfStudent: " + Student.getCountOfStudents());

    }

}
