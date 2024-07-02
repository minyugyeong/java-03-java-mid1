package lang.string.test;

public class TestString5 {

    public static void main(String[] args) {
        String str = "hello.txt";

        int splitIndex = str.indexOf(".");
        String filename = str.substring(0, splitIndex);
        String extName = str.substring(splitIndex);

        System.out.println("filename = " + filename);
        System.out.println("extName = " + extName);
    }
}
