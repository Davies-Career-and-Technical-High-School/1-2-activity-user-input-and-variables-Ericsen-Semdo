/* Activity 1.2 - Question 3 */

import java.util.Scanner;

class Question3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String n;
        String a;

        System.out.println("Hi there. What is your name?");
        n = scan.nextLine();
        System.out.println("What adjective describes you?");
        a = scan.nextLine();
        System.out.println("My name is " + n + ". I am " + a + ".");

    }
}