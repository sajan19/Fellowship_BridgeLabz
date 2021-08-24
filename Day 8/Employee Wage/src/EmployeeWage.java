import java.util.Random;

public class EmployeeWage {
//    //UseCase1 - Attendance of Employee
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

    //UseCase 2 - Daily Wage of Employee

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

    //UseCase 3 - Full Time and Part Time Daily Wage

//    public void Full_PartTime(){
//        int isFullTime=1;
//        int isPartTime=2;
//        int empHrs=0;
//        int empWage=0;
//        double empCheck=Math.floor(Math.random()*10)%3;
//        System.out.println(empCheck);
//        if(empCheck==isFullTime){
//            empHrs=8;
//            System.out.println("Employee is Present and worked FullTime");
//        }
//        else if (empCheck==isPartTime){
//            empHrs=4;
//            System.out.println("Employee is Present but worked PartTime");
//        }
//        else {
//            empHrs=0;
//            System.out.println("Employee is Absent");
//        }
//        int wagePerHr = 20;
//        int totalDailyWage = wagePerHr * empHrs;
//        System.out.println("Total Daily Wage of an Employee is : "+ totalDailyWage);
//    }

    //Use Case 4 - Employee Wage using Switch Case
//
//    public static final int isFullTime =1;
//    public static final int isPartTime =2;
//    public void Switch_Case(){
//            int empHrs=0;
//            int empWage=0;
//            int empCheck=(int) Math.floor(Math.random()*10)%3;
//            System.out.println("empCheck Value is: " + empCheck);
//            switch (empCheck) {
//                case isFullTime:
//                    empHrs = 8;
//                    System.out.println("Employee is Present and worked FullTime");
//                    break;
//                case isPartTime:
//                    empHrs = 4;
//                    System.out.println("Employee is Present but worked PartTime");
//                    break;
//                default:
//                    empHrs = 0;
//                    System.out.println("Employee is Absent");
//                    break;
//            }
//            int wagePerHr = 20;
//            int totalDailyWage = wagePerHr * empHrs;
//            System.out.println("Total Daily Wage of an Employee is : "+ totalDailyWage);
//    }
    //Use Case 5 Monthly Wage of Employee
    public static final int isFullTime=1;
    public static final int isPartTime=2;
    public void MonthlyWage(){
                int numOfWorkingDays=20;
                int empHrs=0;
                int empWage=0;
                int totalEmpWage=0;
                int wagePerHr = 20;
                int fullTime = 0;
                int partTime = 0;
                int absent = 0;
                for (int day =0; day<numOfWorkingDays; day++) {
                    int empCheck = (int) Math.floor(Math.random() * 10) % 3;
//            System.out.println("empCheck Value is: " + empCheck);

                    if(empCheck==1){
                        fullTime++;
                    }
                    else if(empCheck==2){
                        partTime++;
                    }
                    else if(empCheck==0){
                        absent++;
                    }

                    switch (empCheck) {
                        case isFullTime:
                            empHrs = 8;
                            break;
                        case isPartTime:
                            empHrs = 4;
                            break;
                        default:
                            empHrs = 0;
                            break;
                    }
                    empWage = empHrs * wagePerHr;
                    totalEmpWage +=empWage;

                }
                System.out.println("Number of days an Employee did Full Time Work: "+ fullTime);
                System.out.println("Number of days an Employee did Part Time Work: "+ partTime);
                System.out.println("Number of days an Employee was Absent at Work: "+ absent);
                System.out.println("Total Monthly Wage of an Employee is : "+ totalEmpWage);
            }
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        //Object
        EmployeeWage obj = new EmployeeWage();
//        UseCase 1
//        obj.Attendance();
        //UseCase2
//        obj.DailyWage();
        //Use Case 3 FullTime and PartTime
//        obj.Full_PartTime();
        //Use Case 4 - Employee Wage using Switch Case
//        obj.Switch_Case();
        //Use Case 5 - Montly Wage of Employee
        obj.MonthlyWage();
    }
}

