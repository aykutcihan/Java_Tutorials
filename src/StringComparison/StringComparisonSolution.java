package StringComparison;

public class StringComparisonSolution {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";
        String str3 = "Java3";
        String str4 = new String("Java");

        // using the "==" operator to compare references/addresses
        System.out.println(str1 == str2); // true because both strings are string literals and share the same memory address
        System.out.println(str1 == str3); // false because both strings have different values and memory addresses
        System.out.println(str1 == str4); // false because str4 is a new string object created with the "new" keyword and has a different memory address than str1 and str2

        // using the "equals()" method to compare values/contents
        System.out.println(str1.equals(str2)); // true because both strings have the same value
        System.out.println(str1.equals(str3)); // false because both strings have different values
        System.out.println(str1.equals(str4)); // true because both strings have the same value

        // using the "compareTo()" method to compare lexicographically
        System.out.println(str1.compareTo(str2)); // 0 because both strings have the same value
        System.out.println(str2.compareTo(str3)); // negative because "Java" comes before "Java3" lexicographically
        System.out.println(str3.compareTo(str1)); // positive because "Java3" comes after "Java" lexicographically
    }
}
