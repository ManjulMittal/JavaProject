import java.util.Scanner;

public class TwentyOneSticks{
    private static Scanner input;

    public static void main(String []args) {
        int no_of_sticks = 21; //this allows choosing from a total of 21 sticks
        System.out.print("Do you want to play first? (y/n) "); //you can choose to play first or second
        input = new Scanner(System.in);
        String first_attempt = input.nextLine();
        int input_num = 0;
        while(no_of_sticks > 0){
            if(first_attempt.equals("Y") || first_attempt.equals("y")){
                System.out.println("Currently, " + no_of_sticks + " sticks are available");
                System.out.print("Pick your sticks (1 or 2) ");
                input_num = input.nextInt();
                if(input_num > 2){
                    input_num = 2;
                }else if(input_num < 1){
                    input_num = 1;
                }
                no_of_sticks -= input_num;
                if(no_of_sticks <= 0){
                    System.out.println("You have lost the game!!!");
                }else{
                    if((no_of_sticks - 2) % 3 == 0){
                        input_num = 1;
                    }else{
                        input_num = 2;
                    }
                    System.out.println("Your opponent picks " + input_num + " sticks");
                    no_of_sticks -= input_num;
                    if(no_of_sticks <= 0){
                        System.out.println("YAY! You have won the game!!!");
                    }
                }
            }else{
                if((no_of_sticks - 2) % 3 == 0){
                    input_num = 1;
                }else{
                    input_num = 2;
                }
                System.out.println("Your opponent picks " + input_num + " sticks");
                no_of_sticks -= input_num;
                if(no_of_sticks <= 0){
                    System.out.println("YAY! You have won the game!!!");
                }else{
                    System.out.println("Currently, " + no_of_sticks + " sticks are available");
                    System.out.print("Pick your sticks (1 or 2) ");
                    input_num = input.nextInt();
                    if(input_num > 2){
                        input_num = 2;
                    }else if(input_num < 1){
                        input_num = 1;
                    }
                    no_of_sticks -= input_num;
                    if(no_of_sticks <= 0){
                        System.out.println("You have lost the game!!!");
                    }
                }
            }
        }
        
    }
}