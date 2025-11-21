import java.util.Scanner;

public class RichshawFare
{
    public static void main(String[] args){
        
        float base=30;
        float perkm=15;
        double permin=5;
        double discount=0.15;
        double night=0.25; 
        
        Scanner sc= new Scanner(System.in);
        System.out.println("\n\t\tWelcome to fare calculator");
        
        System.out.println("\n\tAre you a local or a foreigner? L/F");
        String cus=sc.nextLine();
        
        System.out.println("\tIs it night time? Y/N");
        String timing=sc.nextLine();
        
        System.out.println("\n\tEnter the distance needed to travel");
        double distance=sc.nextDouble();
        System.out.println("\n\tEnter the time taken to travel");
        int time=sc.nextInt();
        
        double fare=base+(perkm*distance)+(permin*time);
        
        double localdiscount=((cus.equals("L") || cus.equals("l"))&&distance>10)? fare*discount : 0 ;
            fare= fare-localdiscount;
        
        double nightsurcharge=(timing.equals("Y") || timing.equals("y"))? fare*night : 0 ;
            fare= fare+nightsurcharge;
        
        System.out.println("\n\t\tYour total fare is :"+fare);
        
        
    }
}