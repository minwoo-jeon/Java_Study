package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intVluae =10;
        long longValue;
        double doubleValue;

        longValue = intVluae; // int ->long 가능
        System.out.println("longValue = " +longValue );
        
        doubleValue = intVluae; //int ->double 가능
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20l; //long -> double 가능
        System.out.println("doubleValue2 = " + doubleValue);
    }
}
