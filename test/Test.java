import java.util.Scanner;


public class Test {

    public static void factorial(int fact){
        if(fact == 0){
            return ;
        }else {   
            return fact + factorial(fact-1);
        }
    }
    

    public static void main(String[] args) {
//         // for(int i = 1; i<11 ; i++){
//         //     System.out.println(i);
//         //     int num =+ i;
//         //     System.out.println(num!);



        Scanner scr = new Scanner(System.in);

        System.out.print("원하는 수를 입력하세요 > ");
        String fact = scr.next();

        System.out.println(fact +"의 팩토리얼은 " + factorial(fact) +"입니다.");


    }
}