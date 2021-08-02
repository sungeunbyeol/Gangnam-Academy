public class MyCalTest {
    public static void main(String[] args) {
        Calculator cal = new MyCal();
        cal.plus(3,4);
        cal.exec(5,6);
        int i = cal.exec(5,6);
        System.out.println(i);

        Calculator.exec2(3,4);
    }
}
