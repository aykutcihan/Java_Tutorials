package Questions.UniqueCharacterDetector;

public class UsingIndexOfAndLastIndexOf {

//    Write a program to check if characters 'm' and 'a' are unique in the string "miami" using the indexOf and lastIndexOf methods?


    public static void main(String[] args) {
        String str = "miami";
        char ch1 = 'm';
        char ch2 = 'a';
        boolean isUniqueM = (str.indexOf(ch1) == str.lastIndexOf(ch1));
        boolean isUniqueA = (str.indexOf(ch2) == str.lastIndexOf(ch2));
        System.out.println("Is the character '" + ch1 + "' unique in the string '" + str + "': " + isUniqueM);
        System.out.println("Is the character '" + ch2 + "' unique in the string '" + str + "': " + isUniqueA);
    }
}

