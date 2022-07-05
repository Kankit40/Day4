public class Attendence {
    public static void main(String[] args) {
        
		int Daily_Hour = 8;
		int Daily_Wage = 20;
		
        int a = (int)(Math.random() * 2);

        if (a == 1){
            System.out.println("Employee is Present");
			int Total_Wage = Daily_Wage * Daily_Hour * 1;
			System.out.println("Daily wage is " + Total_Wage);
        }
        else {
            System.out.println("Employee is Absent");
			int Total_Wage = Daily_Wage * Daily_Hour * 0;
			System.out.println("Daily wage is " + Total_Wage);
        }

    }
}
