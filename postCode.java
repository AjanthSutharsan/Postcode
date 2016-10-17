
import java.util.Scanner;
public class postCode
{
    public static void convert(String postcode){
        String temp = postcode.toUpperCase();
        System.out.println(temp); 
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("What is your post code?");
        String PostCode = input.nextLine();
       convert(PostCode);
        
      
    }

}
