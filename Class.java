package net.amber.culminating;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Class {
    protected String className;
    protected String subclassName;
    protected String savingThrowProf1;
    protected String savingThrowProf2;
    protected String savingThrowProf3;
    protected String hitDieType;
    protected int hitDice;
    protected String requiredStats;
    protected int minReqStats;
    protected Skill[] possibleProficientSkills;
    protected String startingEquipment;
    protected int[] ASILevels;
    protected int subclassLvl;
    protected Class[] subclassOptions;
    protected Skill[] bonusProficiency;
    protected int noStartSkills;
    protected String expertise1;
    protected String expertise2;
    protected String expertise3;
    protected String expertise4;

    public Class(String cN, String scN, String sTP1, String sTP2, String sTP3, String hDT, int hD, String reqStats, int mRS, Skill[] pPS, String sE, int scLvl, Class[] scOps, Skill[] bp, int nSS) {
        className = cN;
        subclassName = scN;
        savingThrowProf1 = sTP1;
        savingThrowProf2 = sTP2;
        savingThrowProf3 = sTP3;
        hitDieType = hDT;
        hitDice = hD;
        requiredStats = reqStats;
        minReqStats = mRS;
        possibleProficientSkills = pPS;
        startingEquipment = sE;
        ASILevels = new int[]{4, 8, 12, 16, 19};
        subclassLvl = scLvl;
        subclassOptions = scOps;
        bonusProficiency = bp;
        noStartSkills = nSS;
        expertise1 = "";
        expertise2 = "";
        expertise3 = "";
        expertise4 = "";
    }
    public Class() {
        className = "";
    }
    public String getSubclassName() {
        return subclassName;
    }

    public int getNoStartSkills() {
        return noStartSkills;
    }
    public void setExpertiseSkill(int c, String skl) {
        skl = skl.substring(0,1).toUpperCase() + skl.substring(1).toLowerCase();
        if (c == 1)
            expertise1 = skl;
        if (c == 2)
            expertise2 = skl;
        if (c == 3)
            expertise3 = skl;
        if (c == 4)
            expertise4 = skl;
    }

    public String getExpertise1() {
        return expertise1;
    }
    public String getExpertise2() {
        return expertise2;
    }
    public String getExpertise3() {
        return expertise3;
    }
    public String getExpertise4() {
        return expertise4;
    }

    public String getClassName() {
        return className;
    }
    public void update(PlayerCharacter p) {
        hitDice = p.getLvl();
    }
    public int getSubclassLvl() {
        return subclassLvl;
    }
    public void exportClassInfo(PlayerCharacter p) throws IOException {
        String fileName = p.getName();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
        update(p);
        if (!savingThrowProf3.equalsIgnoreCase(""))
            out.println("Saving Throw Proficiencies: " + savingThrowProf1 + " & " + savingThrowProf2 + " & " + savingThrowProf3);
        else
            out.println("Saving Throw Proficiencies: " + savingThrowProf1 + " & " + savingThrowProf2);
        out.println("Hit Dice: " + hitDice + hitDieType);
        out.println("Starting Equipment:\n" + startingEquipment);
        out.print("ASIs at Levels: [");
        for (int i = 0; i < ASILevels.length - 1; i++) {
            out.print(ASILevels[i] + ", ");
        }
        out.print(ASILevels[ASILevels.length - 1]);
        out.print("]");
        out.println("");
        out.println("Subclass Choice Level: " + subclassLvl);
        out.close();
    }
    public Class[] getSubclassOptions() {
        return subclassOptions;
    }
    public boolean hasBonusProficiency() {
        return false;
    }
    public String getBonusProficiency() {
        return "";
    }

    public void setSavingThrowProf3(String sTP3) {
        savingThrowProf3 = sTP3;
    }
}
