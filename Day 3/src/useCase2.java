public class useCase2 {
    public static void main(String[] args) {
        int isPresent=1;
        int empHrs=0;
        int empWage=0;
        double empCheck=Math.floor(Math.random()*10)%2;
        System.out.println(empCheck);
        if(empCheck==isPresent){
            empHrs=8;
        }
        else {
            empHrs=0;
        }
        int wagePerHr = 20;
        int totalDailyWage = wagePerHr * empHrs;
        System.out.println("Total Daily Wage of an Employee is : "+ totalDailyWage);
    }
}
