package javaStudy;

public class MyClass2 {
    public int plus (int x, int y){
        return x+y;
    }

    // public int plus (int i, int j){
    //     return x+y;
    // }

    public int plus (int x, int y, int z){
        return x+y+z;
    }

    public String plus(String x, String y){
        return x + y;
    }


    public static void main(String[] args) {
        MyClass2 m = new MyClass2();

        System.out.println(m.plus(4,5));
        System.out.println(m.plus(4,6,7));
        System.out.println(m.plus("hello", "world"));
    }



}
