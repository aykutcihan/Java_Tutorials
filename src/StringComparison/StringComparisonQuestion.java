package StringComparison;

public class StringComparisonQuestion {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";
        String str3 = "Java3";
        String str4 = new String("Java");

        // using the "==" operator to compare references/addresses
        System.out.println(str1 == str2); // true or false?
        System.out.println(str1 == str3); // true or false?
        System.out.println(str1 == str4); // true or false?

        // using the "equals()" method to compare values/contents
        System.out.println(str1.equals(str2)); // true or false?
        System.out.println(str1.equals(str3)); // true or false?
        System.out.println(str1.equals(str4)); // true or false?

        // using the "compareTo()" method to compare lexicographically
        System.out.println(str1.compareTo(str2)); // 0 or positive or negative?
        System.out.println(str2.compareTo(str3)); // 0 or positive or negative?
        System.out.println(str3.compareTo(str1)); // 0 or positive or negative?

//      Answer each question with either true or false for the boolean expressions,
//      and a number (positive, negative, or zero) for the compareTo() method calls.

    }
}

