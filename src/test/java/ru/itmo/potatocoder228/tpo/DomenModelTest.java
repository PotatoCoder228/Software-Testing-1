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
        assertTrue("Marvin Watch".equals(person.watch()));
    }

    @Test
    public void TestSchema() {
        Person person = new Person();
        Schema schema = person.getSchema();
        assertTrue("Schema Manipulate".equals(schema.manipulate()));
        assertTrue("Schema Chirping".equals(schema.chirping()));
        assertTrue("Schema Snap".equals(schema.snap()));
        assertTrue("Schema Say".equals(schema.say()));
        assertTrue("Schema Fun".equals(schema.fun()));
        assertTrue("Schema Analyze".equals(schema.analyze()));
        assertTrue("Schema Check".equals(schema.check()));
        assertTrue("Schema Shutdown".equals(schema.shutdown()));
    }
}
