package menstruationApplication;

import java.util.Scanner;
public class MenstruationMainApplication {
    public static void main(String[] args) {
        main();
    }
   public static void main(){
       Scanner scanner = new Scanner(System.in);

       System.out.print("""
               1 -> check next menstruation
               2 -> check ovulation period
               3 -> check safePeriod
               4->  exit
               """ );
       int menu = scanner.nextInt();
       switch (menu){
           case 1 :
               checkNextMenstrualFlow();
       }

    }

    private static void checkNextMenstrualFlow() {
        Scanner scanner = new Scanner(System.in);
       Menstruation menstruation = new Menstruation();
        System.out.println("Enter First Name");
        String firstName = scanner.nextLine();

        System.out.println("Enter Last Name");
        String lastName = scanner.nextLine();

        String fullName = fullName(firstName,lastName);

        System.out.println("please fill in your last month flow details");
        System.out.println("Enter your previous flow day format:dd ");
        String day = scanner.nextLine();
        System.out.println("Enter your previous flow month format: mm ");
        String month = scanner.nextLine();
        System.out.println("Enter the Year: yyyy");
        String year = scanner.nextLine();

        System.out.println("Enter your Menstruation Cycle");
        int menstruationCycle = Integer.parseInt(scanner.nextLine());
        menstruation.setLastMonthMenstrualFlow(year, month, day);
        String lastMonthMenstrualFlow = String.valueOf(menstruation.getLastMonthMenstrualFlow());
        String nextMonthMenstrualDate = String.valueOf(menstruation.getNextMenstualFlow(menstruationCycle, year, month, day));

        System.out.println("Below are the Details of your result");
        System.out.println(fullName);
        System.out.println(lastMonthMenstrualFlow);
        System.out.println(nextMonthMenstrualDate);















    }

    private static String fullName(String firstName, String lastName ){
       return firstName + " " + lastName;
    }


}
