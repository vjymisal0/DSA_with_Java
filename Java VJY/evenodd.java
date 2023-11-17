public class evenodd {
    
    public static void main(String[] args) {
        int num = 3;
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}

class palindrome
{
    public static void main(String[] args) {
        int num = 121;
        int temp = num;
        int rev = 0;
        while (temp != 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }
        if (rev == num) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}