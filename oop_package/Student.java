package oop_package;

public class Student {

    private static String instructor;
    private static int countOfStudents=0;
    private int id;
    private String name;
    private double cgpa;

    public Student(){
        System.out.println("Hello World! I'm default Constructor!");
        setCountOfStudents(countOfStudents);
    }

    public Student(int id, String name, double cgpa){
        System.out.println("Hello World! I'm parameterized Constructor!");
        Student.setInstructor("Osman Hassan");

        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
        setCountOfStudents(countOfStudents);

    }

    //-----------------------------setter methods


    public static void setInstructor(String instructor) {
        Student.instructor = instructor;
    }

    public static void setCountOfStudents(int countOfStudents){
        countOfStudents++;
        Student.countOfStudents = countOfStudents;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCgpa(double cgpa){
        this.cgpa = cgpa;
    }

    //-----------------------------getter methods
    public static String getInstructor(){
        return instructor;
    }

    public static int getCountOfStudents(){
        return countOfStudents;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getCgpa(){
        return cgpa;
    }

}
