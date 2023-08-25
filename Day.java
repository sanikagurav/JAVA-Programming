//calculate age and day of year
import java.util.Scanner;
class Age
{
    int date;
    int month;
    int year;
    int current_year;
    void age1()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter the date :");
        date=sc.nextInt();

        System.out.println("\nEnter the month(1-12):");
        month=sc.nextInt();

        System.out.println("\nEnter the year :");
        year=sc.nextInt();
    }
    void calage()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter the current year :");
        current_year=sc.nextInt();

        int age;
        age=current_year-year;
        System.out.println("\nAge of the person is :"+age);
    }
    void dayofyear()
    {
         int daysInMonths[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
         int daysPassed = date;

         for (int i = 1; i < month; ++i)
         {
              daysPassed += daysInMonths[i];
         }

   
         if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0 && month > 2))
         {
               daysPassed += 1;
         }
         System.out.println("\nNumber of days passed since January 1:"+daysPassed);
    }
}
public class Day
{
     public static void main(String[] args) 
     {
         Age A=new Age();
         A.age1();
         A.calage();
         A.dayofyear();
     }

}
