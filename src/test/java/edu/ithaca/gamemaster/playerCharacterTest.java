package edu.ithaca.gamemaster;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class playerCharacterTest {
    @Test
    void createPlayerTest(){
        Player testPlayer = new Player("Frodo");
        testPlayer.setHP(1000);
        assertEquals(1000,testPlayer.getHP());
    }
}
