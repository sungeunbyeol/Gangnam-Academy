public class PrintTriangle {
    public String printTriangle(int num){

        // 일반 삼각형 만들기
        // String star = "";

        // for(int i = 0; i < num; i++){
        //     for(int j = 0; j <= i; j++){
        //         star+="*";
        //     }
        //     star += "\n";            
        // }
        // return star; 

        // 역삼각형 만들기
        for(int i = 0; i <= num; i++){
            for(int j = num ; j > i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        return "";
    }


    public static void main(String[] args) {
        PrintTriangle pt = new PrintTriangle();
        System.out.println(pt.printTriangle(5));
    }
}
