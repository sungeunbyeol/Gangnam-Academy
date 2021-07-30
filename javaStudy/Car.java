package javaStudy;

public class Car {
    String name; // 객체변수
    int number; // 객체변수
    
    public Car(){
        this("이름없음",0);
    } 

    public Car(String name){
        this(name, 0);
    }

    public Car(String name, int number){
        this.name = name;
        this.number = number;
    }
}
