package net.amber.culminating;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) throws IOException {
        Scanner scr = new Scanner(System.in);

        ArrayList<Integer> stats = new ArrayList<Integer>();
        for (int i = 0; i < 6; i++) {
            stats.add(0);
        }

        ArrayList<Background> bkgrdOptions = new ArrayList<Background>();
        bkgrdOptions.add(new Acolyte());
        bkgrdOptions.add(new Anthropologist());
        bkgrdOptions.add(new Archaeologist());
        bkgrdOptions.add(new Athlete());
        bkgrdOptions.add(new Charlatan());
        bkgrdOptions.add(new CityWatch());
        bkgrdOptions.add(new cwInvestigator());
        bkgrdOptions.add(new ClanCrafter());
        bkgrdOptions.add(new CloisteredScholar());
        bkgrdOptions.add(new Courtier());
        bkgrdOptions.add(new Criminal());
        bkgrdOptions.add(new Spy());
        bkgrdOptions.add(new Entertainer());
        bkgrdOptions.add(new Gladiator());
        bkgrdOptions.add(new Faceless());
        bkgrdOptions.add(new FactionAgent());
        bkgrdOptions.add(new FarTraveler());
        bkgrdOptions.add(new Feylost());
        bkgrdOptions.add(new Fisher());
        bkgrdOptions.add(new FolkHero());
        bkgrdOptions.add(new GuildArtisan());
        bkgrdOptions.add(new HauntedOne());
        bkgrdOptions.add(new Hermit());
        bkgrdOptions.add(new Inheritor());
        bkgrdOptions.add(new Investigator());
        bkgrdOptions.add(new Marine());
        bkgrdOptions.add(new MercenaryVeteran());
        bkgrdOptions.add(new Noble());
        bkgrdOptions.add(new Knight());
        bkgrdOptions.add(new Outlander());
        bkgrdOptions.add(new Sage());
        bkgrdOptions.add(new Sailor());
        bkgrdOptions.add(new Pirate());
        bkgrdOptions.add(new Shipwright());
        bkgrdOptions.add(new Smuggler());
        bkgrdOptions.add(new Soldier());
        bkgrdOptions.add(new UrbanBountyHunter());
        bkgrdOptions.add(new Urchin());
        bkgrdOptions.add(new WaterdhavianNoble());
        bkgrdOptions.add(new WitchlightHand());

        Class[] classOptions = new Class[3];
        classOptions[0] = new Barbarian();
        classOptions[1] = new Fighter();
        classOptions[2] = new Rogue();

        Race[] raceOptions = new Race[19];
        raceOptions[0] = new Bugbear();
        raceOptions[1] = new Centaur();
        raceOptions[2] = new Changeling();
        raceOptions[3] = new Duergar();
        raceOptions[4] = new MarkOfWarding();
        raceOptions[5] = new Drow();
        raceOptions[6] = new EladrinT1();
        raceOptions[7] = new EladrinT2();
        raceOptions[8] = new HighElf();
        raceOptions[9] = new PallidElf();
        raceOptions[10] = new SeaElf();
        raceOptions[11] = new ShadarKai();
        raceOptions[12] = new WoodElf();
        raceOptions[13] = new AirGenasi();
        raceOptions[14] = new EarthGenasi();
        raceOptions[15] = new FireGenasi();
        raceOptions[16] = new WaterGenasi();
        raceOptions[17] = new Human();
        raceOptions[18] = new Kalashtar();

        FightingStyle[] fsOptions = new FightingStyle[10];
        fsOptions[0] = new FightingStyle("Archery", "You gain a +2 bonus to attack rolls you make with ranged weapons.");
        fsOptions[1] = new FightingStyle("Blind Fighting", "You have blindsight with a range of 10 feet. Within that range, you can effectively see anything that isn't behind total cover, even if you're blinded or in darkness. Moreover, you can see an invisible creature within that range, unless the creature successfully hides from you.");
        fsOptions[2] = new FightingStyle("Defense", "While you are wearing armor, you gain a +1 bonus to AC.");
        fsOptions[3] = new FightingStyle("Dueling", "When you are wielding a melee weapon in one hand and no other weapons, you gain a +2 bonus to damage rolls with that weapon.");
        fsOptions[4] = new FightingStyle("Great Weapon Fighting", "When you roll a 1 or 2 on a damage die for an attack you make with a melee weapon that you are wielding with two hands, you can reroll the die and must use the new roll, even if the new roll is a 1 or a 2. The weapon must have the two-handed or versatile property for you to gain this benefit.");
        fsOptions[5] = new FightingStyle("Interception", "When a creature you can see hits a target, other than you, within 5 feet of you with an attack, you can use your reaction to reduce the damage the target takes by 1d10 + your proficiency bonus (to a minimum of 0 damage). You must be wielding a shield or a simple or martial weapon to use this reaction.");
        fsOptions[6] = new FightingStyle("Protection", "When a creature you can see attacks a target other than you that is within 5 feet of you, you can use your reaction to impose disadvantage on the attack roll. You must be wielding a shield.");
        fsOptions[7] = new FightingStyle("Thrown Weapon Fighting", "You can draw a weapon that has the thrown property as part of the attack you make with the weapon. In addition, when you hit with a ranged attack using a thrown weapon, you gain a +2 bonus to the damage roll.");
        fsOptions[8] = new FightingStyle("Two-Weapon Fighting", "When you engage in two-weapon fighting, you can add your ability modifier to the damage of the second attack.");
        fsOptions[9] = new FightingStyle("Unarmed Fighting", "Your unarmed strikes can deal bludgeoning damage equal to 1d6 + your Strength modifier on a hit. If you aren't wielding any weapons or a shield when you make the attack roll, the d6 becomes a d8. At the start of each of your turns, you can deal 1d4 bludgeoning damage to one creature grappled by you.");

        PlayerCharacter newChar = new PlayerCharacter();

        System.out.println("Would you like to create a new character? If so, start by entering your character's name.");
        String charName = scr.nextLine();
        newChar.setName(charName);

        System.out.println("Next, please enter your character level.");
        int charLevel = scr.nextInt();
        if (charLevel < 0 || charLevel > 20)
            System.out.println("Sorry, character levels must be between 1 and 20.");
        else {
            newChar.setLvl(charLevel);

            String spacer = scr.nextLine();

            System.out.print("What is your character's race? \n [" );
            for (Race r:raceOptions) {
                System.out.print(r.getRaceName() + ", ");
            }
            System.out.print("]");

            String charRace = scr.nextLine();
            for (Race r:raceOptions) {
                if (r.getRaceName().equalsIgnoreCase(charRace))
                    newChar.setCharRace(r);
            }

            if (newChar.getCharRaceName().equals(""))
                System.out.println("Unfortunately, that race is not one of the supported options.");
            else {
                if (newChar.getCharRace().hasOptionalProficiencies) {
                    for (int i = 0; i < newChar.getCharRace().optionalProficiencyChoices; i++) {
                        System.out.print("Please select a proficiency. \n[");
                        for (Skill e : newChar.getCharRace().getOptionalProficiencies()) {
                            if (!e.getTorFProficient())
                                System.out.print(e.getName() + ", ");
                        }
                        System.out.print("]");
                        String sklName = scr.nextLine();
                        newChar.getCharRace().setOptionalProficiency(newChar, sklName);
                    }
                }
                System.out.print("Please select a class: \n [");
                for (Class e:classOptions) {
                    System.out.print(e.getClassName() + ", ");
                }
                System.out.print("]");
                String charClass = scr.nextLine();
                for (Class c:classOptions) {
                    if (c.getClassName().equalsIgnoreCase(charClass)) {
                        c.update(newChar);
                        newChar.setCharClass(c);
                    }
                }
                if (newChar.getCharClass().getClassName().equalsIgnoreCase(""))
                    System.out.println("That is not a currently supported class.");
                else {
                    System.out.println("Next, please select a background: \n" + bkgrdOptions);
                    String charBkgrd = scr.nextLine();
                    for (Background b : bkgrdOptions) {
                        if (b.getBkgrdName().equalsIgnoreCase(charBkgrd)) {
                            newChar.setBkgrd(b);
                        }
                    }
                    if (newChar.getBkgrd().getBkgrdName() == null) {
                        System.out.println("Sorry, that background is currently not supported.");
                    }
                    else {
                        if (newChar.getBkgrd().hasOptionalProficiencies) {
                            for (int i = 0; i < newChar.getBkgrd().optionalProficiencyChoices; i++) {
                                System.out.print("Please select a proficiency. \n[");
                                for (Skill e : newChar.getBkgrd().getOptionalProficiencies()) {
                                    if (!e.getTorFProficient())
                                        System.out.print(e.getName() + ", ");
                                }
                                System.out.print("]");
                                String sklName = scr.nextLine();
                                newChar.getBkgrd().setOptionalProficiency(newChar, sklName);
                            }
                        }
                        for (int i = 0; i < newChar.getCharClass().getNoStartSkills(); i++) {
                            System.out.print("Choose a proficiency. [");
                            for (Skill e:newChar.getCharClass().possibleProficientSkills) {
                                boolean contained = false;
                                for (Skill e2 : newChar.getSkillProficiencies()) {
                                    if (e2.getName().equalsIgnoreCase(e.getName()))
                                    contained = true;
                                }
                                if (!contained) {
                                    System.out.print(e.getName() + ", ");
                                }
                            }
                            System.out.print("]");
                            String bp = scr.nextLine();
                            for (Skill e:newChar.getCharClass().possibleProficientSkills) {
                                if (bp.equalsIgnoreCase(e.getName()))
                                    newChar.setSkillProf(e, true);
                            }
                        }
                        if (newChar.getCharClass().getClassName().equalsIgnoreCase("fighter")) {
                            System.out.println("What fighting style would you like?");
                            System.out.print("[");
                            for (FightingStyle fs:fsOptions) {
                                System.out.print(fs.getName() + ", ");
                            }
                            System.out.print("]");
                            String fightStyle = scr.nextLine();
                            for (FightingStyle fs:fsOptions) {
                                if (fightStyle.equalsIgnoreCase(fs.getName()))
                                    newChar.setFightingStyle(fs);
                            }
                        }

                        if (newChar.getLvl() >= newChar.getCharClass().getSubclassLvl()) {
                            Class tmp = newChar.getCharClass();
                            System.out.println("What subclass would you like?");
                            for (Class e : tmp.getSubclassOptions()) {
                                System.out.print(e.getSubclassName() + ", ");
                            }
                            String charSubclass = scr.nextLine();
                            for (Class sc : tmp.getSubclassOptions()) {
                                if (sc.getSubclassName().equalsIgnoreCase(charSubclass))
                                    newChar.setSubclass(sc);
                            }
                            if (newChar.getSubclass().hasBonusProficiency()) {
                                System.out.println("Choose a bonus proficiency.");
                                System.out.print("[");
                                for (Skill e : newChar.getSubclass().bonusProficiency) {
                                    boolean contained = false;
                                    for (Skill i : newChar.getSkillProficiencies()) {
                                        if (i.getName().equalsIgnoreCase(e.getName()))
                                            contained = true;
                                    }
                                    if (!contained) {
                                        System.out.print(e.getName() + ", ");
                                    }
                                }
                                System.out.print("]");
                                String bp = scr.nextLine();
                                for (Skill e : newChar.getSubclass().bonusProficiency) {
                                    if (bp.equalsIgnoreCase(e.getName()))
                                        newChar.setSkillProf(e, true);
                                }
                            }
                            if (newChar.getSubclass().getSubclassName().equalsIgnoreCase("Totem Warrior")) {
                                TotemWarrior tW = new TotemWarrior();
                                System.out.println("Choose a Totem Spirit.\n [Bear, Eagle, Elk, Tiger, Wolf] \n [1, 2, 3, 4, 5]");
                                tW.setTotemSpiritChoice(scr.nextInt() - 1);
                                if (newChar.getLvl() >= 6) {
                                    System.out.println("Choose an Aspect of the Beast.\n [Bear, Eagle, Elk, Tiger, Wolf] \n [1, 2, 3, 4, 5]");
                                    tW.setAspectOfTheBeastChoice(scr.nextInt() - 1);
                                }
                                if (tW.getAspectOfTheBeastChoice() == 3) {
                                    String spcr = scr.nextLine();
                                    for (int i = 0; i < 2; i++) {
                                        System.out.println("Please choose a skill proficiency.");
                                        System.out.print("[");
                                        for (Skill e : tW.getTigerAspectPossibleProfs()) {
                                            boolean contained = false;
                                            for (Skill e2 : newChar.getSkillProficiencies()) {
                                                if (e2.getName().equalsIgnoreCase(e.getName()))
                                                    contained = true;
                                            }
                                            if (!contained) {
                                                System.out.print(e.getName() + ", ");
                                            }
                                        }
                                        System.out.print("]");
                                        String prof = scr.nextLine();
                                        for (Skill e : tW.getTigerAspectPossibleProfs()) {
                                            if (prof.equalsIgnoreCase(e.getName()))
                                                newChar.setSkillProf(e, true);
                                        }
                                    }
                                }
                                if (newChar.getLvl() >= 14) {
                                    System.out.println("Choose a Totemic Attunement.\n [Bear, Eagle, Elk, Tiger, Wolf] \n [1, 2, 3, 4, 5]");
                                    tW.setTotemicAttunementChoice(scr.nextInt() - 1);
                                }
                                newChar.setSubclass(tW);
                            }
                        }
                        if (newChar.getCharClass().getClassName().equalsIgnoreCase("Rogue")) {
                            System.out.print("Please choose a proficiency to gain Expertise.\n[");
                            for (Skill e:newChar.getSkillProficiencies()) {
                                System.out.print(e.getName() + ", ");
                            }
                            System.out.print("]");
                            String exp = scr.nextLine();
                            newChar.getCharClass().setExpertiseSkill(1, exp);

                            System.out.print("Please choose a proficiency to gain Expertise.\n[");
                            for (Skill e:newChar.getSkillProficiencies()) {
                                System.out.print(e.getName() + ", ");
                            }
                            System.out.print("]");
                            String exp2 = scr.nextLine();
                            newChar.getCharClass().setExpertiseSkill(2, exp2);

                            System.out.print("Please choose a proficiency to gain Expertise.\n[");
                            for (Skill e:newChar.getSkillProficiencies()) {
                                System.out.print(e.getName() + ", ");
                            }
                            System.out.print("]");
                            String exp3 = scr.nextLine();
                            newChar.getCharClass().setExpertiseSkill(3, exp3);

                            System.out.print("Please choose a proficiency to gain Expertise.\n[");
                            for (Skill e:newChar.getSkillProficiencies()) {
                                System.out.print(e.getName() + ", ");
                            }
                            System.out.print("]");
                            String exp4 = scr.nextLine();
                            newChar.getCharClass().setExpertiseSkill(4, exp4);
                        }

                        System.out.println("Choose a method for determining stats:\nRoll (r)\nStandard Array(sa)");
                        if (scr.nextLine().equalsIgnoreCase("sa")) {
                            stats.set(0, 15);
                            stats.set(1, 14);
                            stats.set(2, 13);
                            stats.set(3, 12);
                            stats.set(4, 10);
                            stats.set(5, 8);
                        }
                        else {
                            for (int i = 0; i < stats.size(); i++) {
                                int[] d6Rolls = new int[4];
                                for (int i2 = 0; i2 < 4; i2++) {
                                    d6Rolls[i2] = (int)(Math.random()*6+1);
                                }
                                for (int e:d6Rolls) {
                                    if (!(e > 1))
                                        d6Rolls[e] = (int)(Math.random()*6+1);
                                }
                                int tmp = 0;
                                for (int i3 = 1; i3 <= 3; i3++) {
                                    if (d6Rolls[i3] > d6Rolls[i3 - 1]) {
                                        tmp += d6Rolls[i3];
                                        d6Rolls[i3] = 0;
                                    }
                                    else {
                                        tmp += d6Rolls[i3 - 1];
                                        d6Rolls[i3 -1] = 0;
                                    }
                                }
                                stats.set(i, tmp);
                            }
                        }
                        System.out.print("[");
                        int[] statsArr = new int[stats.toArray().length];
                        for (int i = 0; i < statsArr.length; i++) {
                            statsArr[i] = stats.get(i);
                            System.out.print(statsArr[i] + ", ");
                        }
                        System.out.println("]");
                        System.out.println("[1, 2, 3, 4, 5, 6]");

                        System.out.println("Choose STR score:");
                        int str = scr.nextInt();
                        for (int i = 0; i< statsArr.length; i++) {
                            if (str - 1 == i) {
                                newChar.setStr(statsArr[i]);
                                statsArr[i] = 0;
                                str = -1;
                            }
                        }

                        System.out.println("Choose DEX score:");
                        int dex = scr.nextInt();
                        for (int i = 0; i< statsArr.length; i++) {
                            if (dex - 1 == i) {
                                newChar.setDex(statsArr[i]);
                                statsArr[i] = 0;
                                dex = -1;
                            }
                        }

                        System.out.println("Choose CON score:");
                        int con = scr.nextInt();
                        for (int i = 0; i< statsArr.length; i++) {
                            if (con - 1 == i) {
                                newChar.setCon(statsArr[i]);
                                statsArr[i] = 0;
                                con = -1;
                            }
                        }

                        System.out.println("Choose INT score:");
                        int intelligence = scr.nextInt();
                        for (int i = 0; i< statsArr.length; i++) {
                            if (intelligence - 1 == i) {
                                newChar.setIntelligence(statsArr[i]);
                                statsArr[i] = 0;
                                intelligence = -1;
                            }
                        }

                        System.out.println("Choose WIS score:");
                        int wis = scr.nextInt();
                        for (int i = 0; i< statsArr.length; i++) {
                            if (wis - 1 == i) {
                                newChar.setWis(statsArr[i]);
                                statsArr[i] = 0;
                                wis = -1;
                            }
                        }

                        System.out.println("Choose CHA score:");
                        int cha = scr.nextInt();
                        for (int i = 0; i< statsArr.length; i++) {
                            if (cha - 1 == i) {
                                newChar.setCha(statsArr[i]);
                                statsArr[i] = 0;
                                cha = -1;
                            }
                        }
                        System.out.println("\nExport character to new file? (y/n)");
                        String spacer2 = scr.nextLine();
                        if (scr.nextLine().equalsIgnoreCase("y")) {
                            System.out.println("Full character sheet or just the basics? (f/b)");
                            String tmp = scr.nextLine();
                            newChar.exportCharacter(newChar);
                            if (tmp.equalsIgnoreCase("f")) {
                                if (newChar.getLvl() >= newChar.getCharClass().getSubclassLvl()) {
                                    newChar.getSubclass().exportClassInfo(newChar);
                                }
                                else {
                                    newChar.getCharClass().exportClassInfo(newChar);
                                }
                                newChar.getCharRace().exportRaceInfo(newChar);
                                newChar.getBkgrd().exportBackground();
                            }
                        }
                    }
                }
            }
        }
    }
}
