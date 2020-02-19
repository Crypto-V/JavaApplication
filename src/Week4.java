import java.util.Scanner;

public class Week4 {
    public static void main(String[] args) {
        numberSize();
    }
    public static void numberSize(){
        Scanner Imput =new Scanner(System.in);
        System.out.println("Enter a number : ");
        int value=Imput.nextInt();
        if(value>50){
            System.out.println("Number entered is greater that 50");
        }else {
            System.out.println("I am doing nothing...");
        }
    }
}
