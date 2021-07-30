package javaStudy;

public class Car {
    String name; // 객체변수
    int number; // 객체변수
    
    public Car(){
        this.name = "이름없음";
        this.number = 0;
    } 

    public Car(String name){
        this.name = name;
    }

    public Car(String name, int number){
        this.name = name;
        this.number = number;
    }
}
