import java.util.*;

public class Passwordchecker{

    public static void Strength_checker(String pass){
        int strength_points = 0;
        if(pass.length() >= 8){
            strength_points++;
        }
        if(pass.length() >= 12){
            strength_points++;
        }
        if(pass.matches(".*[A-Z].*")){
            strength_points++;
        }
        if(pass.matches(".*[a-z].*")){
            strength_points++;
        }
        if(pass.matches(".*[0-9].*")){
            strength_points++;
        }
        if(pass.matches(".*[^A-Za-z0-9].*")){
            strength_points++;
        }

        if(strength_points <= 2){
            System.out.println("Very weak password");
        }else if(strength_points == 3){
            System.out.println("Weak password");
        }else if(strength_points == 4){
            System.out.println("Moderate password");
        }else if(strength_points == 5){
            System.out.println("Strong password");
        }else{
            System.out.println("Very strong password");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the password : ");
        String password = sc.nextLine();

        Strength_checker(password);
    }
}