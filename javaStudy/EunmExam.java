package javaStudy;

public class EunmExam {
    //fianl은 변수를 상수처럼 사용할 때 사용. 안바뀌도록.
    // 상수를 사용할 땐 대문자 사용
    public static final String MALE="MALE";
    public static final String FEMALE="FEMALE";

    
    
    public static void main(String[] args) {
        String gender1;
        gender1 = EunmExam.MALE;
        gender1 = EunmExam.FEMALE;

        Gender gender2;
        gender2 = Gender.MALE;
        gender2 = Gender.FEMALE;
        // gender2 = "boy";
    }

}


enum Gender{ // 열거형에 들어가는 내용은 대문자 사용.
    MALE, FEMALE;
}
