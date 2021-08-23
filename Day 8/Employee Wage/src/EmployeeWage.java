import java.util.Random;

public class EmployeeWage {
    public void Attendance() {
        System.out.println("Attendance of Employees: ");
        double isPresent=Math.floor(Math.random()*10)%2;
        System.out.println(isPresent);
        if(isPresent==1){
            System.out.println("Employee is Present");
        }
        else{
            System.out.println("Employee is Absent");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        //Object
        EmployeeWage obj = new EmployeeWage();
        obj.Attendance();

    }
}