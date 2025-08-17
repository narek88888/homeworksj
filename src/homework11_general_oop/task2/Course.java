package homework11_general_oop.task2;

/*

Create class Course with:
private courseName
private capacity

Create 6 students.
Create two courses and enroll students in both courses.
In one course students cannot have the same id.

 */

public class Course {

    private String courseName;
    private String capacity;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName){
        this.courseName = courseName;

    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public static void main(String[] args){
        Course course1 = new Course();
        Course course2 = new Course();

    }


}
