package homework11_general_oop.task2;

import java.util.ArrayList;


/*
2.Create class Student with:
private name
private id
public method enroll(Course course)


Create class Course with:
private courseName
private capacity

Create 6 students.
Create two courses and enroll students in both courses.
In one course students cannot have the same id.

 */

public class Student {

    private String name;
    private String id;// Աշակերտների ցուցակ
    private ArrayList<String> students;



    public Student(String name, String id){
        this.name = name;
        this.id = id;
        students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getId(){
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void addStudent(String student){
        students.add(student);
    }

    public void enroll(Course course){

    }

}
