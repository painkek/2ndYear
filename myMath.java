import java.util.Scanner;

public class myMath {

    static Scanner sc = new Scanner(System.in);
    static byte userSum;
    public static void main(String[] args){

        runChoices();

}
    static void runChoices(){

        //USER STEP ONE, choices
            System.out.println("------------- Choose Method -------------");
            System.out.println(" 1. Sum of 2 integers " +
                            "\n 2. Sum of 3 integers " +
                            "\n 3. Sum of 4 integers" +
                            "\n 4. Exit ");
                            int userChoose = sc.nextInt();

            if(userChoose == 1){
                runSumoftwoInt();
            }else if (userChoose == 2){
                runSumofthreeInt();
            }else if (userChoose == 3){
                runSumoffourInt();
            }else if (userChoose == 4){
                System.out.println("Thank you!");
            }else if (userChoose > 4){
                System.out.println("Invalid Input! Please Choose again (1, 2, 3):");
                runChoices();
            }
        }

    static void runSumoftwoInt(){
        System.out.println("Input first integer: ");
        int a = sc.nextInt();

        System.out.println("Input second integer: ");
        int b = sc.nextInt();
        
        System.out.println("Sum of Integer: " + add(a, b));
        
        System.out.println("Do you want to find sum again?" + "\n 1. Yes" + "\n 2. No");
        userSum = sc.nextByte();

        switch (userSum) {
            case 1:
                runChoices();
            default:
                System.out.println("Thank you!");
                break;
        }
    }
    static void runSumofthreeInt(){
        System.out.println("Input first integer: ");
        int a = sc.nextInt();

        System.out.println("Input second integer: ");
        int b = sc.nextInt();

        System.out.println("Input third integer: ");
        int c = sc.nextInt();
        
        System.out.println("Sum of Integer: " + add(a, b, c));
        System.out.println("Do you want to find sum again?" + "\n 1. Yes" + "\n 2. No");
        userSum = sc.nextByte();

        switch (userSum) {
            case 1:
                runChoices();
            default:
                System.out.println("Thank you!");
                break;
        }

    }
    static void runSumoffourInt(){
        System.out.println("Input first integer: ");
        int a = sc.nextInt();

        System.out.println("Input second integer: ");
        int b = sc.nextInt();

        System.out.println("Input third integer: ");
        int c = sc.nextInt();

        System.out.println("Input fourth integer: ");
        int d = sc.nextInt();
        
        System.out.println("Sum of Integer: " + add(a, b, c, d));
        System.out.println("Do you want to find sum again?" + "\n 1. Yes" + "\n 2. No");
        userSum = sc.nextByte();

        switch (userSum) {
            case 1:
                runChoices();
            default:
                System.out.println("Thank you!");
                break;
        }

    }
    
    static int add(int a, int b){

        int sum = a + b;
        return sum;

    }
    static int add(int a, int b, int c){
        
        int sum = a + b + c;
        return sum;
    }
    static int add(int a, int b, int c, int d ){

        int sum = a + b + c + d;
        return sum;

    }
}
