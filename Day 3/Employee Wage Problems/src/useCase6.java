public class useCase6 {
    public static final int isFullTime=1;
    public static final int isPartTime=2;

    public static void main(String[] args) {
        int numOfWorkingDays=20;
        int empHrs=0;
        int empWage=0;
        int totalEmpWage=0;
        int wagePerHr = 20;
        int fullTime = 0;
        int partTime = 0;
        int absent = 0;
        int totalWorkingDays=0;
        int totalEmpHrs=0;
        int maxHrsInMonth=100;
        while (totalEmpHrs <= maxHrsInMonth && totalWorkingDays<numOfWorkingDays){
            totalWorkingDays++;
//        for (int day =0; day<numOfWorkingDays; day++) {
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
            totalEmpHrs+=empHrs;
            // empWage = empHrs * wagePerHr;
//            totalEmpWage +=empWage;


        }
        System.out.println("Number of Days: "+ totalWorkingDays +" Employee Hours: " + totalEmpHrs);
        totalEmpWage = totalEmpHrs * wagePerHr;
        System.out.println("Number of days an Employee did Full Time Work: "+ fullTime);
        System.out.println("Number of days an Employee did Part Time Work: "+ partTime);
        System.out.println("Number of days an Employee was Absent at Work: "+ absent);
        System.out.println("Total Wage of an Employee is : "+ totalEmpWage);
    }
}
