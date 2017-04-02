package com.EnusA.Prac5;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by enusa on 2017/04/02.
 */
public class SaveGameTest {
    @Test
    public void testNewSave(){
        SaveGame newSave = new SaveGame("Updated","Game Data",5,10,15,20,25,
                30,35);
        assertNotNull("This class is null xfailx",newSave);
    }

}