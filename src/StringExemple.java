import java.util.Locale;

public class StringExemple {
    public static void main(String[] args) {
        String StringA = "Hello";
        String StringB = new String("Hello");
        String StringC = new String("hello");
        if(StringA == StringC)
           System.out.println("StringA and StringB point to the same object");
        else
            System.out.println("StringA and StringB do not point to the same object");
        System.out.println("Length of string StringA is " + StringA.length());
        System.out.println("the upper case of string StringA is :   " + StringA.toUpperCase());
        System.out.println("the lower case of string StringA is :   " + StringA.toLowerCase());
        System.out.println("the index of the char 'e' of string StringA is :   " + StringA.indexOf('e'));
        System.out.println("the last index of the char 'l' of string StringA is :   " + StringA.lastIndexOf('l'));
        System.out.println("the Char of the index 3 of string StringA is :   " + StringA.charAt(3));
        System.out.println("the StringB is the same as StringA :   " + StringA.equals(StringB));
        System.out.println("the StringC is the same as StringA :   " + StringA.equals(StringC));
    }
}
