package lang.string.test;

public class TestString10 {

    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String[] array = fruits.split(",");

        for (String string : array) {
            System.out.println(string);
        }

        String joinedString = String.join("->", array);
        System.out.println("joinedString = " + joinedString);
    }
}
