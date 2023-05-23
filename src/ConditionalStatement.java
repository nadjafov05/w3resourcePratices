import java.util.Scanner;

public class ConditionalStatement {
    //1. Write a Java program to get a number from the user and print whether it is positive or negative.
    public static void numbersPositiveAndNegatives(int i){
        if (i<= 0 ){
            System.out.println("numbers is negative");
        }else if (i>=0){
            System.out.println("numbers is positive");
        }else {
            System.out.println("numbers in 0");
        }
    }

    // Write a Java program that takes three numbers from the user and prints the greatest number.
    public static void printsGreatestNumber(int a,int b,int c){

        if (a >= c && a >= b){
            System.out.println("boyuk reqem: "+a);
        }else if (b >= a && b >= c){
            System.out.println("boyuk reqem: "+b);
        }else if (c >= a && c >= b){
            System.out.println("boyuk reqem: "+c);
        }else {
            System.out.println("-1");
        }
    }

    // Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name.
    public static void enterNumbers1And7WeekDayName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers 1 and 7: ");
        int numbersEnter = sc.nextInt();

        switch (numbersEnter){
            case 1:
                System.out.println("Monday ");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("no weekday numbers");
        }
    }

    //Write a Java program to find the number of days in a month.
    public static void numberOfDaysInAmoth(){
        String enterMoth = "";
        int enterNumberMoth = 0;
        System.out.println("================================");


        int moth = 2;
        int year = 2010;

        if (moth == 2){
            enterMoth = "Fevral";
            if ((year % 400 == 0) || (year %4 == 0) && (year%100 != 0)){
                enterNumberMoth = 29;
            }else {
                enterNumberMoth = 28;
            }
        }else {
            System.out.println("...");
        }

        System.out.println("Ay :" + enterMoth + "Gun: "+ enterNumberMoth);
    }

    //10. Write a Java program to display the first 10 natural numbers.

    public static void naturalNumbersToDisplay(){
        for (int i=0;i<= 10;i++){
            System.out.println(i);
        }
    }

    //14. Write a Java program to display the multiplication table of a given integer.
    public static void multiplacationTableOfGivenInteger(){
        int a = 5;

        for(int i=1;i<=a;i++) {
            System.out.println(a + " * " + i + " = " + a * i);
        }
    }

    //15. Write a Java program that displays the sum of n odd natural numbers.
    public static void sumOfOddNaturalNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ne qeder eded daxil edilecek qeyd edin: ");
        int numberEnter = sc.nextInt();


        int sumNumber = 0;
        for (int i=1;i<=numberEnter;i++){
            int inputNumber = sc.nextInt();
            sumNumber = inputNumber+=sumNumber;
        }
        System.out.println(sumNumber);
    }

    //16. Write a Java program to display the pattern like a right angle triangle with a number.

    public static void rightAngleWithNumbers(){
        for (int i=1;i<=10;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }





}
