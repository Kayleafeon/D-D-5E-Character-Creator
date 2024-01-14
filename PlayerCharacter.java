package net.amber.culminating;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class PlayerCharacter {
    protected String name;
    protected int lvl;
    protected int str;
    protected int dex;
    protected int con;
    protected int intelligence;
    protected int wis;
    protected int cha;
    protected Class charClass;
    protected Class subclass;
    protected Race charRace;
    protected Background bkgrd;
    protected int profBonus;
    protected Skill[] skills;
    protected FightingStyle fightingStyle;
    public PlayerCharacter() {
        name = "";
        lvl = 0;
        charClass = new Class();
        str = 0;
        dex = 0;
        con = 0;
        intelligence = 0;
        wis = 0;
        cha = 0;
        profBonus = 0;
        skills = new Skill[]{new Acrobatics(), new AnimalHandling(), new Arcana(), new Athletics(), new Deception(), new History(), new Insight(), new Intimidation(), new Investigation(), new Medicine(), new Nature(), new Perception(), new Performance(), new Persuasion(), new Religion(), new SleightOfHand(), new Stealth(), new Survival()};
        fightingStyle = new FightingStyle("", "");
    }
    public PlayerCharacter(String n, int level, Class cC, Race cR, Background background) {
        name = n;
        lvl = level;
        charClass = cC;
        charRace = cR;
        bkgrd = background;
        str = 0;
        dex = 0;
        con = 0;
        intelligence = 0;
        wis = 0;
        cha = 0;
        setProfBonus(level);
        skills = new Skill[]{new Acrobatics(), new AnimalHandling(), new Arcana(), new Athletics(), new Deception(), new History(), new Insight(), new Intimidation(), new Investigation(), new Medicine(), new Nature(), new Perception(), new Performance(), new Persuasion(), new Religion(), new SleightOfHand(), new Stealth(), new Survival()};
    }
    public void exportCharacter(PlayerCharacter p) throws IOException {
        String fileName = getName();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, false)));
        charClass.update(p);
        out.println("Name: " + getName());
        out.println("Level: " + getLvl());
        out.println("Race: " + getCharRace().getRaceName());
        if (p.getLvl() >= p.getCharClass().getSubclassLvl())
            out.println("Class: " + getSubclass().getSubclassName() + " " + getCharClass().getClassName());
        else
            out.println("Class: " + getCharClass().getClassName());
        out.println("Background: " + getBkgrd());
        out.println("Str: " + getStr() + " " + getAbilityBonus(getStr()));
        out.println("Dex: " + getDex() + " " + getAbilityBonus(getDex()));
        out.println("Con: " + getCon() + " " + getAbilityBonus(getCon()));
        out.println("Int: " + getIntelligence() + " " + getAbilityBonus(getIntelligence()));
        out.println("Wis: " + getWis() + " " + getAbilityBonus(getWis()));
        out.println("Cha: " + getCha() + " " + getAbilityBonus(getCha()));
        out.println("Proficiency Bonus: +" + getProfBonus());
        out.print("Skill Proficiencies: [");
        for (int i = 0; i < getSkillProficiencies().length - 1; i++) {
            out.print(getSkillProficiencies()[i] + ", ");
        }
        out.print(getSkillProficiencies()[getSkillProficiencies().length - 1]);
        out.print("]");
        out.println("");
        out.close();
    }
    public int getLvl() {
        return lvl;
    }
    public String getName() {
        return name;
    }
    public Class getCharClass() {
        return charClass;
    }
    public Class getSubclass() { return subclass; }
    public Race getCharRace() { return charRace; }
    public String getCharRaceName() {
        return charRace.getRaceName();
    }
    public Background getBkgrd() {
        return bkgrd;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setLvl(int lvl) {
        this.lvl = lvl;
    }
    public void setCharClass(Class charClass) {
        this.charClass = charClass;
    }
    public void setSubclass(Class sc) {
        subclass = sc;
    }
    public void setCharRace(Race charRace) {
        this.charRace = charRace;
    }

    public int getStr() {
        return str;
    }
    public int getDex() {
        return dex;
    }
    public int getCon() {
        return con;
    }
    public int getIntelligence() {
        return intelligence;
    }
    public int getWis() {
        return wis;
    }
    public int getCha() {
        return cha;
    }

    public Skill[] getSkills() {
        return skills;
    }
    public void setFightingStyle(FightingStyle fs) {
        fightingStyle = fs;
    }

    public int getProfBonus() {
        return profBonus;
    }

    public void setStr(int str) {
        this.str = str + charRace.getStrMod();
    }
    public void setDex(int dex) {
        this.dex = dex + charRace.getDexMod();
    }
    public void setCon(int con) {
        this.con = con + charRace.getConMod();
    }
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence + charRace.getIntelligenceMod();
    }
    public void setWis(int wis) {
        this.wis = wis + charRace.getWisMod();
    }
    public void setCha(int cha) {
        this.cha = cha + charRace.getChaMod();
    }

    public void setProfBonus(int lvl) {
        double tmp = lvl / 4.0;
        if (tmp <= 1)
            profBonus = 2;
        else if (tmp <= 2)
            profBonus = 3;
        else if (tmp <= 3)
            profBonus = 4;
        else if (tmp <= 4)
            profBonus = 5;
        else
            profBonus = 6;
    }

    public void setSkillProf(Skill skillToSet, boolean proficient) {
        for (Skill e:skills) {
            if (e.getName().equalsIgnoreCase(skillToSet.getName()))
                e.setProf(proficient);
        }
    }
    public String getAbilityBonus(int abilityScore) {
        if (abilityScore == 1)
            return "(-5)";
        if (abilityScore <= 3)
            return "(-4)";
        if (abilityScore <= 5)
            return "(-3)";
        if (abilityScore <= 7)
            return "(-2)";
        if (abilityScore <= 9)
            return "(-1)";
        if (abilityScore <= 11)
            return "(0)";
        if (abilityScore <= 13)
            return "(+1)";
        if (abilityScore <= 15)
            return "(+2)";
        if (abilityScore <= 17)
            return "(+3)";
        if (abilityScore <= 19)
            return "(+4)";
        if (abilityScore <= 21)
            return "(+5)";
        if (abilityScore <= 23)
            return "(+6)";
        if (abilityScore <= 25)
            return "(+7)";
        return "";
    }
    public void setBkgrd(Background background) {
        bkgrd = background;
    }

    public Skill[] getSkillProficiencies() {
        ArrayList<Skill> skillsArrList = new ArrayList<Skill>();
        for (Skill skl:skills)
            if (skl.isProficient)
                skillsArrList.add(skl);
        for (Skill skl:bkgrd.proficientSkills)
            skillsArrList.add(skl);
        Skill[] skillsArr = new Skill[skillsArrList.size()];
        for (int i = 0; i < skillsArrList.size(); i++) {
            skillsArr[i] = skillsArrList.get(i);
        }
        return skillsArr;
    }
}
