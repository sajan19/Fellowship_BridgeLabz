import java.util.Random;

public class EmployeeWage {
//    //UseCase1
//    public void Attendance() {
//        System.out.println("Attendance of Employees: ");
//        double isPresent = Math.floor(Math.random() * 10) % 2;
////        System.out.println(isPresent);
//        if (isPresent == 1) {
//            System.out.println("Employee is Present");
//        } else {
//            System.out.println("Employee is Absent");
//        }
//    }
    //UseCase 2
//    public void DailyWage() {
//        int Present = 1;
//        int empHrs = 0;
//        int empWage = 0;
//        double empCheck = Math.floor(Math.random() * 10) % 2;
////        System.out.println(empCheck);
//        if (empCheck == Present) {
//            empHrs = 8;
//        } else {
//            empHrs = 0;
//        }
//        int wagePerHr = 20;
//        int totalDailyWage = wagePerHr * empHrs;
//        System.out.println("Total Daily Wage of an Employee is : " + totalDailyWage);
//    }
    //UseCase 3
    public void Full_PartTime(){
        int isFullTime=1;
        int isPartTime=2;
        int empHrs=0;
        int empWage=0;
        double empCheck=Math.floor(Math.random()*10)%3;
//        System.out.println(empCheck);
        if(empCheck==isFullTime){
            empHrs=8;
            System.out.println("Employee is Present and worked FullTime");
        }
        else if (empCheck==isPartTime){
            empHrs=4;
            System.out.println("Employee is Present but worked PartTime");
        }
        else {
            empHrs=0;
            System.out.println("Employee is Absent");
        }
        int wagePerHr = 20;
        int totalDailyWage = wagePerHr * empHrs;
        System.out.println("Total Daily Wage of an Employee is : "+ totalDailyWage);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        //Object
        EmployeeWage obj = new EmployeeWage();
        //UseCase 1
//        obj.Attendance();
        //UseCase2
//        obj.DailyWage();
        //Use Case 3 FullTime and PartTime
        obj.Full_PartTime();
    }
}

