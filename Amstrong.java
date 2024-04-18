import java.util.Scanner;
public class Armstrong {

    public static void main(String[] args) {

        int number, originalNumber, remainder, result = 0;
        Scanner n = new Scanner(System.in);
        System.out.println("enter the number : ");
        number = n.nextInt();
        

        originalNumber = number;
        String s = Integer.toString(originalNumber);
        int l = s.length();

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, l);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}
