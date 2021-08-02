import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 1;

        System.out.print("1~10 사이의 정수 입력 : ");
        int userValue = sc.nextInt();

        if(userValue < 0 || userValue > 10){
            while(userValue < 0 || userValue > 10){
                System.out.print("1~10 사이의 정수 입력 : ");
                userValue = sc.nextInt();
            }
            for(int i =userValue; i>0; i--){
                sum = sum * i;
            }
            System.out.print(userValue + "! : " + sum);
        }
    }
}