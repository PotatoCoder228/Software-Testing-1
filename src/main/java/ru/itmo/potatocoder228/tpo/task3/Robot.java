package ru.itmo.potatocoder228.tpo.task3;

public class Robot {
    public String turn(Direction dir){
        String action = "Robot Turn "+dir.name();
        System.out.println(action);
        return action;
    }
}
