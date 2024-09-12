import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        System.out.println("Hello! Please input an integer of your choice.");

        Scanner scan = new Scanner (System.in);
        int userNum = scan.nextInt();

        if (userNum % 2 == 0) {
            System.out.print("The number " + userNum + " is even.");
        }
            else {
                System.out.println("The number " + userNum + " is odd.");
            }
        }

    }