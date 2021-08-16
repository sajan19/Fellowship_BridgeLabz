public class useCase4 {
    public static final int isFullTime =1;
    public static final int isPartTime =2;
    public static void main(String[] args) {
//        int isFullTime=1;
//        int isPartTime=2;
        int empHrs=0;
        int empWage=0;
        int empCheck=(int) Math.floor(Math.random()*10)%3;
        System.out.println("empCheck Value is: " + empCheck);
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
        int wagePerHr = 20;
        int totalDailyWage = wagePerHr * empHrs;
        System.out.println("Total Daily Wage of an Employee is : "+ totalDailyWage);
    }
}
