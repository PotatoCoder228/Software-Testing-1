package ru.itmo.potatocoder228.tpo;

import static org.junit.Assert.*;

import org.junit.Test;

import ru.itmo.potatocoder228.tpo.task3.*;

public class DomenModelTest {
    @Test
    public void TestDoor() {
        Door door = new Door();
        assertTrue("Door Beat".equals(door.beat()));
    }

    @Test
    public void TestRobot() {
        Robot Robot = new Robot();
        assertTrue("Robot Turn LEFT".equals(Robot.turn(Direction.LEFT)));
    }

    @Test
    public void TestPerson() {
        Person person = new Person();
        Nameable object = new Door();
        assertTrue("Marvin Watch Door".equals(person.watch(object)));
    }

    @Test
    public void TestSchema() {
        Person person = new Person();
        Schema schema = person.getSchema();
        Nameable object = new Door();
        assertTrue("Schema Manipulate".equals(schema.manipulate()));
        assertTrue("Schema Chirping".equals(schema.chirping()));
        assertTrue("Schema Snap".equals(schema.snap()));
        assertTrue("Schema Say".equals(schema.say()));
        assertTrue("Schema Fun".equals(schema.fun()));
        assertTrue("Schema Analyze Door".equals(schema.analyze(object)));
        assertTrue("Schema Measure Door".equals(schema.measure(object)));
        assertTrue("Schema Shutdown".equals(schema.shutdown()));
    }
}
