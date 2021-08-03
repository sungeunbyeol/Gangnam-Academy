public class StringExercisessam {

    char middleWord;

    char getMiddle(String word) {

        int index = word.length() / 2;

        if(word.length() % 2 == 0){ // 짝수 케이스
            middleWord = word.charAt(index-1);
            System.out.print(middleWord);
        }
            middleWord = word.charAt(index);
        

        return middleWord;
       
        }

        // 아래는 테스트로 출력해보기 위한 코드입니다.
        public static void  main(String[] args) {
            StringExercisessam se = new StringExercisessam();
            System.out.println(se.getMiddle("power"));
            System.out.println(se.getMiddle("test"));
        }
}
