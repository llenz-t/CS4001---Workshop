public class DefaultValues {
    
    byte byteValue;
    short shortValue;
    int intValue;
    long longValue;
    float floatValue;
    double doubleValue;
    char charValue;
    boolean booleanValue;

    public static void main(String[] args) {
        DefaultValues obj = new DefaultValues();


        System.out.println("Default byte value: " + obj.byteValue);
        System.out.println("Default short value: " + obj.shortValue);
        System.out.println("Default int value: " + obj.intValue);
        System.out.println("Default long value: " + obj.longValue);
        System.out.println("Default float value: " + obj.floatValue);
        System.out.println("Default double value: " + obj.doubleValue);
        System.out.println("Default char value: '" + obj.charValue + "'");
        System.out.println("Default boolean value: " + obj.booleanValue);
    }
}