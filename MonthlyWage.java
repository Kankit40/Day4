public class MonthlyWage {
    public static void main(String[] args) {
        final int Employee_Present = 1;
        final int Employee_Absent = 3;
        final int Employee_Halfday = 2;
        final int Per_Day_Hour = 8;
        final int Per_Hour_Wage = 20;
        final int Working_Day = 26;

        

        for (int Day = 0; Day < Working_Day; Day++){
			int Attendence = (int)(Math.random() * 3);

            switch (Attendence){
                case Employee_Present:
                    System.out.println("Employee is present");
                    int Totalwage = Per_Hour_Wage * Per_Day_Hour * 1;
                    System.out.println("Total wage is :" + Totalwage);
                    System.out.println("---------------------------------------------------");
                    break;
                case Employee_Halfday:
                    System.out.println("Employee is doing Halfday");
                    int Totalwage1 = (Per_Hour_Wage * Per_Day_Hour) / 2;
                    System.out.println("Total wage is :" + Totalwage1);
                    System.out.println("---------------------------------------------------");

                    break;
                default:
                    System.out.println("Employee is Absent");
                    int Totalwage2 = Per_Hour_Wage * Per_Day_Hour * 0;
                    System.out.println("Total wage is :" + Totalwage2);
                    System.out.println("---------------------------------------------------");
            }

        }
    }
}
