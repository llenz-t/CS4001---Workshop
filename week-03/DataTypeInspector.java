public class DataTypeInspector
{
    public static void main (String[]args)
    {
        byte a = 100;                  
        short b = 30000;              
        int c = 100000;                 
        long d = 10000000000L;         
        float e = 3.14f;              
        double f = 3.14159265359;    
        char g = 'A';                  
        boolean h = true;           

        
        System.out.println("Byte: " + a);
        System.out.println("Short: " + b);
        System.out.println("Int: " + c);
        System.out.println("Long: " + d);
        System.out.println("Float: " + e);
        System.out.println("Double: " + f);
        System.out.println("Char: " + g);
        System.out.println("Boolean: " + h);
    }
}