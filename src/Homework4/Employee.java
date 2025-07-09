package Homework4;//6.Սահմանել Employee class-ը, որը ունի
//● instance  fields (id, departmentNumber, age , gender)
//● methods printEmployee() որը տպում է Employee մասին ամբողջական ինֆորմացիա։
//Ստեղծել  3 աշխատող( 2 տղա և 1 աղջիկ), որոնցից երկուսը աշխատում են
// նույն դեպարտամենտում և ունեն նույն տարիքը։

// Homework lesson 4

public class Employee{
    int id;
    int departmentNumber;
    int age;
    char gender;

    public static void printEmployee(Employee employee_1, Employee employee_2, Employee employee_3){
        System.out.println(employee_1.id);
        System.out.println(employee_1.departmentNumber);
        System.out.println(employee_1.age);
        System.out.println(employee_1.gender);

        System.out.println(employee_2.id);
        System.out.println(employee_2.departmentNumber);
        System.out.println(employee_2.age);
        System.out.println(employee_2.gender);

        System.out.println(employee_3.id);
        System.out.println(employee_3.departmentNumber);
        System.out.println(employee_3.age);
        System.out.println(employee_3.gender);

    }

    public static void main(String[] args){
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();

        employee1.age = 28;
        employee1.departmentNumber = 1;
        employee1.gender = 'M';
        employee1.id = 658464845;

        employee2.age = 28;
        employee2.departmentNumber = 1;
        employee2.gender = 'M';
        employee2.id = 963852741;

        employee3.age = 35;
        employee3.departmentNumber = 2;
        employee3.gender = 'F';
        employee3.id = 741852963;

        printEmployee(employee1, employee2, employee3);


    }

}

