import java.util.Scanner; 

public class softwareDev {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); 
        System.out.println("Enter the age:"); 
        int age = input.nextInt();
        input.close();

        if (age >= 18) {
            System.out.println("Give the driving licence");
        } else { 
            System.out.println("Don't give the DL"); 
        }        
    }
}


