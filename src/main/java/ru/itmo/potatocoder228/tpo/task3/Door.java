package ru.itmo.potatocoder228.tpo.task3;

public class Door implements Nameable {
    private final String name = "Door";
    public String beat(){
        String action = name+" Beat";
        System.out.println(action);
        return action;
    }

    public String getName(){
        return this.name;
    }
}
