package net.amber.culminating;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Fighter extends Class {
    protected FightingStyle fightingStyle;
    protected int actionSurgeUses;
    protected String secondWindHealing;
    protected int noExtraAttack;
    protected int indomitableUses;
    public Fighter() {
        super("Fighter", "", "STR", "CON", "", "d10", 1, "STR or DEX", 13, new Skill[]{new Acrobatics(), new AnimalHandling(), new Athletics(), new History(), new Insight(), new Intimidation(), new Perception(), new Survival()}, "(a) chain mail or (b) leather armor, longbow, and 20 arrows\n" + "(a) a martial weapon and a shield or (b) two martial weapons\n" + "(a) a light crossbow and 20 bolts or (b) two handaxes\n" + "(a) a dungeoneer’s pack or (b) an explorer’s pack\n", 3, new Class[]{new Banneret(), new Cavalier(), new Champion(), new EchoKnight(), new PsiWarrior(), new Samurai()}, new Skill[0], 2);
        fightingStyle = new FightingStyle("", "");
        secondWindHealing = "1d10";
        ASILevels = new int[]{4, 6, 8, 12, 14, 16, 19};
    }
    public Fighter(String subclassName, Skill[] bp) {
        super(subclassName + "Fighter", subclassName, "STR", "CON", "", "d10", 1, "STR or DEX", 13, new Skill[]{new Acrobatics(), new AnimalHandling(), new Athletics(), new History(), new Insight(), new Intimidation(), new Perception(), new Survival()}, "(a) chain mail or (b) leather armor, longbow, and 20 arrows\n" + "(a) a martial weapon and a shield or (b) two martial weapons\n" + "(a) a light crossbow and 20 bolts or (b) two handaxes\n" + "(a) a dungeoneer’s pack or (b) an explorer’s pack\n", 3, new Class[]{}, bp, 2);
        fightingStyle = new FightingStyle("", "");
        secondWindHealing = "1d10";
        ASILevels = new int[]{4, 6, 8, 12, 14, 16, 19};
    }

    @Override
    public void update(PlayerCharacter p) {
        setActionSurgeUses(p);
        setNoExtraAttack(p);
        secondWindHealing = "1d10 + " + p.getLvl();
        setNoExtraAttack(p);
        setIndomitableUses(p);
        hitDice = p.getLvl();
    }
    @Override
    public String getClassName() {
        return className;
    }
    public void setActionSurgeUses(PlayerCharacter p) {
        double tmpAS = p.getLvl()/16.0;
        if (tmpAS == 0.0625)
            actionSurgeUses = 0;
        else if (tmpAS <= 1)
            actionSurgeUses = 1;
        else
            actionSurgeUses = 2;
    }

    public void setNoExtraAttack(PlayerCharacter p) {
        double tmpEA = p.getLvl()/5.0;
        if (tmpEA < 1)
            noExtraAttack = 0;
        else if (tmpEA <= 2)
            noExtraAttack = 1;
        else if (tmpEA < 4)
            noExtraAttack = 2;
        else
            noExtraAttack = 3;
    }
    public void setIndomitableUses(PlayerCharacter p) {
        double tmpEA = p.getLvl()/9.0;
        if (tmpEA < 1)
            indomitableUses = 0;
        else if (tmpEA < 13.0/9.0)
            indomitableUses = 1;
        else if (tmpEA < 17.0/9.0)
            indomitableUses = 2;
        else
            noExtraAttack = 3;
    }


    @Override
    public void exportClassInfo(PlayerCharacter p) throws IOException {
        super.exportClassInfo(p);
        update(p);
        String fileName = p.getName();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
        out.println("Fighting Style: " + p.fightingStyle.getName());
        out.println(p.fightingStyle.getDesc());
        out.println("Second Wind Healing: " + secondWindHealing);
        if (p.getLvl() >= 2)
            out.println("Action Surge Uses: " + actionSurgeUses);
        if (p.getLvl() >= 5)
            out.println("Extra Attacks: " + noExtraAttack);
        if (p.getLvl() > 9)
            out.println("Indomitable Uses: " + indomitableUses);
        out.close();
    }
}
class Banneret extends Fighter {
    private String rallyingCry;
    private String royalEnvoy;
    private String inspiringSurge;
    private String bulwark;
    private String inspiringSurgeUpgrade;
    public Banneret() {
        super("Banneret", new Skill[]{new Persuasion(), new AnimalHandling(), new Insight(), new Intimidation(), new Performance()});
        rallyingCry = "Rallying Cry.\n When you choose this archetype at 3rd level, you learn how to inspire your allies to fight on past their injuries. When you use your Second Wind feature, you can choose up to three creatures within 60 feet of you that are allied with you. Each one regains hit points equal to your fighter level, provided that the creature can see or hear you.";
        royalEnvoy = "Royal Envoy.\n Knights of high standing are expected to conduct themselves with grace. At 7th level, you gain proficiency in the Persuasion skill. If you are already proficient in it, you gain proficiency in one of the following skills of your choice: Animal Handling, Insight, Intimidation, or Performance. Your proficiency bonus is doubled for any ability check you make that uses Persuasion. You receive this benefit regardless of the skill proficiency you gain from this feature.";
        inspiringSurge = "Inspiring Surge.\n Starting at 10th level, when you use your Action Surge feature, you can choose one creature within 60 feet of you that is allied with you. That creature can make one melee or ranged weapon attack with its reaction, provided that it can see or hear you.";
        bulwark = "Bulwark.\n Beginning at 15th level, you can extend the benefit of your Indomitable feature to an ally. When you decide to use Indomitable to reroll an Intelligence, a Wisdom, or a Charisma saving throw and you aren't incapacitated, you can choose one ally within 60 feet of you that also failed its saving throw against the same effect. If that creature can see or hear you, it can reroll its saving throw and must use the new roll.";
        inspiringSurgeUpgrade = "Inspiring Surge (upgrade).\n Starting at 18th level, you can choose two allies within 60 feet of you, rather than one, when using your Inspiring Surge feature.";
    }

    @Override
    public void exportClassInfo(PlayerCharacter p) throws IOException {
        super.exportClassInfo(p);
        String fileName = p.getName();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
        int level = p.getLvl();
        out.println(rallyingCry);
        if (level >= 7)
            out.println(royalEnvoy);
        if (level >= 10)
            out.println(inspiringSurge);
        if (level >= 15)
            out.println(bulwark);
        if (level >= 18)
            out.println(inspiringSurgeUpgrade);
        out.println("");
        out.close();
    }
}
class Cavalier extends Fighter {
    private String bornToTheSaddle;
    private String unwaveringMark;
    private String wardingManeuver;
    private String holdTheLine;
    private String ferociousCharger;
    private String vigilantDefender;
    public Cavalier() {
        super("Cavalier", new Skill[]{new AnimalHandling(), new History(), new Insight(), new Performance(), new Persuasion()});
        bornToTheSaddle = "Born to the Saddle.\n Starting at 3rd level, your mastery as a rider becomes apparent. You have advantage on saving throws made to avoid falling off your mount. If you fall off your mount and descend no more than 10 feet, you can land on your feet if you’re not incapacitated. Finally, mounting or dismounting a creature costs you only 5 feet of movement, rather than half your speed.";
        unwaveringMark = "Unwavering Mark.\n Starting at 3rd level, you can menace your foes, foiling their attacks and punishing them for harming others. When you hit a creature with a melee weapon attack, you can mark the creature until the end of your next turn. This effect ends early if you are incapacitated or you die, or if someone else marks the creature. While it is within 5 feet of you, a creature marked by you has disadvantage on any attack roll that doesn't target you. In addition, if a creature marked by you deals damage to anyone other than you, you can make a special melee weapon attack against the marked creature as a bonus action on your next turn. You have advantage on the attack roll, and if it hits, the attack's weapon deals extra damage to the target equal to half your fighter level. Regardless of the number of creatures you mark, you can make this special attack a number of times equal to your Strength modifier (a minimum of once), and you regain all expended uses of it when you finish a long rest.";
        wardingManeuver = "Warding Maneuver.\n At 7th level, you learn to fend off strikes directed at you, your mount, or other creatures nearby. If you or a creature you can see within 5 feet of you is hit by an attack, you can roll 1d8 as a reaction if you're wielding a melee weapon or a shield. Roll the die, and add the number rolled to the target's AC against that attack. If the attack still hits, the target has resistance against the attack's damage. You can use this feature a number of times equal to your Constitution modifier (a minimum of once), and you regain all expended uses of it when you finish a long rest.";
        holdTheLine = "Hold the Line.\n Starting at 10th level, when you roll initiative and have no uses of Fighting Spirit remaining, you regain one use.";
        ferociousCharger = "Ferocious Charger.\n Starting at 15th level, you can run down your foes, whether you're mounted or not. If you move at least 10 feet in a straight line right before attacking a creature and you hit it with the attack, that target must succeed on a Strength saving throw (DC 8 + your proficiency bonus + your Strength modifier) or be knocked prone. You can use this feature only once on each of your turns.";
        vigilantDefender = "Vigilant Defender.\n Starting at 18th level, you respond to danger with extraordinary vigilance. In combat, you get a special reaction that you can take once on every creature's turn, except your turn. You can use this special reaction only to make an opportunity attack, and you can't use it on the same turn that you take your normal reaction.";
    }

    @Override
    public String getBonusProficiency() {
        String s = "[";
        for (int i = 0; i < bonusProficiency.length -1; i++) {
            s += bonusProficiency[i] + ", ";
        }
        s += bonusProficiency[bonusProficiency.length - 1] + "]";
        return s;
    }

    @Override
    public boolean hasBonusProficiency() {
        return true;
    }

    @Override
    public void exportClassInfo(PlayerCharacter p) throws IOException {
        super.exportClassInfo(p);
        String fileName = p.getName();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
        int level = p.getLvl();
        out.println(unwaveringMark);
        out.println(bornToTheSaddle);
        if (level >= 7)
            out.println(wardingManeuver);
        if (level >= 10)
            out.println(holdTheLine);
        if (level >= 15)
            out.println(ferociousCharger);
        if (level >= 18)
            out.println(vigilantDefender);
        out.println("");
        out.close();
    }
}
class Champion extends Fighter {
    private String improvedCritical;
    private String remarkableAthlete;
    private String additionalFightingStyle;
    private String superiorCritical;
    private String survivor;
    public Champion() {
        super("Champion", new Skill[0]);
        improvedCritical = "Improved Critical.\n Beginning when you choose this archetype at 3rd level, your weapon attacks score a critical hit on a roll of 19 or 20.";
        remarkableAthlete = "Remarkable Athlete.\n Starting at 7th level, you can add half your proficiency bonus (rounded up) to any Strength, Dexterity, or Constitution check you make that doesn't already use your proficiency bonus. In addition, when you make a running long jump, the distance you can cover increases by a number of feet equal to your Strength modifier.";
        additionalFightingStyle = "Additional Fighting Style.\n At 10th level, you can choose a second option from the Fighting Style class feature.";
        superiorCritical = "Superior Critical.\n Starting at 15th level, your weapon attacks score a critical hit on a roll of 18-20.";
        survivor = "Survivor.\n At 18th level, you attain the pinnacle of resilience in battle. At the start of each of your turns, you regain hit points equal to 5 + your Constitution modifier if you have no more than half of your hit points left. You don't gain this benefit if you have 0 hit points.";
    }

    @Override
    public void exportClassInfo(PlayerCharacter p) throws IOException {
        super.exportClassInfo(p);
        String fileName = p.getName();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
        int level = p.getLvl();
        out.println(improvedCritical);
        if (level >= 7)
            out.println(remarkableAthlete);
        if (level >= 10)
            out.println(additionalFightingStyle);
        if (level >= 15)
            out.println(superiorCritical);
        if (level >= 18)
            out.println(survivor);
        out.println("");
        out.close();
    }
}
class EchoKnight extends Fighter {
    private String manifestEcho;
    private String unleashIncarnation;
    private String echoAvatar;
    private String shadowMartyr;
    private String reclaimPotential;
    private String legionOfOne;
    public EchoKnight() {
        super("Echo Knight", new Skill[0]);
        manifestEcho = "Manifest Echo.\n At 3rd level, you can use a bonus action to magically manifest an echo of yourself in an unoccupied space you can see within 15 feet of you. This echo is a magical, translucent, gray image of you that lasts until it is destroyed, until you dismiss it as a bonus action, until you manifest another echo, or until you're incapacitated. Your echo has AC 14 + your proficiency bonus, 1 hit point, and immunity to all conditions. If it has to make a saving throw, it uses your saving throw bonus for the roll. It is the same size as you, and it occupies its space. On your turn, you can mentally command the echo to move up to 30 feet in any direction (no action required). If your echo is ever more than 30 feet from you at the end of your turn, it is destroyed.\n" +
                "    As a bonus action, you can teleport, magically swapping places with your echo at a cost of 15 feet of your movement, regardless of the distance between the two of you.\n" +
                "    When you take the Attack action on your turn, any attack you make with that action can originate from your space or the echo's space. You make this choice for each attack.\n" +
                "    When a creature that you can see within 5 feet of your echo moves at least 5 feet away from it, you can use your reaction to make an opportunity attack against that creature as if you were in the echo's space.";
        unleashIncarnation = "Unleash Incarnation.\n At 3rd level, you can heighten your echo's fury. Whenever you take the Attack action, you can make one additional melee attack from the echo's position. You can use this feature a number of times equal to your Constitution modifier (a minimum of once). You regain all expended uses when you finish a long rest.";
        echoAvatar = "Echo Avatar.\n Starting at 7th level, you can temporarily transfer your consciousness to your echo. As an action, you can see through your echo's eyes and hear through its ears. During this time, you are deafened and blinded. You can sustain this effect for up to 10 minutes, and you can end it at any time (requires no action). While your echo is being used in this way, it can be up to 1,000 feet away from you without being destroyed.";
        shadowMartyr = "Shadow Martyr.\n Starting at 10th level, you can make your echo throw itself in front of an attack directed at another creature that you can see. Before the attack roll is made, you can use your reaction to teleport the echo to an unoccupied space within 5 feet of the targeted creature. The attack roll that triggered the reaction is instead made against your echo. Once you use this feature, you can't use it again until you finish a short or long rest.";
        reclaimPotential = "Reclaim Potential.\n By 15th level, you've learned to absorb the fleeting magic of your echo. When an echo of yours is destroyed by taking damage, you can gain a number of temporary hit points equal to 2d6 + your Constitution modifier, provided you don't already have temporary hit points. You can use this feature a number of times equal to your Constitution modifier (a minimum of once). You regain all expended uses when you finish a long rest.";
        legionOfOne = "Legion of One.\n At 18th level, you can use a bonus action to create two echos with your Manifest Echo feature, and these echoes can co-exist. If you try to create a third echo, the previous two echoes are destroyed. Anything you can do from one echo's position can be done from the other's instead. In addition, when you roll initiative and have no uses of your Unleash Incarnation feature left, you regain one use of that feature..";
    }

    @Override
    public void exportClassInfo(PlayerCharacter p) throws IOException {
        super.exportClassInfo(p);
        String fileName = p.getName();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
        int level = p.getLvl();
        out.println(manifestEcho);
        out.println(unleashIncarnation);
        if (level >= 7)
            out.println(echoAvatar);
        if (level >= 10)
            out.println(shadowMartyr);
        if (level >= 15)
            out.println(reclaimPotential);
        if (level >= 18)
            out.println(legionOfOne);
        out.println("");
        out.close();
    }
}
class PsiWarrior extends Fighter {
    private String psionicPower;
    private String telekineticAdept;
    private String guardedMind;
    private String bulwarkOfForce;
    private String telekineticMaster;
    public PsiWarrior() {
        super("Psi Warrior", new Skill[0]);
        psionicPower = "Psionic Power.\n At 3rd level, you harbor a wellspring of psionic energy within yourself. This energy is represented by your Psionic Energy dice, which are each a d6. You have a number of these dice equal to twice your proficiency bonus, and they fuel various psionic powers you have, which are detailed below. Some of your powers expend the Psionic Energy die they use, as specified in a power's description, and you can't use a power if it requires you to use a die when your dice are all expended. You regain all your expended Psionic Energy dice when you finish a long rest. In addition, as a bonus action, you can regain one expended Psionic Energy die, but you can't do so again until you finish a short or long rest. When you reach certain levels in this class, the size of your Psionic Energy dice increases: at 5th level (d8), 11th level (d10), and 17th level (d12). The powers below use your Psionic Energy dice.\n" +
                "Protective Field. When you or another creature you can see within 30 feet of you takes damage, you can use your reaction to expend one Psionic Energy die, roll the die, and reduce the damage taken by the number rolled plus your Intelligence modifier (minimum reduction of 1), as you create a momentary shield of telekinetic force.\n" +
                "Psionic Strike. You can propel your weapons with psionic force. Once on each of your turns, immediately after you hit a target within 30 feet of you with an attack and deal damage to it with a weapon, you can expend one Psionic Energy die, rolling it and dealing force damage to the target equal to the number rolled plus your Intelligence modifier.\n" +
                "Telekinetic Movement. You can move an object or a creature with your mind. As an action, you target one loose object that is Large or smaller or one willing creature, other than yourself. If you can see the target and it is within 30 feet of you, you can move it up to 30 feet to an unoccupied space you can see. Alternatively, if it is a Tiny object, you can move it to or from your hand. Either way, you can move the target horizontally, vertically, or both. Once you take this action, you can't do so again until you finish a short or long rest, unless you expend a Psionic Energy die to take it again.";
        telekineticAdept = "Telekinetic Adept.\n By the 7th level, You have mastered new ways to use your telekinetic abilities, detailed below.\n" +
                "Psi-Powered Leap. As a bonus action, you can propel your body with your mind. You gain a flying speed equal to twice your walking speed until the end of the current turn. Once you take this bonus action, you can't do so again until you finish a short or long rest, unless you expend a Psionic Energy die to take it again.\n" +
                "Telekinetic Thrust. When you deal damage to a target with your Psionic Strike, you can force the target to make a Strength saving throw against a DC equal to 8 + your proficiency bonus + your Intelligence modifier. If the save fails, you can knock the target prone or move it up to 10 feet in any direction horizontally.";
        guardedMind = "Guarded Mind.\n Starting at 10th level, the psionic energy flowing through you has bolstered your mind. You have resistance to psychic damage. Moreover, if you start your turn charmed or frightened, you can expend a Psionic Energy die and end every effect on yourself subjecting you to those conditions.";
        bulwarkOfForce = "Bulwark of Force.\n At 15th level, you can shield yourself and others with telekinetic force. As a bonus action, you can choose creatures, which can include you, that you can see within 30 feet of you, up to a number of creatures equal to your Intelligence modifier (minimum of one creature). Each of the chosen creatures is protected by half cover for 1 minute or until you're incapacitated. Once you take this bonus action, you can't do so again until you finish a long rest, unless you expend a Psionic Energy die to take it again.";
        telekineticMaster = "Telekinetic Master.\n By 18th level, your ability to move creatures and objects with your mind is matched by few. You can cast the Telekinesis spell, requiring no components, and your spellcasting ability for the spell is Intelligence. On each of your turns while you concentrate on the spell, including the turn when you cast it, you can make one attack with a weapon as a bonus action. Once you cast the spell with this feature, you can't do so again until you finish a long rest, unless you expend a Psionic Energy die to cast it again.";
    }

    @Override
    public void exportClassInfo(PlayerCharacter p) throws IOException {
        super.exportClassInfo(p);
        String fileName = p.getName();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
        int level = p.getLvl();
        out.println(psionicPower);
        if (level >= 7)
            out.println(telekineticAdept);
        if (level >= 10)
            out.println(guardedMind);
        if (level >= 15)
            out.println(bulwarkOfForce);
        if (level >= 18)
            out.println(telekineticMaster);
        out.println("");
        out.close();
    }
}
class Samurai extends Fighter {
    private String fightingSpirit;
    private String elegantCourtier;
    private String tirelessSpirit;
    private String rapidStrike;
    private String strengthBeforeDeath;
    public Samurai() {
        super("Samurai", new Skill[]{new History(), new Insight(), new Performance(), new Persuasion()});
        fightingSpirit = "Fighting Spirit\n Starting at 3rd level, your intensity in battle can shield you and help you strike true. As a bonus action on your turn, you can give yourself advantage on all weapon attack rolls until the end of the current turn. When you do so, you also gain 5 temporary hit points. The number of hit points increases when you reach certain levels in this class, increasing to 10 at 10th level and 15 at 15th level. You can use this feature three times. You regain all expended uses of it when you finish a long rest.";
        elegantCourtier = "Elegant Courtier\n Starting at 7th level, your discipline and attention to detail allow you to excel in social situations. Whenever you make a Charisma (Persuasion) check, you gain a bonus to the check equal to your Wisdom modifier. Your self-control also causes you to gain proficiency in Wisdom saving throws. If you already have this proficiency, you instead gain proficiency in Intelligence or Charisma saving throws (your choice).";
        setSavingThrowProf3("WIS");
        tirelessSpirit = "Tireless Spirit.\n At 10th level, you become a master of locking down your enemies. Creatures provoke an opportunity attack from you when they move 5 feet or more while within your reach, and if you hit a creature with an opportunity attack, the target's speed is reduced to 0 until the end of the current turn.";
        rapidStrike = "Rapid Strike.\n Starting at 15th level, you learn to trade accuracy for swift strikes. If you take the Attack action on your turn and have advantage on an attack roll against against one of the targets, you can forgo the advantage for that roll to make an additional weapon attack against that target, as part of the same action. You can do so no more than once per turn.";
        strengthBeforeDeath = "Strength Before Death.\n Starting at 18th level, your fighting spirit can delay the grasp of death. If you take damage that reduces you to 0 hit points, you can use your reaction to delay falling unconscious, and you can immediately take an extra turn. While you have 0 hit points during that extra turn, taking damage causes death saving throw failures as normal, and three death saving throw failures can still kill you. When the extra turn ends, you fall unconscious if you still have 0 hit points.Once you use this feature, you can’t use it again until you finish a long rest.";
    }

    @Override
    public String getBonusProficiency() {
        String s = "[";
        for (int i = 0; i < bonusProficiency.length -1; i++) {
            s += bonusProficiency[i] + ", ";
        }
        s += bonusProficiency[bonusProficiency.length - 1] + "]";
        return s;
    }

    @Override
    public boolean hasBonusProficiency() {
        return true;
    }

    @Override
    public void exportClassInfo(PlayerCharacter p) throws IOException {
        super.exportClassInfo(p);
        String fileName = p.getName();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
        int level = p.getLvl();
        out.println(fightingSpirit);
        if (level >= 7)
            out.println(elegantCourtier);
        if (level >= 10)
            out.println(tirelessSpirit);
        if (level >= 15)
            out.println(rapidStrike);
        if (level >= 18)
            out.println(strengthBeforeDeath);
        out.println("");
        out.close();
    }
}