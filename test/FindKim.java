public class FindKim {
    public String findKim(String[] seoul){



        String x;


        for(String se : seoul){
            if(se.equals("Kim")){
                x = se;
            }
        }

        return "김 서방은 " + x + " 에 있다";
    }


    public static void main(String[] args) {
        FindKim kim = new FindKim();
        String[] names = {"Queen", "Tod", "Kim"};
        System.out.println(kim.findKim(names));
    }
}
