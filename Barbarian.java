package net.amber.culminating;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Barbarian extends Class {
    protected String rage;
    protected int noRages;
    protected int rageBonus;
    protected String unarmoredDefense;
    protected String dangerSense;
    protected String recklessAttack;
    protected String extraAttack;
    protected String fastMovement;
    protected String feralInstinct;
    protected String instinctivePounce;
    protected String brutalCritical;
    protected int noBrutalCriticalDice;
    protected String relentlessRage;
    protected String persistentRage;
    protected String indomitableMight;
    protected String primalChampion;

    public Barbarian() {
        super("Barbarian", "", "STR", "CON", "", "d12", 1, "STR", 13, new Skill[]{new AnimalHandling(), new Athletics(), new Intimidation(), new Nature(), new Perception(), new Survival()}, "(a) a greataxe or (b) any martial melee weapon\n" + "(a) two handaxes or (b) any simple weapon\n" + "An explorer's pack and four javelins", 3, new Class[]{new AncestralGuardian(), new Battlerager(), new Beast(), new Berserker(), new StormHerald(), new TotemWarrior(), new WildMagic(), new Zealot()}, new Skill[0], 2);
        rage = "In battle, you fight with primal ferocity. On your turn, you can enter a rage as a bonus action. While raging, you gain the following benefits if you aren't wearing heavy armor:\n" +
                "    You have advantage on Strength checks and Strength saving throws.\n" +
                "    When you make a melee weapon attack using Strength, you gain a bonus to the damage roll that increases as you gain levels as a barbarian, as shown in the Rage Damage column of the Barbarian table.\n" +
                "    You have resistance to bludgeoning, piercing, and slashing damage.\n" +
                "If you are able to cast spells, you can't cast them or concentrate on them while raging. Your rage lasts for 1 minute. It ends early if you are knocked unconscious or if your turn ends and you haven't attacked a hostile creature since your last turn or taken damage since then. You can also end your rage on your turn as a bonus action. Once you have raged the number of times shown for your barbarian level in the Rages column of the Barbarian table, you must finish a long rest before you can rage again.";
        noRages = 2;
        rageBonus = 2;
        unarmoredDefense = "While you are not wearing any armor, your armor class equals 10 + your Dexterity modifier + your Constitution modifier. You can use a shield and still gain this benefit.";
        dangerSense = "At 2nd level, you gain an uncanny sense of when things nearby aren't as they should be, giving you an edge when you dodge away from danger. You have advantage on Dexterity saving throws against effects that you can see, such as traps and spells. To gain this benefit, you can't be blinded, deafened, or incapacitated.";
        recklessAttack = "Starting at 2nd level, you can throw aside all concern for defense to attack with fierce desperation. When you make your first attack on your turn, you can decide to attack recklessly. Doing so gives you advantage on melee weapon attack rolls using Strength during this turn, but attack rolls against you have advantage until your next turn.";
        extraAttack = "Beginning at 5th level, you can attack twice, instead of once, whenever you take the Attack action on your turn.";
        fastMovement = "Starting at 5th level, your speed increases by 10 feet while you aren't wearing heavy armor.";
        feralInstinct = "By 7th level, your instincts are so honed that you have advantage on initiative rolls. Additionally, if you are surprised at the beginning of combat and aren't incapacitated, you can act normally on your first turn, but only if you enter your rage before doing anything else on that turn.";
        instinctivePounce = "At 7th level, as part of the bonus action you take to enter your rage, you can move up to half your speed.";
        brutalCritical = "Beginning at 9th level, you can roll one additional weapon damage die when determining the extra damage for a critical hit with a melee attack. This increases to two additional dice at 13th level and three additional dice at 17th level.";
        noBrutalCriticalDice = 0;
        relentlessRage = "Starting at 11th level, your rage can keep you fighting despite grievous wounds. If you drop to 0 hit points while you're raging and don't die outright, you can make a DC 10 Constitution saving throw. If you succeed, you drop to 1 hit point instead. Each time you use this feature after the first, the DC increases by 5. When you finish a short or long rest, the DC resets to 10.";
        persistentRage = "Beginning at 15th level, your rage is so fierce that it ends early only if you fall unconscious or if you choose to end it.";
        indomitableMight = "Beginning at 15th level, your rage is so fierce that it ends early only if you fall unconscious or if you choose to end it.";
        primalChampion = "At 20th level, you embody the power of the wilds. Your Strength and Constitution scores increase by 4. Your maximum for those scores is now 24.";
        ASILevels = new int[]{4, 8, 12, 16, 19};
    }
    public Barbarian(String subclassName) {
        super("Path of the " + subclassName + " Barbarian", subclassName, "STR", "CON", "", "d12", 1, "STR", 13, new Skill[]{new AnimalHandling(), new Athletics(), new Intimidation(), new Nature(), new Perception(), new Survival()}, "(a) a greataxe or (b) any martial melee weapon\n" + "(a) two handaxes or (b) any simple weapon\n" + "An explorer's pack and four javelins", 3, new Class[]{}, new Skill[0], 2);
        rage = "In battle, you fight with primal ferocity. On your turn, you can enter a rage as a bonus action. While raging, you gain the following benefits if you aren't wearing heavy armor:\n" +
                "    You have advantage on Strength checks and Strength saving throws.\n" +
                "    When you make a melee weapon attack using Strength, you gain a bonus to the damage roll that increases as you gain levels as a barbarian, as shown in the Rage Damage column of the Barbarian table.\n" +
                "    You have resistance to bludgeoning, piercing, and slashing damage.\n" +
                "If you are able to cast spells, you can't cast them or concentrate on them while raging. Your rage lasts for 1 minute. It ends early if you are knocked unconscious or if your turn ends and you haven't attacked a hostile creature since your last turn or taken damage since then. You can also end your rage on your turn as a bonus action. Once you have raged the number of times shown for your barbarian level in the Rages column of the Barbarian table, you must finish a long rest before you can rage again.";
        noRages = 2;
        rageBonus = 2;
        unarmoredDefense = "While you are not wearing any armor, your armor class equals 10 + your Dexterity modifier + your Constitution modifier. You can use a shield and still gain this benefit.";
        dangerSense = "At 2nd level, you gain an uncanny sense of when things nearby aren't as they should be, giving you an edge when you dodge away from danger. You have advantage on Dexterity saving throws against effects that you can see, such as traps and spells. To gain this benefit, you can't be blinded, deafened, or incapacitated.";
        recklessAttack = "Starting at 2nd level, you can throw aside all concern for defense to attack with fierce desperation. When you make your first attack on your turn, you can decide to attack recklessly. Doing so gives you advantage on melee weapon attack rolls using Strength during this turn, but attack rolls against you have advantage until your next turn.";
        extraAttack = "Beginning at 5th level, you can attack twice, instead of once, whenever you take the Attack action on your turn.";
        fastMovement = "Starting at 5th level, your speed increases by 10 feet while you aren't wearing heavy armor.";
        feralInstinct= "By 7th level, your instincts are so honed that you have advantage on initiative rolls. Additionally, if you are surprised at the beginning of combat and aren't incapacitated, you can act normally on your first turn, but only if you enter your rage before doing anything else on that turn.";
        instinctivePounce = "At 7th level, as part of the bonus action you take to enter your rage, you can move up to half your speed.";
        brutalCritical = "Beginning at 9th level, you can roll one additional weapon damage die when determining the extra damage for a critical hit with a melee attack. This increases to two additional dice at 13th level and three additional dice at 17th level.";
        noBrutalCriticalDice = 0;
        relentlessRage = "Starting at 11th level, your rage can keep you fighting despite grievous wounds. If you drop to 0 hit points while you're raging and don't die outright, you can make a DC 10 Constitution saving throw. If you succeed, you drop to 1 hit point instead. Each time you use this feature after the first, the DC increases by 5. When you finish a short or long rest, the DC resets to 10.";
        persistentRage = "Beginning at 15th level, your rage is so fierce that it ends early only if you fall unconscious or if you choose to end it.";
        indomitableMight = "Beginning at 15th level, your rage is so fierce that it ends early only if you fall unconscious or if you choose to end it.";
        primalChampion = "At 20th level, you embody the power of the wilds. Your Strength and Constitution scores increase by 4. Your maximum for those scores is now 24.";
        ASILevels = new int[]{4, 8, 12, 16, 19};
    }

    @Override
    public void update(PlayerCharacter p) {
        setNoRages(p);
        setRageBonus(p);
        setNoBrutalCriticalDice(p);
        hitDice = p.getLvl();
        updateStats(p);
    }
    public void setNoRages(PlayerCharacter p) {
        int lvl = p.getLvl();
        if (lvl/3.0 < 1)
            noRages = 2;
        else if (lvl/6.0 < 1)
            noRages = 3;
        else if (lvl/12.0 < 1)
            noRages = 4;
        else if (lvl/17.0 < 1)
            noRages = 5;
        else if (lvl == 20)
            noRages = 999;
        else
            noRages = 6;
    }
    public void setRageBonus(PlayerCharacter p) {
        int lvl = p.getLvl();
        if (lvl/9.0 < 1)
            rageBonus = 2;
        else if (lvl/16.0 < 1)
            rageBonus = 3;
        else
            rageBonus = 4;
    }
    public void updateStats(PlayerCharacter p) {
        if (p.getLvl() >= 20) {
            p.setStr(p.getStr() + 4);
            p.setCon(p.getCon() + 4);
        }
    }
    public void setNoBrutalCriticalDice(PlayerCharacter p) {
        int lvl = p.getLvl();
        if (lvl/10.0 < 1)
            noBrutalCriticalDice = 1;
        else if (lvl/14.0 < 1)
            noBrutalCriticalDice = 2;
        else
            noBrutalCriticalDice = 3;
    }
    @Override
    public void exportClassInfo(PlayerCharacter p) throws IOException {
        super.exportClassInfo(p);
        update(p);
        String fileName = p.getName();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
        out.println("Rage: " + noRages + "/day, +" + rageBonus + " bonus damage");
        out.println(rage);
        out.println("Unarmored Defense: " + unarmoredDefense);
        if (p.getLvl() >= 2) {
            out.println("Danger Sense: " + dangerSense);
            out.println("Reckless Attack: " + recklessAttack);
        }
        if (p.getLvl() >= 5) {
            out.println("Extra Attack: " + extraAttack);
            out.println("Fast Movement: " + fastMovement);
        }
        if (p.getLvl() >= 7)  {
            out.println("Feral Instinct: " + feralInstinct);
            out.println("Instinctive Pounce (Optional): " + instinctivePounce);
        }
        if (p.getLvl() >= 9)
            out.println("Brutal Critical (" + noBrutalCriticalDice + " bonus dice): " + brutalCritical);
        if (p.getLvl() >= 11)
            out.println("Relentless Rage: " + relentlessRage);
        if (p.getLvl() >= 15)
            out.println("Persistent Rage: " + persistentRage);
        if (p.getLvl() >= 18)
            out.println("Indomitable Might: " + indomitableMight);
        if (p.getLvl() >= 20)
            out.println("Primal Champion: " + primalChampion);
        out.close();
    }
}
class AncestralGuardian extends Barbarian {
    private String ancestralProtectors;
    private String spiritShield;
    private String consultTheSpirits;
    private String spikedRetribution;
    public AncestralGuardian() {
        super("Ancestral Guardian");
        ancestralProtectors = "Starting when you choose this path at 3rd level, spectral warriors appear when you enter your rage. While you're raging, the first creature you hit with an attack on your turn becomes the target of the warriors, which hinder its attacks. Until the start of your next turn, that target has disadvantage on any attack roll that isn't against you, and when the target hits a creature other than you with an attack, that creature has resistance to the damage dealt by the attack. The effect on the target ends early if your rage ends.";
        spiritShield = "Beginning at 6th level, the guardian spirits that aid you can provide supernatural protection to those you defend. If you are raging and another creature you can see within 30 feet of you takes damage, you can use your reaction to reduce that damage by 2d6. When you reach certain levels in this class, you can reduce the damage by more: by 3d6 at 10th level and by 4d6 at 14th level.";
        consultTheSpirits = "At 10th level, you gain the ability to consult with your ancestral spirits. When you do so, you cast the Augury or Clairvoyance spell, without using a spell slot or material components. Rather than creating a spherical sensor, this use of clairvoyance invisibly summons one of your ancestral spirits to the chosen location. Wisdom is your spellcasting ability for these spells. After you cast either spell in this way, you can't use this feature again until you finish a short or long rest.";
        spikedRetribution = "At 14th level, your ancestral spirits grow powerful enough to retaliate. When you use your Spirit Shield to reduce the damage of an attack, the attacker takes an amount of force damage that your Spirit Shield prevents.";
    }
    @Override
    public void exportClassInfo(PlayerCharacter p) throws IOException {
        super.exportClassInfo(p);
        String fileName = p.getName();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
        out.println("Ancestral Protectors: " + ancestralProtectors);
        if (p.getLvl() >= 6)
            out.println("Spirit Shield: " + spiritShield);
        if (p.getLvl() >= 10)
            out.println("Consult the Spirits: " + consultTheSpirits);
        if (p.getLvl() >= 14)
            out.println("Spiked Retribution: " + spikedRetribution);
        out.close();
    }
}
class Battlerager extends Barbarian {
    private String battleragerArmor;
    private String recklessAbandon;
    private String battleragerCharge;
    private String spikedRetribution;
    public Battlerager() {
        super("Battlerager");
        battleragerArmor = "When you choose this path at 3rd level, you gain the ability to use spiked armor as a weapon. While you are wearing spiked armor and are raging, you can use a bonus action to make one melee weapon attack with your armor spikes against a target within 5 feet of you. If the attack hits, the spikes deal 1d4 piercing damage. You use your Strength modifier for the attack and damage rolls. Additionally, when you use the Attack action to grapple a creature, the target takes 3 piercing damage if your grapple check succeeds.";
        recklessAbandon = "Beginning at 6th level, when you use Reckless Attack while raging, you also gain temporary hit points equal to your Constitution modifier (minimum of 1). They vanish if any of them are left when your rage ends.";
        battleragerCharge = "Beginning at 10th level, you can take the Dash action as a bonus action while you are raging.";
        spikedRetribution = "Starting at 14th level, when a creature within 5 feet of you hits you with a melee attack, the attacker takes 3 piercing damage if you are raging, aren't incapacitated, and are wearing spiked armor.";
    }
    @Override
    public void exportClassInfo(PlayerCharacter p) throws IOException {
        super.exportClassInfo(p);
        String fileName = p.getName();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
        out.println("Battlerager Armor: " + battleragerArmor);
        if (p.getLvl() >= 6)
            out.println("Reckless Abandon: " + recklessAbandon);
        if (p.getLvl() >= 10)
            out.println("Battlerager Charge: " + battleragerCharge);
        if (p.getLvl() >= 14)
            out.println("Spiked Retribution: " + spikedRetribution);
        out.close();
    }
}
class Beast extends Barbarian {
    private String formOfTheBeast;
    private String bestialSoul;
    private String infectiousFury;
    private String callTheHunt;
    public Beast() {
        super("Beast");
        formOfTheBeast = "Starting when you choose this path at 3rd level, when you enter your rage, you can transform, revealing the bestial power within you. Until the rage ends, you manifest a natural weapon. It counts as a simple melee weapon for you, and you add your Strength modifier to the attack and damage rolls when you attack with it, as normal. You choose the weapon’s form each time you rage:\n" +
                "Bite. Your mouth transforms into a bestial muzzle or great mandibles (your choice). It deals 1d8 piercing damage on a hit. Once on each of your turns when you damage a creature with this bite, you regain a number of hit points equal to your proficiency bonus, provided you have less than half your hit points when you hit.\n" +
                "Claws. Each of your hands transforms into a claw, which you can use as a weapon if it’s empty. It deals 1d6 slashing damage on a hit. Once on each of your turns when you attack with a claw using the Attack action, you can make one additional claw attack as part of the same action.\n" +
                "Tail. You grow a lashing, spiny tail, which deals 1d8 piercing damage on a hit and has the reach property. If a creature you can see within 10 feet of you hits you with an attack roll, you can use your reaction to swipe your tail and roll a d8, applying a bonus to your AC equal to the number rolled, potentially causing the attack to miss you.";
        bestialSoul = "Beginning at 6th level, the feral power within you increases, causing the natural weapons of your Form of the Beast to count as magical for the purpose of overcoming resistance and immunity to nonmagical attacks and damage. You can also alter your form to help you adapt to your surroundings. When you finish a short or long rest, choose one of the following benefits, which lasts until you finish a short or long rest:\n" +
                "    You gain a swimming speed equal to your walking speed, and you can breathe underwater.\n" +
                "    You gain a climbing speed equal to your walking speed, and you can climb difficult surfaces, including upside down on ceilings, without needing to make an ability check.\n" +
                "    When you jump, you can make a Strength (Athletics) check and extend your jump by a number of feet equal to the check’s total. You can make this special check only once per turn.\n";
        infectiousFury = "At 10th level, when you hit a creature with your natural weapons while you are raging, the beast within you can curse your target with rabid fury. The target must succeed on a Wisdom saving throw (DC equal to 8 + your Constitution modifier + your proficiency bonus) or suffer one of the following effects (your choice):\n" +
                "    The target must use its reaction to make a melee attack against another creature of your choice that you can see.\n" +
                "    Target takes 2d12 psychic damage.\n" +
                "You can use this feature a number of times equal to your proficiency bonus, and you regain all expended uses when you finish a long rest.";
        callTheHunt = "At 14th level, the beast within you grows so powerful that you can spread its ferocity to others and gain resilience from them joining your hunt. When you enter your rage, you can choose a number of other willing creatures you can see within 30 feet of you equal to your Constitution modifier (minimum of one creature). You gain 5 temporary hit points for each creature that accepts this feature. Until the rage ends, the chosen creatures can use the following benefit once on each of their turns: when the creature hits a target with an attack roll and deals damage to it, the creature can roll a d6 and gain a bonus to the damage equal to the number rolled. You can use this feature a number of times equal to your proficiency bonus, and you regain all expended uses when you finish a long rest.\n";
    }
    @Override
    public void exportClassInfo(PlayerCharacter p) throws IOException {
        super.exportClassInfo(p);
        String fileName = p.getName();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
        out.println("Form of the Beast: " + formOfTheBeast);
        if (p.getLvl() >= 6)
            out.println("Bestial Soul: " + bestialSoul);
        if (p.getLvl() >= 10)
            out.println("Infectious Fury: " + infectiousFury);
        if (p.getLvl() >= 14)
            out.println("Retaliation: " + callTheHunt);
        out.close();
    }
}
class Berserker extends Barbarian {
    private String frenzy;
    private String mindlessRage;
    private String intimidatingPresence;
    private String retaliation;
    public Berserker() {
        super("Berserker");
        frenzy = "Starting when you choose this path at 3rd level, you can go into a frenzy when you rage. If you do so, for the duration of your rage you can make a single melee weapon attack as a bonus action on each of your turns after this one. When your rage ends, you suffer one level of exhaustion.";
        mindlessRage = "Beginning at 6th level, you can't be charmed or frightened while raging. If you are charmed or frightened when you enter your rage, the effect is suspended for the duration of the rage.";
        intimidatingPresence = "Beginning at 10th level, you can use your action to frighten someone with your menacing presence. When you do so, choose one creature that you can see within 30 feet of you. If the creature can see or hear you, it must succeed on a Wisdom saving throw (DC equal to 8 + your proficiency bonus + your Charisma modifier) or be frightened of you until the end of your next turn. On subsequent turns, you can use your action to extend the duration of this effect on the frightened creature until the end of your next turn. This effect ends if the creature ends its turn out of line of sight or more than 60 feet away from you. If the creature succeeds on its saving throw, you can't use this feature on that creature again for 24 hours.";
        retaliation = "Starting at 14th level, when you take damage from a creature that is within 5 feet of you, you can use your reaction to make a melee weapon attack against that creature.";
    }
    @Override
    public void exportClassInfo(PlayerCharacter p) throws IOException {
        super.exportClassInfo(p);
        String fileName = p.getName();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
        out.println("Frenzy: " + frenzy);
        if (p.getLvl() >= 6)
            out.println("Mindless Rage: " + mindlessRage);
        if (p.getLvl() >= 10)
            out.println("Intimidating Presence: " + intimidatingPresence);
        if (p.getLvl() >= 14)
            out.println("Retaliation: " + retaliation);
        out.close();
    }
}
class StormHerald extends Barbarian {
    private String stormAura;
    private String stormSoul;
    private String shieldingStorm;
    private String ragingStorm;
    public StormHerald() {
        super("Storm Herald");
        stormAura = "When you select this path at 3rd level, you emanate a stormy, magical aura while you rage. The aura extends 10 feet from you in every direction, but not through total cover. Your aura has an effect that activates when you enter your rage, and you can activate the effect again on each of your turns as a bonus action. Choose desert, sea, or tundra. Your aura's effect depends on that chosen environment, as detailed below. You can change your environment choice whenever you gain a level in this class. If your aura's effects require a saving throw, the DC equals 8 + your proficiency bonus + your Constitution modifier.\n" +
                "   Desert. When this effect is activated, all other creatures in your aura take 2 fire damage each. The damage increases when you reach certain levels in this class, increasing to 3 at 5th level, 4 at 10th level, 5 at 15th level, and 6 at 20th level.\n" +
                "   Sea. When this effect is activated, you can choose one other creature you can see in your aura. The target must make a Dexterity saving throw. The target takes 1d6 lightning damage on a failed save, or half as much damage on a successful one. The damage increases when you reach certain levels in this class, increasing to 2d6 at 10th level, 3d6 at 15th level, and 4d6 at 20th level.\n" +
                "   Tundra. When this effect is activated, each creature of your choice in your aura gains 2 temporary hit points, as icy spirits inure it to suffering. The temporary hit points increase when you reach certain levels in this class, increasing to 3 at 5th level, 4 at 10th level, 5 at 15th level, and 6 at 20th level.";
        stormSoul = "At 6th level, the storm grants you benefits even when your aura isn't active. The benefits are based on the environment you chose for your Storm Aura.\n" +
                "   Desert. You gain resistance to fire damage, and you don’t suffer the effects of extreme heat, as described in the Dungeon Master's Guide. Moreover, as an action, you can touch a flammable object that isn't being worn or carried by anyone else and set it on fire.\n" +
                "   Sea. You gain resistance to lightning damage, and you can breathe underwater. You also gain a swimming speed of 30 feet.\n" +
                "   Tundra. You gain resistance to cold damage, and you don’t suffer the effects of extreme cold, as described in the Dungeon Master's Guide. Moreover, as an action, you can touch water and turn a 5-foot cube of it into ice, which melts after 1 minute. This action fails if a creature is in the cube.";
        shieldingStorm = "At 10th level, you learn to use your mastery of the storm to protect others. Each creature of your choice has the damage resistance you gained from the Storm Soul feature while the creature is in your Storm Aura.";
        ragingStorm = "At 14th level, the power of the storm you channel grows mightier, lashing out at your foes. The effect is based on the environment you chose for your Storm Aura.\n" +
                "   Desert. Immediately after a creature in your aura hits you with an attack, you can use your reaction to force that creature to make a Dexterity saving throw. On a failed save, the creature takes fire damage equal to your Barbarian level.\n" +
                "   Sea. When you hit a creature in your aura with an attack, you can use your reaction to force that creature to make a Strength saving throw. On a failed save, the creature is knocked prone, as if struck by a wave.\n" +
                "   Tundra. Whenever the effect of your Storm Aura is activated, you can choose one creature you can see in the aura. That creature must succeed on a Strength saving throw, or its speed is reduced to 0 until the start of your next turn, as magical frost covers it.\n";
    }
    @Override
    public void exportClassInfo(PlayerCharacter p) throws IOException {
        super.exportClassInfo(p);
        String fileName = p.getName();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
        out.println("Storm Aura: " + stormAura);
        if (p.getLvl() >= 6)
            out.println("Storm Soul: " + stormSoul);
        if (p.getLvl() >= 10)
            out.println("Shielding Storm: " + shieldingStorm);
        if (p.getLvl() >= 14)
            out.println("Raging Storm: " + ragingStorm);
        out.close();
    }
}
class TotemWarrior extends Barbarian {
    private String spiritSeeker;
    private String totemSpirit;
    private String[] totemSpirits;
    private int totemSpiritChoice;
    private String aspectOfTheBeast;
    private String[] aspectOfTheBeasts;
    private int aspectOfTheBeastChoice;
    private Skill[] tigerAspectPossibleProfs;
    private String totemicAttunement;
    private String[] totemicAttunements;
    private int totemicAttunementChoice;
    private String spiritWalker;
    public TotemWarrior() {
        super("Totem Warrior");
        spiritSeeker = "Yours is a path that seeks attunement with the natural world, giving you a kinship with beasts. At 3rd level when you adopt this path, you gain the ability to cast the Beast Sense and Speak with Animals spells, but only as rituals.";
        totemSpirit = "At 3rd level, when you adopt this path, you choose a totem spirit and gain its feature. You must make or acquire a physical totem object – an amulet or similar adornment – that incorporates fur or feathers, claws, teeth, or bones of the totem animal. At your option, you also gain minor physical attributes that are reminiscent of your totem spirit. For example, if you have a bear totem spirit, you might be unusually hairy and thick-skinned, or if your totem is the eagle, your eyes turn bright yellow. Your totem animal might be an animal related to those listed here but more appropriate to your homeland. For example, you could choose a hawk or vulture in place of an eagle.";
        totemSpirits = new String[]{"Bear. While raging, you have resistance to all damage except psychic damage. The spirit of the bear makes you tough enough to stand up to any punishment.", "Eagle. While you're raging and aren't wearing heavy armor, other creatures have disadvantage on opportunity attack rolls against you, and you can use the Dash action as a bonus action on your turn. The spirit of the eagle makes you into a predator who can weave through the fray with ease.", "Elk. While you're raging and aren't wearing heavy armor, your walking speed increases by 15 feet. The spirit of the elk makes you extraordinarily swift.", "Tiger. While raging, you can add 10 feet to your long jump distance and 3 feet to your high jump distance. The spirit of the tiger empowers your leaps.", "Wolf. While you're raging, your friends have advantage on melee attack rolls against any creature within 5 feet of you that is hostile to you. The spirit of the wolf makes you a leader of hunters."};
        totemSpiritChoice = -1;
        aspectOfTheBeast = "At 6th level, you gain a magical benefit based on the totem animal of your choice. You can choose the same animal you selected at 3rd level or a different one.";
        aspectOfTheBeasts = new String[]{"Bear. You gain the might of a bear. Your carrying capacity (including maximum load and maximum lift) is doubled, and you have advantage on Strength checks made to push, pull, lift, or break objects.", "Eagle. You gain the eyesight of an eagle. You can see up to 1 mile away with no difficulty, able to discern even fine details as though looking at something no more than 100 feet away from you. Additionally, dim light doesn't impose disadvantage on your Wisdom (Perception) checks.", "Elk. Whether mounted or on foot, your travel pace is doubled, as is the travel pace of up to ten companions while they're within 60 feet of you and you're not incapacitated. The elk spirit helps you roam far and fast.", "Tiger. You gain proficiency in two skills from the following list: Athletics, Acrobatics, Stealth, and Survival. The cat spirit hones your survival instincts.", "Wolf. You gain the hunting sensibilities of a wolf. You can track other creatures while traveling at a fast pace, and you can move stealthily while traveling at a normal pace."};
        aspectOfTheBeastChoice = -1;
        tigerAspectPossibleProfs = new Skill[]{new Athletics(), new Acrobatics(), new Stealth(), new Survival()};
        totemicAttunement = "At 14th level, you gain a magical benefit based on a totem animal of your choice. You can choose the same animal you selected previously or a different one.";
        totemicAttunements = new String[]{"Bear. While you're raging, any creature within 5 feet of you that's hostile to you has disadvantage on attack rolls against targets other than you or another character with this feature. An enemy is immune to this effect if it can't see or hear you or if it can't be frightened.", "Eagle. While raging, you have a flying speed equal to your current walking speed. This benefit works only in short bursts; you fall if you end your turn in the air and nothing else is holding you aloft.", "Elk. While raging, you can use a bonus action during your move to pass through the space of a Large or smaller creature. That creature must succeed on a Strength saving throw (DC 8 + your Strength bonus + your proficiency bonus) or be knocked prone and take bludgeoning damage equal to 1d12 + your Strength modifier.", "Tiger. While you're raging, if you move at least 20 feet in a straight line toward a Large or smaller target right before making a melee weapon attack against it, you can use a bonus action to make an additional melee weapon attack against it.", "Wolf. While you're raging, you can use a bonus action on your turn to knock a Large or smaller creature prone when you hit it with melee weapon attack."};
        totemicAttunementChoice = -1;
        spiritWalker = "At 10th level, you can cast the Commune with Nature spell, but only as a ritual. When you do so, a spiritual version of one of the animals you chose for Totem Spirit or Aspect of the Beast appears to you to convey the information you seek.";
    }
    public void setTotemSpiritChoice(int tSC) {
        totemSpiritChoice = tSC;
    }
    public void setAspectOfTheBeastChoice(int aOTBC) {
        aspectOfTheBeastChoice = aOTBC;
    }
    public void setTotemicAttunementChoice(int tAC) {
        totemicAttunementChoice = tAC;
    }
    public int getAspectOfTheBeastChoice() {
        return aspectOfTheBeastChoice;
    }
    public Skill[] getTigerAspectPossibleProfs() {
        return tigerAspectPossibleProfs;
    }

    @Override
    public void exportClassInfo(PlayerCharacter p) throws IOException {
        super.exportClassInfo(p);
        String fileName = p.getName();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
        out.println("Spirit Seeker: " + spiritSeeker);
        out.println("Totem Spirit: " + totemSpirit + "\n " + totemSpirits[totemSpiritChoice]);
        if (p.getLvl() >= 6)
            out.println("Aspect of the Beast: " + aspectOfTheBeast + "\n " + aspectOfTheBeasts[aspectOfTheBeastChoice]);
        if (p.getLvl() >= 10)
            out.println("Spirit Walker: " + spiritWalker);
        if (p.getLvl() >= 14)
            out.println("Totemic Attunement: " + totemicAttunement + "\n " + totemicAttunements[totemicAttunementChoice]);
        out.close();
    }
}
class WildMagic extends Barbarian {
    private String magicAwareness;
    private String wildSurge;
    private String bolsteringMagic;
    private String unstableBacklash;
    private String controlledSurge;
    public WildMagic() {
        super("Wild Magic");
        magicAwareness = "When you choose this path at 3rd level, as an action, you can open your awareness to the presence of concentrated magic. Until the end of your next turn, you know the location of any spell or magic item within 60 feet of you that isn’t behind total cover. When you sense a spell, you learn which school of magic it belongs to. You can use this feature a number of times equal to your proficiency bonus, and you regain all expended uses when you finish a long rest.";
        wildSurge = "Also at 3rd level, the magical energy roiling inside you sometimes erupts from you. When you enter your rage, roll on the Wild Magic table to determine the magical effect produced. If the effect requires a saving throw, the DC equals 8 + your proficiency bonus + your Constitution modifier.\n" +
                "1  Each creature of your choice that you can see within 30 feet of you must succeed on a Constitution saving throw or take 1d12 necrotic damage. You also gain temporary hit points equal to 1d12 plus your barbarian level.\n" +
                "2  You teleport up to 30 feet to an unoccupied space you can see. Until your rage ends, you can use this effect again on each of your turns as a bonus action.\n" +
                "3  An intangible spirit, which looks like a flumph or a pixie (your choice), appears within 5 feet of one creature of your choice that you can see within 30 feet of you. At the end of the current turn, the spirit explodes, and each creature within 5 feet of it must succeed on a Dexterity saving throw or take 1d6 force damage. Until your rage ends, you can use this effect again, summoning another spirit, on each of your turns as a bonus action.\n" +
                "4  Magic infuses one weapon of your choice that you are holding. Until your rage ends, the weapon's damage type changes to force, and it gains the light and thrown properties, with a normal range of 20 feet and a long range of 60 feet. If the weapon leaves your hand, the weapon reappears in your hand at the end of the current turn.\n" +
                "5  Whenever a creature hits you with an attack roll before your rage ends, that creature takes 1d6 force damage, as magic lashes out in retribution.\n" +
                "6  Until your rage ends, you are surrounded by multicolored, protective lights; you gain a +1 bonus to AC, and while within 10 feet of you, your allies gain the same bonus.\n" +
                "7  Flowers and vines temporarily grow around you; until your rage ends, the ground within 15 feet of you is difficult terrain for your enemies.\n" +
                "8  A bolt of light shoots from your chest. Another creature of your choice that you can see within 30 feet of you must succeed on a Constitution saving throw or take 1d6 radiant damage and be blinded until the start of your next turn. Until your rage ends, you can use this effect again on each of your turns as a bonus action.";
        bolsteringMagic = "Beginning at 6th level, you can harness your wild magic to bolster yourself or a companion. As an action, you can touch one creature (which can be yourself) and confer one of the following benefits of your choice to that creature:\n" +
                "    For 10 minutes, the creature can roll a d3 whenever making an attack roll or an ability check and add the number rolled to the d20 roll.\n" +
                "    Roll a d3. The creature regains one expended spell slot, the level of which equals the number rolled or lower (the creature’s choice). Once a creature receives this benefit, that creature can’t receive it again until after a long rest.\n" +
                "You can take this action a number of times equal to your proficiency bonus, and you regain all expended uses when you finish a long rest.";
        unstableBacklash = "At 10th level, when you are imperiled during your rage, the magic within you can lash out; immediately after you take damage or fail a saving throw while raging, you can use your reaction to roll on the Wild Magic table and immediately produce the effect rolled. This effect replaces your current Wild Magic effect.";
        controlledSurge = "At 14th level, whenever you roll on the Wild Magic table, you can roll the die twice and choose which of the two effects to unleash. If you roll the same number on both dice, you can ignore the number and choose any effect on the table.";
    }
    @Override
    public void exportClassInfo(PlayerCharacter p) throws IOException {
        super.exportClassInfo(p);
        String fileName = p.getName();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
        out.println("Magic Awareness: " + magicAwareness);
        out.println("Wild Surge: " + wildSurge);
        if (p.getLvl() >= 6)
            out.println("Bolstering Magic: " + bolsteringMagic);
        if (p.getLvl() >= 10)
            out.println("Unstable Backlash: " + unstableBacklash);
        if (p.getLvl() >= 14)
            out.println("Controlled Surge: " + controlledSurge);
        out.close();
    }
}
class Zealot extends Barbarian {
    private String divineFury;
    private String warriorOfTheGods;
    private String fanaticalFocus;
    private String zealousPresence;
    private String rageBeyondDeath;
    public Zealot() {
        super("Zealot");
        divineFury = "Starting when you choose this path at 3rd level, you can channel divine fury into your weapon strikes. While you're raging, the first creature you hit on each of your turns with a weapon attack takes extra damage equal to 1d6 + half your Barbarian level. The extra damage is necrotic or radiant; you choose the type of damage when you gain this feature.";
        warriorOfTheGods = "At 3rd level, your soul is marked for endless battle. If a spell, such as Raise Dead, has the sole effect of restoring you to life (but not undeath), the caster doesn't need material components to cast the spell on you.";
        fanaticalFocus = "Starting at 6th level, the divine power that fuels your rage can protect you. If you fail a saving throw while raging, you can reroll it, and you must use the new roll. You can use this ability only once per rage.";
        zealousPresence = "At 10th level, you learn to channel divine power to inspire zealotry in others. As a bonus action, you unleash a battle cry infused with divine energy. Up to ten other creatures of your choice within 60 feet of you that can hear you gain advantage on attack rolls and saving throws until the start of your next turn. Once you use this feature, you can’t use it again until you finish a long rest.";
        rageBeyondDeath = "Beginning at 14th level, the divine power that fuels your rage allows you to shrug off fatal blows. While you're raging, having 0 hit points doesn’t knock you unconscious. You still must make death saving throws, and you suffer the normal effects of taking damage while at 0 hit points. However, if you would die due to failing death saving throws, you don’t die until your rage ends, and you die then only if you still have 0 hit points.";
    }
    @Override
    public void exportClassInfo(PlayerCharacter p) throws IOException {
        super.exportClassInfo(p);
        String fileName = p.getName();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
        out.println("Divine Fury: " + divineFury);
        out.println("Warrior of the Gods: " + warriorOfTheGods);
        if (p.getLvl() >= 6)
            out.println("Fanatical Focus: " + fanaticalFocus);
        if (p.getLvl() >= 10)
            out.println("Zealous Presence: " + zealousPresence);
        if (p.getLvl() >= 14)
            out.println("Rage Beyond Deaths: " + rageBeyondDeath);
        out.close();
    }
}

