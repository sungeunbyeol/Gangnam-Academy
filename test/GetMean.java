public class GetMean {
    public int getMean(int[] array) {
        int sum = 0;
        
        // for(int i = 0; i<array.length;i++)
        for(int arr : array){
            sum += arr;
        }
        return sum/array.length;

    }

    public static void main(String[] args) {
         int x[] = {5, 4, 3};
        GetMean getMean = new GetMean();
        // 아래는 테스트로 출력해보기 위한 코드입니다.
        System.out.println("평균값 : " + getMean.getMean(x));
    }
}
