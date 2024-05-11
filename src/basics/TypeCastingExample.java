package basics;
public class TypeCastingExample {
    public static void main(String[] args) {
        int intValue = 10000;
        //Implicit typecasting from int to long
        long longValue = intValue;

        //Explict typecasting from integer to byte
        byte byteValue = (byte) intValue;

        System.out.println(longValue);
        System.out.println(byteValue);
    }
}