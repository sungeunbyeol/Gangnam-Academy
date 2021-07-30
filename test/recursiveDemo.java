public class recursiveDemo {
    
    public static void main(String[] args) {

        System.out.println("1부터 5까지의 합은 : " + Function(5));
    }

    // public static void Function(int num){
    //     if(num == 0){
    //         return;
    //     }else {   
    //         System.out.println("hi");
    //         Function(num-1);
    //     }
    // }

    public static int Function(int n){
        if(n == 1){
            return 1;
        }else {   
            return n + Function(n * 1);
        }
    }


}
