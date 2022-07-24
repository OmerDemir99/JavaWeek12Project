package constructors;

import java.util.ArrayList;

public class Microsoft {

    public static void main(String[] args) {

        Employee employee1 = new Employee(); // calling for default constructor

        employee1.salary = 130000; // can be changed once we initialize it
        employee1.name = "Efe";
        employee1.jobTitle = "QA";
        employee1.ID = 12;


        Employee employee2 = new Employee();
        employee2.salary = 120000; // can be changed once we initialize it
        employee2.name = "Hazar";
        employee2.jobTitle = "SM";
        employee2.ID = 13;

        Employee employee3 = new Employee();

        employee3.salary = 115000; // can be changed once we initialize it
        employee3.name = "Jamal";
        employee3.jobTitle = "Developer";
        employee3.ID = 16;

        System.out.println(employee1);

        ArrayList<Employee> team = new ArrayList<>();

        team.add(employee1);
        team.add(employee2);
        team.add(employee3);

        double maxSalary = Double.MIN_VALUE;

        for ( Employee each : team ){ // each is an Employee object

            if ( each.salary > maxSalary ){
                maxSalary = each.salary;
            }
        }
        System.out.println(team);
        System.out.println(maxSalary);

        // find the Jamal's jobTitle

        for ( Employee each : team){
            if ( each.name.equals("Jamal")){
                System.out.println(each.jobTitle);
            }
        }

        // company name for each employee

// you can change or calling static field through object
// or ClassName, but second one maybe preferable

        // employee1.companyName = "Tesla";
        Employee.companyName = "Tesla";
        for( Employee each : team ){
            System.out.println(each.name+ " is working for "+ each.companyName);
        }



    }
}
