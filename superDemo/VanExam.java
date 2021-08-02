public class VanExam {
    public static void main(String[] args) {
        Car c = new Van();
        c.run();
        // c.ppangppang();

        Van van = (Van) c;
        van.run();
        van.ppangppang();
    }
}
