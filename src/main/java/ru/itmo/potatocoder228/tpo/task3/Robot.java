package ru.itmo.potatocoder228.tpo.task3;

public class Robot implements Nameable{
    private final String name = "Robot";
    public String turn(Direction dir){
        String action = name+" Turn "+dir.name();
        System.out.println(action);
        return action;
    }

    public String getName(){
        return this.name;
    }
}
