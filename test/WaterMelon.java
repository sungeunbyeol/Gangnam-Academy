public class WaterMelon {
    public String watermelon(int n){

        String resultStr="";
        for(int i =0; i < n; i++){
            resultStr += (i % 2 == 0) ? "수" : "박";
        }
        return resultStr;






    }

    public static void main(String[] args) {
        WaterMelon wm = new WaterMelon();
        System.out.println("n이 3인 경우: " + wm.watermelon(3));
        System.out.println("n이 4인 경우: " + wm.watermelon(4));
    }
}
