package rpg_lab;

import org.junit.Test;

import static org.junit.Assert.*;

public class DummyTest {
    @Test
    public void testDummyLosesHealthWhenAttacked(){
        Dummy dummy = new Dummy(100,100);
        dummy.takeAttack(10);

        assertEquals(90,dummy.getHealth());
    }
    @Test (expected = IllegalStateException.class)
    public  void testDeadDummyCannotBeAttacked(){
        Dummy dummy = new Dummy(0,100);
        dummy.takeAttack(10);
    }
    @Test
    public  void testDeadDummyGivesExperience() {
        Dummy dummy = new Dummy(0, 100);
        assertEquals(100, dummy.giveExperience());
    }
    @Test (expected = IllegalStateException.class)
    public void testAliveDummyShouldNotGiveExperience(){
        Dummy dummy = new Dummy(100, 100);
        dummy.giveExperience();
    }
}