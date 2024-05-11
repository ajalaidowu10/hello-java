package arrays;
public class StringManipulationExample {
    public static void main(String[] args) {
        String data = "Hello World";
        System.out.println(data);
        System.out.println(data.toLowerCase());
        System.out.println(data.toUpperCase());
        System.out.println(data.trim());
        System.out.println(data.length());
        System.out.println(data.split(" ")[1]);
        System.out.println(data.substring(0, 5));
    }
}