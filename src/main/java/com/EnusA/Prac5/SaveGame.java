package com.EnusA.Prac5;

/**
 * Created by enusa on 2017/04/02.
 */
public class SaveGame {
    public SaveGame (String nm, String jb, int lvl, int str, int def, int stm, int vit, int acc, int iq){
        PlayerInfo characterData = new PlayerInfo(nm,jb,lvl,str,def,stm,vit,acc,iq);
        PlayerInfo newSave = (PlayerInfo) characterData.cloneIt();
        System.out.println("Data has been saved");
    }
}
//Prototype