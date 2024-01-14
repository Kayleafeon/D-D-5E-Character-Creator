package net.amber.culminating;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Rogue extends Class {
    protected String expertise;
    protected String sneakAttack;
    protected int sneakAttackDice;
    protected String thievesCant;
    protected String cunningAction;
    protected String steadyAim;
    protected String uncannyDodge;
    protected String expertiseImproved;
    protected String evasion;
    protected String reliableTalent;
    protected String blindsense;
    protected String slipperyMind;
    protected String elusive;
    protected String strokeOfLuck;

    public Rogue() {
        super("Rogue", "", "DEX", "INT", "", "d8", 1, "DEX", 13, new Skill[]{new Acrobatics(), new Athletics(), new Deception(), new Insight(), new Intimidation(), new Investigation(), new Perception(), new Performance(), new Persuasion(), new SleightOfHand(), new Stealth()}, "(a) a rapier or (b) a shortsword\n" + "(a) a shortbow and quiver of 20 arrows or (b) a shortsword\n" + "(a) a burglar's pack, (b) dungeoneer's pack, or (c) an explorer's pack\n" + "Leather armor, two daggers, and thieves' tools", 3, new Class[]{new Assassin(), new Inquisitive(), new Mastermind(), new Phantom(), new Scout(), new Soulknife(), new Swashbuckler(), new Thief()}, new Skill[0], 4);
        expertise = "At 1st level, choose two of your skill proficiencies, or one of your skill proficiencies and your proficiency with thieves' tools. Your proficiency bonus is doubled for any ability check you make that uses either of the chosen proficiencies.";
        sneakAttack = "Beginning at 1st level, you know how to strike subtly and exploit a foe's distraction. Once per turn, you can deal an extra 1d6 damage to one creature you hit with an attack if you have advantage on the attack roll. The attack must use a finesse or a ranged weapon. You don't need advantage on the attack roll if another enemy of the target is within 5 feet of it, that enemy isn't incapacitated, and you don't have disadvantage on the attack roll. The amount of the extra damage increases as you gain levels in this class, as shown in the Sneak Attack column of the Rogue table.";
        sneakAttackDice = -1;
        thievesCant = "During your rogue training you learned thieves' cant, a secret mix of dialect, jargon, and code that allows you to hide messages in seemingly normal conversation. Only another creature that knows thieves' cant understands such messages. It takes four times longer to convey such a message than it does to speak the same idea plainly. In addition, you understand a set of secret signs and symbols used to convey short, simple messages, such as whether an area is dangerous or the territory of a thieves' guild, whether loot is nearby, or whether the people in an area are easy marks or will provide a safe house for thieves on the run.";
        cunningAction = "Starting at 2nd level, your quick thinking and agility allow you to move and act quickly. You can take a bonus action on each of your turns in combat. This action can be used only to take the Dash, Disengage, or Hide action.";
        steadyAim = "At 3rd level, as a bonus action, you give yourself advantage on your next attack roll on the current turn. You can use this bonus action only if you haven't moved during this turn, and after you use the bonus action, your speed is 0 until the end of the current turn.";
        uncannyDodge = "Starting at 5th level, when an attacker that you can see hits you with an attack, you can use your reaction to halve the attack's damage against you.";
        expertiseImproved = "At 6th level, you can choose two more of your proficiencies (in skills or with thieves' tools) to gain this benefit.";
        evasion = "Beginning at 7th level, you can nimbly dodge out of the way of certain area effects, such as a red dragon's fiery breath or an Ice Storm spell. When you are subjected to an effect that allows you to make a Dexterity saving throw to take only half damage, you instead take no damage if you succeed on the saving throw, and only half damage if you fail.";
        reliableTalent = "By 11th level, you have refined your chosen skills until they approach perfection. Whenever you make an ability check that lets you add your proficiency bonus, you can treat a d20 roll of 9 or lower as a 10.";
        blindsense = "Starting at 14th level, if you are able to hear, you are aware of the location of any hidden or invisible creature within 10 feet of you.";
        slipperyMind = "By 15th level, you have acquired greater mental strength. You gain proficiency in Wisdom saving throws.";
        elusive = "Beginning at 18th level, you are so evasive that attackers rarely gain the upper hand against you. No attack roll has advantage against you while you aren't incapacitated.";
        strokeOfLuck = "At 20th level, you have an uncanny knack for succeeding when you need to. If your attack misses a target within range, you can turn the miss into a hit. Alternatively, if you fail an ability check, you can treat the d20 roll as a 20. Once you use this feature, you can't use it again until you finish a short or long rest.";
    }
    public Rogue(String subclassName) {
        super(subclassName + " Rogue", subclassName, "DEX", "INT", "", "d8", 1, "DEX", 13, new Skill[]{new Acrobatics(), new Athletics(), new Deception(), new Insight(), new Intimidation(), new Investigation(), new Perception(), new Performance(), new Persuasion(), new SleightOfHand(), new Stealth()}, "(a) a rapier or (b) a shortsword\n" + "(a) a shortbow and quiver of 20 arrows or (b) a shortsword\n" + "(a) a burglar's pack, (b) dungeoneer's pack, or (c) an explorer's pack\n" + "Leather armor, two daggers, and thieves' tools", 3, new Class[]{}, new Skill[0], 4);
        expertise = "At 1st level, choose two of your skill proficiencies, or one of your skill proficiencies and your proficiency with thieves' tools. Your proficiency bonus is doubled for any ability check you make that uses either of the chosen proficiencies.";
        sneakAttack = "Beginning at 1st level, you know how to strike subtly and exploit a foe's distraction. Once per turn, you can deal an extra 1d6 damage to one creature you hit with an attack if you have advantage on the attack roll. The attack must use a finesse or a ranged weapon. You don't need advantage on the attack roll if another enemy of the target is within 5 feet of it, that enemy isn't incapacitated, and you don't have disadvantage on the attack roll. The amount of the extra damage increases as you gain levels in this class, as shown in the Sneak Attack column of the Rogue table.";
        sneakAttackDice = -1;
        thievesCant = "During your rogue training you learned thieves' cant, a secret mix of dialect, jargon, and code that allows you to hide messages in seemingly normal conversation. Only another creature that knows thieves' cant understands such messages. It takes four times longer to convey such a message than it does to speak the same idea plainly. In addition, you understand a set of secret signs and symbols used to convey short, simple messages, such as whether an area is dangerous or the territory of a thieves' guild, whether loot is nearby, or whether the people in an area are easy marks or will provide a safe house for thieves on the run.";
        cunningAction = "Starting at 2nd level, your quick thinking and agility allow you to move and act quickly. You can take a bonus action on each of your turns in combat. This action can be used only to take the Dash, Disengage, or Hide action.";
        steadyAim = "At 3rd level, as a bonus action, you give yourself advantage on your next attack roll on the current turn. You can use this bonus action only if you haven't moved during this turn, and after you use the bonus action, your speed is 0 until the end of the current turn.";
        uncannyDodge = "Starting at 5th level, when an attacker that you can see hits you with an attack, you can use your reaction to halve the attack's damage against you.";
        expertiseImproved = "At 6th level, you can choose two more of your proficiencies (in skills or with thieves' tools) to gain this benefit.";
        evasion = "Beginning at 7th level, you can nimbly dodge out of the way of certain area effects, such as a red dragon's fiery breath or an Ice Storm spell. When you are subjected to an effect that allows you to make a Dexterity saving throw to take only half damage, you instead take no damage if you succeed on the saving throw, and only half damage if you fail.";
        reliableTalent = "By 11th level, you have refined your chosen skills until they approach perfection. Whenever you make an ability check that lets you add your proficiency bonus, you can treat a d20 roll of 9 or lower as a 10.";
        blindsense = "Starting at 14th level, if you are able to hear, you are aware of the location of any hidden or invisible creature within 10 feet of you.";
        slipperyMind = "By 15th level, you have acquired greater mental strength. You gain proficiency in Wisdom saving throws.";
        elusive = "Beginning at 18th level, you are so evasive that attackers rarely gain the upper hand against you. No attack roll has advantage against you while you aren't incapacitated.";
        strokeOfLuck = "At 20th level, you have an uncanny knack for succeeding when you need to. If your attack misses a target within range, you can turn the miss into a hit. Alternatively, if you fail an ability check, you can treat the d20 roll as a 20. Once you use this feature, you can't use it again until you finish a short or long rest.";

    }
    public void update(PlayerCharacter p) {
        setSneakAttackDice(p);
        if (p.getLvl() >= 15)
            setSavingThrowProf3("WIS");
    }

    public void setSneakAttackDice(PlayerCharacter p) {
        int tmp = (p.getLvl() + 1) / 2;
        sneakAttackDice = tmp;
    }

    @Override
    public void exportClassInfo(PlayerCharacter p) throws IOException {
        super.exportClassInfo(p);
        update(p);
        String fileName = p.getName();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
        out.println("Expertise: " + expertise + " [" + p.charClass.getExpertise1() + ", " + p.charClass.getExpertise2() + "]");
        if (p.getSubclass().getClassName().equalsIgnoreCase("Scout"))
            out.println("Extra Expertise (Survivalist): " + "[Nature, Survival]");
        if (p.getLvl() >= 6)
            out.println("Extra Expertise: " + expertiseImproved + " [" + p.charClass.getExpertise3()  + ", " + p.charClass.getExpertise4() + "]");
        out.println("Sneak Attack (" + sneakAttackDice + "d6): " + sneakAttack);
        out.println("Thieves' Cant: " + thievesCant);
        if (p.getLvl() >= 2)
            out.println("Cunning Action: " + cunningAction);
        if (p.getLvl() >= 3)
            out.println("Steady Aim (Optional): " + steadyAim);
        if (p.getLvl() >= 5)
            out.println("Uncanny Dodge: " + uncannyDodge);
        if (p.getLvl() >= 7)
            out.println("Evasion: " + evasion);
        if (p.getLvl() >= 11)
            out.println("Reliable Talent: " + reliableTalent);
        if (p.getLvl() >= 14)
            out.println("Blindsense: " + blindsense);
        if (p.getLvl() >= 15)
            out.println("Slippery Mind: " + slipperyMind);
        if (p.getLvl() >= 18)
            out.println("Elusive: " + elusive);
        if (p.getLvl() >= 20)
            out.println("Stroke of Luck: " + strokeOfLuck);
        out.close();
    }
}
class Assassin extends Rogue {
    private String bonusProficiencies;
    private String assassinate;
    private String infiltrationExpertise;
    private String impostor;
    private String deathStrike;
    public Assassin() {
        super("Assassin");
        bonusProficiencies = "When you choose this archetype at 3rd level, you gain proficiency with the disguise kit and the poisoner's kit.";
        assassinate = "Starting at 3rd level, you are at your deadliest when you get the drop on your enemies. You have advantage on attack rolls against any creature that hasn't taken a turn in the combat yet. In addition, any hit you score against a creature that is surprised is a critical hit.";
        infiltrationExpertise = "Starting at 9th level, you can unfailingly create false identities for yourself. You must spend seven days and 25 gp to establish the history, profession, and affiliations for an identity. You can't establish an identity that belongs to someone else. For example, you might acquire appropriate clothing, letters of introduction, and official- looking certification to establish yourself as a member of a trading house from a remote city so you can insinuate yourself into the company of other wealthy merchants. Thereafter, if you adopt the new identity as a disguise, other creatures believe you to be that person until given an obvious reason not to.";
        impostor = "At 13th level, you gain the ability to unerringly mimic another person's speech, writing, and behavior. You must spend at least three hours studying these three components of the person's behavior, listening to speech, examining handwriting, and observing mannerisms. Your ruse is indiscernible to the casual observer. If a wary creature suspects something is amiss, you have advantage on any Charisma (Deception) check you make to avoid detection.";
        deathStrike = "Starting at 17th level, you become a master of instant death. When you attack and hit a creature that is surprised, it must make a Constitution saving throw (DC 8 + your Dexterity modifier + your proficiency bonus). On a failed save, double the damage of your attack against the creature.";
    }

    @Override
    public void exportClassInfo(PlayerCharacter p) throws IOException {
        super.exportClassInfo(p);
        String fileName = p.getName();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
        out.println("Bonus Proficiencies: " + bonusProficiencies);
        out.println("Assassinate: " + assassinate);
        if (p.getLvl() >= 9)
            out.println("Infiltration Expertise: " + infiltrationExpertise);
        if (p.getLvl() >= 13)
            out.println("Impostor: " + impostor);
        if (p.getLvl() >= 17)
            out.println("Death Strike: " + deathStrike);
        out.close();
    }
}
class Inquisitive extends Rogue {
    private String earForDeceit;
    private String eyeForDetail;
    private String insightfulFighting;
    private String steadyEye;
    private String unerringEye;
    private String eyeForWeakness;
    public Inquisitive() {
        super("Inquisitive");
        earForDeceit = "When you choose this archetype at 3rd level, you develop a keen ear for picking out lies. Whenever you make a Wisdom (Insight) check to determine whether a creature is lying, treat a roll of 7 or lower on the d20 as an 8.";
        eyeForDetail = "Starting at 3rd level, you can use a bonus action to make a Wisdom (Perception) check to spot a hidden creature or object or to make an Intelligence (Investigation) check to uncover or decipher clues.";
        insightfulFighting = "At 3rd level, you gain the ability to decipher an opponent’s tactics and develop a counter to them. As a bonus action, you make a Wisdom (Insight) check against a creature you can see that isn’t incapacitated, contested by the target’s Charisma (Deception) check. If you succeed, you can use your Sneak Attack against that target even if you don't have advantage on the attack roll, but not if you have disadvantage on it. This benefit lasts for 1 minute or until you successfully use this feature against a different target.";
        steadyEye = "At 9th level, you gain advantage on any Wisdom (Perception) or Intelligence (Investigation) check if you move no more than half your speed on the same turn.";
        unerringEye = "At 13th level, your senses are almost impossible to foil. As an action, you sense the presence of illusions, shapechangers not in their original form, and other magic designed to deceive the senses within 30 feet of you, provided you aren't blinded or deafened. You sense that an effect is attempting to trick you, but you gain no insight into what is hidden or into its true nature. You can use this feature a number of times equal to your Wisdom modifier (minimum of once), and you regain all expended uses of it when you finish a long rest.";
        eyeForWeakness = "At 17th level, you learn to exploit a creature’s weaknesses by carefully studying its tactics and movement. While your Insightful Fighting feature applies to a creature, your Sneak Attack damage against that creature increases by 3d6.";
    }

    @Override
    public void exportClassInfo(PlayerCharacter p) throws IOException {
        super.exportClassInfo(p);
        String fileName = p.getName();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
        out.println("Ear for Deceit: " + earForDeceit);
        out.println("Eye for Detail: " + eyeForDetail);
        out.println("Insightful Fighting: " + insightfulFighting);
        if (p.getLvl() >= 9)
            out.println("Steady Eye: " + steadyEye);
        if (p.getLvl() >= 13)
            out.println("Unerring Eye: " + unerringEye);
        if (p.getLvl() >= 17)
            out.println("Eye for Weakness: " + eyeForWeakness);
        out.close();
    }
}
class Mastermind extends Rogue {
    private String masterOfIntrigue;
    private String masterOfTactics;
    private String insightfulManipulator;
    private String misdirection;
    private String soulOfDeceit;
    public Mastermind() {
        super("Mastermind");
        masterOfIntrigue = "When you choose this archetype at 3rd level, you gain proficiency with the disguise kit, the forgery kit, and one gaming set of your choice. You also learn two languages of your choice. Additionally, you can unerringly mimic the speech patterns and accent of a creature that you hear speak for at least 1 minute, enabling you to pass yourself off as a native speaker of a particular land, provided that you know the language.";
        masterOfTactics = "Starting at 3rd level, you can use the Help action as a bonus action. Additionally, when you use the Help action to aid an ally in attacking a creature, the target of that attack can be within 30 feet of you, rather than 5 feet of you, if the target can see or hear you.";
        insightfulManipulator = "Starting at 9th level, if you spend at least 1 minute observing or interacting with another creature outside combat, you can learn certain information about its capabilities compared to your own. The DM tells you if the creature is your equal, superior, or inferior in regard to two of the following characteristics of your choice:\n" +
                "    Intelligence score\n" +
                "    Wisdom score\n" +
                "    Charisma score\n" +
                "    Class levels (if any)\n" +
                "At the DM's option, you might also realize you know a piece of the creature's history or one of its personality traits, if it has any.";
        misdirection = "Beginning at 13th level, you can sometimes cause another creature to suffer an attack meant for you. When you are targeted by an attack while a creature within 5 feet of you is granting you cover against that attack, you can use your reaction to have the attack target that creature instead of you.";
        soulOfDeceit = "Starting at 17th level, your thoughts can't be read by telepathy or other means, unless you allow it. You can present false thoughts by making a Charisma (Deception) check contested by the mind reader's Wisdom (Insight) check. Additionally, no matter what you say, magic that would determine if you are telling the truth indicates you are being truthful if you so choose, and you can't be compelled to tell the truth by magic.";
    }

    @Override
    public void exportClassInfo(PlayerCharacter p) throws IOException {
        super.exportClassInfo(p);
        String fileName = p.getName();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
        out.println("Master of Intrigue: " + masterOfIntrigue);
        out.println("Master of Tactics: " + masterOfTactics);
        if (p.getLvl() >= 9)
            out.println("Insightful Manipulator: " + insightfulManipulator);
        if (p.getLvl() >= 13)
            out.println("Misdirection: " + misdirection);
        if (p.getLvl() >= 17)
            out.println("Soul of Deceit: " + soulOfDeceit);
        out.close();
    }
}
class Phantom extends Rogue {
    private String whispersOfTheDead;
    private String wailsFromTheGrave;
    private String tokensOfTheDeparted;
    private String ghostWalk;
    private String deathKnell;
    public Phantom() {
        super("Phantom");
        whispersOfTheDead = "When you choose this archetype at 3rd level, echoes of those who have died cling to you. Whenever you finish a short or long rest, you can gain one skill or tool proficiency of your choice, as a ghostly presence shares its knowledge with you. You lose this proficiency when you use this feature to choose a different proficiency that you lack.";
        wailsFromTheGrave = "At 3rd level, as you nudge someone closer to the grave, you can channel the power of death to harm someone else as well. Immediately after you deal your Sneak Attack damage to a creature on your turn, you can target a second creature that you can see within 30 feet of the first creature. Roll half the number of Sneak Attack dice for your level (round up), and the second creature takes necrotic damage equal to the roll’s total, as wails of the dead sound around them for a moment. You can use this feature a number of times equal to your proficiency bonus, and you regain all expended uses when you finish a long rest.";
        tokensOfTheDeparted = "At 9th level, when a life ends in your presence, you're able to snatch a token from the departing soul, a sliver of its life essence that takes physical form: as a reaction when a creature you can see dies within 30 feet of you, you can open your free hand and cause a Tiny trinket to appear there, a soul trinket. The DM determines the trinket's form or has you roll on the Trinkets table in the Player's Handbook to generate it. You can have a maximum number of soul trinkets equal to your proficiency bonus, and you can't create one while at your maximum. You can use soul trinkets in the following ways:\n" +
                "    While a soul trinket is on your person, you have advantage on death saving throws and Constitution saving throws, for your vitality is enhanced by the life essence within the object.\n" +
                "    When you deal Sneak Attack damage on your turn, you can destroy one of your soul trinkets that's on your person and then immediately use Wails from the Grave, without expending a use of that feature.\n" +
                "    As an action, you can destroy one of your soul trinkets, no matter where it's located. When you do so, you can ask the spirit associated with the trinket one question. The spirit appears to you and answers in a language it knew in life. It's under no obligation to be truthful, and it answers as concisely as possible, eager to be free. The spirit knows only what it knew in life, as determined by the DM.";
        ghostWalk = "At 13th level, you can phase partially into the realm of the dead, becoming like a ghost. As a bonus action, you assume a spectral form. While in this form, you have a flying speed of 10 feet, you can hover, and attack rolls have disadvantage against you. You can also move through creatures and objects as if they were difficult terrain, but you take 1d10 force damage if you end your turn inside a creature or an object. You stay in this form for 10 minutes or until you end it as a bonus action. To use this feature again, you must finish a long rest or destroy one of your soul trinkets as part of the bonus action you use to activate Ghost Walk.";
        deathKnell = "At 17th level, your association with death has become so close that you gain the following benefits:\n" +
                "    When you use your Wails from the Grave, you can now deal the necrotic damage to both the first and the second creature.\n" +
                "    At the end of a long rest, a soul trinket appears in your hand if you don't have any soul trinkets, as the spirits of the dead are drawn to you.\n";
    }

    @Override
    public void exportClassInfo(PlayerCharacter p) throws IOException {
        super.exportClassInfo(p);
        String fileName = p.getName();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
        out.println("Whispers of the Dead: " + whispersOfTheDead);
        out.println("Wails from the Grave: " + wailsFromTheGrave);
        if (p.getLvl() >= 9)
            out.println("Tokens of the Departed: " + tokensOfTheDeparted);
        if (p.getLvl() >= 13)
            out.println("Ghost Walk: " + ghostWalk);
        if (p.getLvl() >= 17)
            out.println("Death Knell: " + deathKnell);
        out.close();
    }
}
class Scout extends Rogue {
    private String skirmisher;
    private String survivalist;
    private String superiorMobility;
    private String ambushMaster;
    private String suddenStrike;
    public Scout() {
        super("Scout");
        skirmisher = "Starting at 3rd level, you are difficult to pin down during a fight. You can move up to half your speed as a reaction when an enemy ends its turn within 5 feet of you. This movement doesn’t provoke opportunity attacks.";
        survivalist = "When you choose this archetype at 3rd level, you gain proficiency in the Nature and Survival skills if you don't already have it. Your proficiency bonus is doubled for any ability check you make that uses either of those proficiencies.";
        superiorMobility = "At 9th level, your walking speed increases by 10 feet. If you have a climbing or swimming speed, this increase applies to that speed as well.";
        ambushMaster = "Starting at 13th level, you excel at leading ambushes and acting first in a fight. You have advantage on initiative rolls. In addition, the first creature you hit during the first round of a combat becomes easier for you and others to strike; attack rolls against that target have advantage until the start of your next turn.";
        suddenStrike = "Starting at 17th level, you can strike with deadly speed. If you take the Attack action on your turn, you can make one additional attack as a bonus action. This attack can benefit from your Sneak Attack even if you have already used it this turn, but you can't use your Sneak Attack against the same target more than once in a turn.";
    }

    @Override
    public void update(PlayerCharacter p) {
        super.update(p);
        p.setSkillProf(new Nature(), true);
        p.setSkillProf(new Survival(), true);
    }

    @Override
    public void exportClassInfo(PlayerCharacter p) throws IOException {
        super.exportClassInfo(p);
        String fileName = p.getName();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
        out.println("Skirmisher: " + skirmisher);
        out.println("Survivalist: " + survivalist);
        if (p.getLvl() >= 9)
            out.println("Superior Mobility: " + superiorMobility);
        if (p.getLvl() >= 13)
            out.println("Ambush Master: " + ambushMaster);
        if (p.getLvl() >= 17)
            out.println("Sudden Strike: " + suddenStrike);
        out.close();
    }
}
class Soulknife extends Rogue {
    private String psionicPower;
    private int noPsionicEnergyDice;
    private int psionicEnergyDiceType;
    private String psychicBlades;
    private String soulBlades;
    private String psychicVeil;
    private String rendMind;
    public Soulknife() {
        super("Soulknife");
        psionicPower = "Starting at 3rd level, you harbor a wellspring of psionic energy within yourself. This energy is represented by your Psionic Energy dice, which are each a d6. You have a number of these dice equal to twice your proficiency bonus, and they fuel various psionic powers you have, which are detailed below. Some of your powers expend the Psionic Energy die they use, as specified in a power's description, and you can't use a power if it requires you to use a die when your dice are all expended. You regain all your expended Psionic Energy dice when you finish a long rest. In addition, as a bonus action, you can regain one expended Psionic Energy die, but you can't do so again until you finish a short or long rest. When you reach certain levels in this class, the size of your Psionic Energy dice increases: at 5th level (d8), 11th level (d10), and 17th level (d12). The powers below use your Psionic Energy dice:\n" +
                "   Psi-Bolstered Knack. When your nonpsionic training fails you, your psionic power can help: if you fail an ability check using a skill or tool with which you have proficiency, you can roll one Psionic Energy die and add the number rolled to the check, potentially turning failure into success. You expend the die only if the roll succeeds.\n" +
                "   Psychic Whispers. You can establish telepathic communication between yourself and others — perfect for quiet infiltration. As an action, choose one or more creatures you can see, up to a number of creatures equal to your proficiency bonus, and then roll one Psionic Energy die. For a number of hours equal to the number rolled, the chosen creatures can speak telepathically with you, and you can speak telepathically with them. To send or receive a message (no action required), you and the other creature must be within 1 mile of each other. A creature can't use this telepathy if it can't speak any languages, and a creature can end the telepathic connection at any time (no action required). You and the creature don't need to speak a common language to understand each other.\n" +
                "The first time you use this power after each long rest, you don't expend the Psionic Energy die. All other times you use the power, you expend the die.";
        psychicBlades = "Also at 3rd level, You can manifest your psionic power as shimmering blades of psychic energy. Whenever you take the Attack action, you can manifest a psychic blade from your free hand and make the attack with that blade. This magic blade is a simple melee weapon with the finesse and thrown properties. It has a normal range of 60 feet and no long range, and on a hit, it deals psychic damage equal to 1d6 plus the ability modifier you used for the attack roll. The blade vanishes immediately after it hits or misses its target, and it leaves no mark on its target if it deals damage. After you attack with the blade, you can make a melee or ranged weapon attack with a second psychic blade as a bonus action on the same turn, provided your other hand is free to create it. The damage die of this bonus attack is 1d4, instead of 1d6.";
        soulBlades = "Starting at 9th level, your Psychic Blades are now an expression of your psi-suffused soul, giving you these powers that use your Psionic Energy dice:\n" +
                "   Homing Strikes. If you make an attack roll with your Psychic Blades and miss the target, you can roll one Psionic Energy die and add the number rolled to the attack roll. If this causes the attack to hit, you expend the Psionic Energy die.\n" +
                "   Psychic Teleportation. As a bonus action, you manifest one of your Psychic Blades, expend one Psionic Energy die and roll it, and throw the blade at an unoccupied space you can see, up to a number of feet away equal to 10 times the number rolled. You then teleport to that space, and the blade vanishes.";
        psychicVeil = "At 13th level, you can weave a veil of psychic static to mask yourself. As an action, you can magically become invisible, along with anything you are wearing or carrying, for 1 hour or until you dismiss this effect (no action required). This invisibility ends early immediately after you deal damage to a creature, or you force a creature to make a saving throw. Once you use this feature, you can't do so again until you finish a long rest, unless you expend a Psionic Energy die to use this feature again.";
        rendMind = "When you reach 17th level, you can sweep your Psychic Blade directly through a creature's mind. When you use your Psychic Blades to deal Sneak Attack damage to a creature, you can force that target to make a Wisdom saving throw (DC equal to 8 + your proficiency bonus + your Dexterity modifier). If the save fails, the target is stunned for 1 minute. The stunned target can repeat the saving throw at the end of each of its turns, ending the effect on itself on a success. Once you use this feature, you can't do so again until you finish a long rest, unless you expend three Psionic Energy dice to use it again.";
        noPsionicEnergyDice = -1;
        psionicEnergyDiceType = 6;
    }

    @Override
    public void update(PlayerCharacter p) {
        super.update(p);
        noPsionicEnergyDice = p.getProfBonus() * 2;
        if (p.getLvl() >= 5)
            psionicEnergyDiceType = 8;
        if (p.getLvl() >= 11)
            psionicEnergyDiceType = 10;
        if (p.getLvl() >= 17)
            psionicEnergyDiceType = 12;
    }

    @Override
    public void exportClassInfo(PlayerCharacter p) throws IOException {
        super.exportClassInfo(p);
        update(p);
        String fileName = p.getName();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
        out.println("Psionic Power (" + noPsionicEnergyDice + "d" + psionicEnergyDiceType + ": " + psionicPower);
        out.println("Psychic Blades: " + psychicBlades);
        if (p.getLvl() >= 9)
            out.println("Soul Blades: " + soulBlades);
        if (p.getLvl() >= 13)
            out.println("Psychic Veil: " + psychicVeil);
        if (p.getLvl() >= 17)
            out.println("Rend Mind: " + rendMind);
        out.close();
    }
}
class Swashbuckler extends Rogue {
    private String fancyFootwork;
    private String rakishAudacity;
    private String panache;
    private String elegantManeuver;
    private String masterDuelist;
    public Swashbuckler() {
        super("Swashbuckler");
        fancyFootwork = "When you choose this archetype at 3rd level, you learn how to land a strike and then slip away without reprisal. During your turn, if you make a melee attack against a creature, that creature can't make opportunity attacks against you for the rest of your turn.";
        rakishAudacity = "Starting at 3rd level, your confidence propels you into battle. You can give yourself a bonus to your initiative rolls equal to your Charisma modifier. You also gain an additional way to use your Sneak Attack; you don't need advantage on the attack roll to use your Sneak Attack against a creature if you are within 5 feet of it, no other creatures are within 5 feet of you, and you don't have disadvantage on the attack roll. All the other rules for Sneak Attack still apply to you.";
        panache = "At 9th level, your charm becomes extraordinarily beguiling. As an action, you can make a Charisma (Persuasion) check contested by a creature's Wisdom (Insight) check. The creature must be able to hear you, and the two of you must share a language. If you succeed on the check and the creature is hostile to you, it has disadvantage on attack rolls against targets other than you and can't make opportunity attacks against targets other than you. This effect lasts for 1 minute, until one of your companions attacks the target or affects it with a spell, or until you and the target are more than 60 feet apart. If you succeed on the check and the creature isn't hostile to you, it is charmed by you for 1 minute. While charmed, it regards you as a friendly acquaintance. This effect ends immediately if you or your companions do anything harmful to it.";
        elegantManeuver = "Starting at 13th level, you can use a bonus action on your turn to gain advantage on the next Dexterity (Acrobatics) or Strength (Athletics) check you make during the same turn.";
        masterDuelist = "Beginning at 17th level, your mastery of the blade lets you turn failure into success in combat. If you miss with an attack roll, you can roll it again with advantage. Once you do so, you can't use this feature again until you finish a short or long rest.";
    }

    @Override
    public void exportClassInfo(PlayerCharacter p) throws IOException {
        super.exportClassInfo(p);
        String fileName = p.getName();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
        out.println("Fancy Footwork: " + fancyFootwork);
        out.println("Rakish Audacity: " + rakishAudacity);
        if (p.getLvl() >= 9)
            out.println("Panache: " + panache);
        if (p.getLvl() >= 13)
            out.println("Elegant Maneuver: " + elegantManeuver);
        if (p.getLvl() >= 17)
            out.println("Master Duelist: " + masterDuelist);
        out.close();
    }
}
class Thief extends Rogue {
    private String fastHands;
    private String secondStoryWork;
    private String supremeSneak;
    private String useMagicDevice;
    private String thiefsReflexes;
    public Thief() {
        super("Thief");
        fastHands = "Starting at 3rd level, you can use the bonus action granted by your Cunning Action to make a Dexterity (Sleight of Hand) check, use your thieves' tools to disarm a trap or open a lock, or take the Use an Object action.";
        secondStoryWork = "When you choose this archetype at 3rd level, you gain the ability to climb faster than normal; climbing no longer costs you extra movement. In addition, when you make a running jump, the distance you cover increases by a number of feet equal to your Dexterity modifier.";
        supremeSneak = "Starting at 9th level, you have advantage on a Dexterity (Stealth) check if you move no more than half your speed on the same turn.";
        useMagicDevice = "By 13th level, you have learned enough about the workings of magic that you can improvise the use of items even when they are not intended for you. You ignore all class, race, and level requirements on the use of magic items.";
        thiefsReflexes = "When you reach 17th level, you have become adept at laying ambushes and quickly escaping danger. You can take two turns during the first round of any combat. You take your first turn at your normal initiative and your second turn at your initiative minus 10. You can't use this feature when you are surprised.";
    }

    @Override
    public void exportClassInfo(PlayerCharacter p) throws IOException {
        super.exportClassInfo(p);
        String fileName = p.getName();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
        out.println("Fast Hands: " + fastHands);
        out.println("Second-Story Work: " + secondStoryWork);
        if (p.getLvl() >= 9)
            out.println("Supreme Sneak: " + supremeSneak);
        if (p.getLvl() >= 13)
            out.println("Use Magic Device: " + useMagicDevice);
        if (p.getLvl() >= 17)
            out.println("Thief's Reflexes: " + thiefsReflexes);
        out.close();
    }
}
