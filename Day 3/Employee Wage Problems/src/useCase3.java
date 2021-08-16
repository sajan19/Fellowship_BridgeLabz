public class useCase3 {
    public static void main(String[] args) {
        int isFullTime=1;
        int isPartTime=2;
        int empHrs=0;
        int empWage=0;
        double empCheck=Math.floor(Math.random()*10)%3;
        System.out.println(empCheck);
        if(empCheck==isFullTime){
            empHrs=8;
        }
        else if (empCheck==isPartTime){
            empHrs=4;
        }
        else {
            empHrs=0;
        }
        int wagePerHr = 20;
        int totalDailyWage = wagePerHr * empHrs;
        System.out.println("Total Daily Wage of an Employee is : "+ totalDailyWage);
    }
}
