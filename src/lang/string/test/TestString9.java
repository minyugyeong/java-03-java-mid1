package lang.string.test;

public class TestString9 {

    public static void main(String[] args) {
        String email = "hello@example.com";
        String[] array = email.split("@");

        String id = array[0];
        String domain = array[1];

        System.out.println("ID : " + id);
        System.out.println("Domain : " + domain);
    }
}
