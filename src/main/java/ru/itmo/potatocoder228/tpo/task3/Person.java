package ru.itmo.potatocoder228.tpo.task3;

public class Person {
    private String name = "Marvin";
    private Schema schema = new Schema();;
    public Person(String name){
        this.name = name;
    }
    public Person(){}

    public String watch(){
        String action = name+" Watch";
        System.out.println(action);
        return action;
    }

    public Schema getSchema(){
        return schema;
    }

    public String getName(){
        return this.name;
    }
}
