package javaStudy;

public class VariableScopeExam {
    int globalScope = 10; //전역변수
    static int staticval = 7 ;

    public void scopeTest(int value){
        int localScope = 20; //지역변수

        System.out.println(globalScope);
        System.out.println(localScope);
        System.out.println(value);
    }

    public void scopeTest2(int value2){
        System.out.println(globalScope);
        // System.out.println(localScope);
        // System.out.println(value);
        System.out.println(value2);
    }

    public static void main(String[] args) {
        // System.out.println(globalScope);
        // System.out.println(localScope);
        // System.out.println(value);
        System.out.println(staticval);

        VariableScopeExam v1 = new VariableScopeExam();
        System.out.println(v1.globalScope);

        VariableScopeExam v2 = new VariableScopeExam();
        v1.globalScope = 10;
        v2.globalScope = 20;
        System.out.println(v1.globalScope);
        System.out.println(v2.globalScope);
        v1.staticval = 50;
        v2.staticval = 100;
        VariableScopeExam.staticval = 200;

        System.out.println(v1.staticval);
        System.out.println(v2.staticval);
        System.out.println(VariableScopeExam.staticval);
    }
    
}
