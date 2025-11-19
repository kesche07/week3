public class DefaultValues
{       byte byteVar;         
        short shortVar;   
        int intVar;        
        long longVar;
        
        float floatVar;     
        double doubleVar;   

        char charVar;          
        
        boolean booleanVar;
    public static void main(String[] args){
        DefaultValues x=new DefaultValues();
          

        System.out.println("\nInteger variable types");
        
        System.out.println("Default Byte value: " + x.byteVar);
        System.out.println("Default Short value: " + x.shortVar);
        System.out.println("Default Integer value: " + x.intVar);
        System.out.println("Default Long value: " + x.longVar);
        
        System.out.println("\nFloat variable types");
        System.out.println("Default Float value: " + x.floatVar);
        System.out.println("Default Double value: " + x.doubleVar);
        
        System.out.println("\nCharacter variable types");
        System.out.println("Default Character value: " + x.charVar);
        
        System.out.println("\nBoolean ");
        System.out.println("Default Boolean value: " + x.booleanVar);
    }
}