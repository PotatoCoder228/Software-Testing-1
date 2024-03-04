package ru.itmo.potatocoder228.tpo.task3;

public class Schema implements Nameable{
    private final String name = "Schema";
    public String manipulate(){
        String action = "Schema Manipulate";
        System.out.println(action);
        return action;
    }

    public String chirping(){

        String action = "Schema Chirping";
        System.out.println(action);
        return action;
    }

    public String snap(){
        String action = "Schema Snap";
        System.out.println(action);
        return action;
    }

    public String say(){
        String action = "Schema Say";
        System.out.println(action);
        return action;
    }

    public String fun(){

        String action = "Schema Fun";
        System.out.println(action);
        return action;
    }

    public String analyze(Nameable object){
        String action = "Schema Analyze "+object.getName();
        System.out.println(action);
        return action;
    }

    public String measure(Nameable object){
        String action = "Schema Measure "+object.getName();
        System.out.println(action);
        return action;
    }

    public String shutdown(){
        String action = "Schema Shutdown";
        System.out.println(action);
        return action;
    }

    public String getName(){
        return this.name;
    }
}
