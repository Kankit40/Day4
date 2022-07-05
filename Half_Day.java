public class Half_Day {
    public static void main(String[] args) {
        
		int Daily_Hour = 8;
		int Daily_Wage = 20;
		
        int a = (int)(Math.random() * 3);

        if (a == 1){
            System.out.println("Employee is Present");
			int Total_Wage = Daily_Wage * Daily_Hour * 1;
			System.out.println("Daily wage is " + Total_Wage);
        }else if(a == 2){
			System.out.println("Employee on Halfday");
			int Total_Wage = (Daily_Wage * Daily_Hour)/2 * 1;
			System.out.println("Daily wage is " + Total_Wage);
		}
		
        else {
            System.out.println("Employee is Absent");
			int Total_Wage = Daily_Wage * Daily_Hour * 0;
			System.out.println("Daily wage is " + Total_Wage);
        }

    }
}
