package basics;

public class FizzBuzz {
    public static String getString(int n) {
       String result = "";

       for(int i=1; i<=n; i++) {
        if(i%3 == 0 && i%5 == 0) {
            result += "FizzBuzz ";
        } else if(i%3 == 0) {
            result += "Fizz ";
        } else if(i%5 == 0) {
            result += "Buzz ";
        } else {
            result += i + " ";
        }
       }

       return result;
    }

    public static void main(String[] args) {
        System.out.println(getString(3));
        System.out.println(getString(5));
        System.out.println(getString(15));
    }
}
