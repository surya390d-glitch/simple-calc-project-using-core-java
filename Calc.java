import java.util.Scanner;
public class Calc{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while(true){
            System.out.println("Enter operation (+, -, *, /): ");
            char op = in.next().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/'){
                System.out.println("Enter two numbers: ");
                int a = in.nextInt();
                int b = in.nextInt();
                if(op == '+'){
                    ans = a+b;
                    System.out.println("result :" + ans);
                }
                if(op == '-'){
                    ans = a-b;
                    System.out.println("result :" + ans);
                }
                if(op == '*'){
                    if(a!=0 && b!=0){
                        ans = a*b;
                        System.out.println("result :" + ans);
                    }
                    else{
                        System.out.println("Multiplication by zero is not allowed.");
                    }
                }
                if(op == '%'){
                    System.out.println("result: " + (a%b));
                }
                if(op == '/'){
                    ans = a/b;
                    System.out.println("result :" + ans);
                }           
            }
            else if(op == 'x' || op == 'X'){
                break;
            }
            else{
                System.out.println("invalid arithmetic operation..");
            }
        }
        in.close();
    }
}