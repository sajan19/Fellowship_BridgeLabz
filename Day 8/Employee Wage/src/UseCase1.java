import java.util.Random;

public class UseCase1 {
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
       //Object
        UseCase1 obj = new UseCase1();
        obj.Attendance();

    }
}