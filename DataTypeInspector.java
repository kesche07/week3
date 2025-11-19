
/**
 * Write a description of class DataTypeInspector here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DataTypeInspector
{
    public static void main(String[] args){
        byte byteVar = 100;          
        short shortVar = 32000;      
        int intVar = 100000;        
        long longVar = 1000000000L;  

        float floatVar = 3.14f;    
        double doubleVar = 3.14159265359;  
        
        char charVar = 'A';          
        
        boolean booleanVar = true;  

        System.out.println("\nInteger variable types");
        
        System.out.println("Byte value: " + byteVar);
        System.out.println("Short value: " + shortVar);
        System.out.println("Integer value: " + intVar);
        System.out.println("Long value: " + longVar);
        
        System.out.println("\nFloat vairable types");
        System.out.println("Float value: " + floatVar);
        System.out.println("Double value: " + doubleVar);
        
        System.out.println("\nCharacter variable types");
        System.out.println("Character value: " + charVar);
        
        System.out.println("Boolean ");
        System.out.println("\nBoolean value: " + booleanVar);
    }
}