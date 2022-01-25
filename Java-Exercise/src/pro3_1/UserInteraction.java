package pro3_1;

import java.util.Scanner;

public class UserInteraction {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int choice = 0;
        String[] subjects = new String[10];
        int grades[] = new int[10];
        double sum = 0.0;

    do
    {
        System.out.println("1. Enter a course name and a grade");
        System.out.println("2. Display all grades");
        System.out.println("3. Calculate the average grade");
        System.out.println("4. Exit program");

        choice = scan.nextInt();

        if ( choice == 1 ) 
        {
            Scanner scansubjects = new Scanner(System.in);
            Scanner scangrades = new Scanner(System.in);

            System.out.println("Enter 10 subjects and their corresponding grades:");
            System.out.println();

            int i = 0;

            for( i = 0; i < 10; i++ )
            {
                System.out.println("Subject:");

                String temp = scansubjects.nextLine();
                subjects[i] = temp.toLowerCase();

                System.out.println("Grade:");

                grades[i] = scangrades.nextInt();

                if( i == ( subjects.length - 1 ) )
                {
                    System.out.println("Thank you!");
                    System.out.println();
                }
            }
        }


        if ( choice == 2 )
        {
            System.out.println("Subjects" + "\tGrades");
            System.out.println("---------------------");

            for(int p = 0; p < subjects.length; p++)
            {

                System.out.println(subjects[p] + "\t" + "\t" + grades[p]);
            }
        }

        if ( choice == 3 )
        {   
              System.out.println("Total of grades: " + getSum(grades));
              System.out.println("Count of grades: " + grades.length);
              System.out.println("Average of grades: " + getAverage(grades));
              System.out.println();
        }


    } while ( choice != 4);


}

    public static double getAverage(int[] array)
    {
        int sum = 0;
        for(int i : array) sum += i;
        return ((double) sum)/array.length;
    }

    public static double getSum(int[] array)
    {
        int sum = 0;
        for (int i : array) 
        {
         sum += i;
        }
        return sum;
    }


}
