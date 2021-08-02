public class InnerExam1 {
    class Cal{
        int value = 0;
        public void plus(){
            value++;
        }
    }


    public static void main(String[] args) {
        InnerExam1 t = new InnerExam1();
        // t.new Cal();
        InnerExam1.Cal cal = t.new Cal(); // -> FM으로 쓴다면.
        cal.plus();
        System.out.println(cal.value);
    }
}
