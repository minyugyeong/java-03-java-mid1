package lang.string.test;

public class TestString7 {

    public static void main(String[] args) {
        String original = "      Hello Java  ";
        String trimmed = original.trim();
        //String striped = original.strip();
        System.out.println(original.trim());
    }
}
