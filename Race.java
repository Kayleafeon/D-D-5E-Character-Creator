package net.amber.culminating;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Race {
    protected String raceName;
    protected int strMod;
    protected int dexMod;
    protected int conMod;
    protected int intelligenceMod;
    protected int wisMod;
    protected int chaMod;
    protected boolean darkvision;
    protected Skill[] proficiencies;
    protected String creatureType;
    protected String age;
    protected String size;
    protected int baseSpeed;
    protected String languageProficiencies;
    protected boolean hasOptionalProficiencies;
    protected Skill[] optionalProficiencies;
    protected int optionalProficiencyChoices;
    public Race(String rN, int str, int dex, int con, int intelligence, int wis, int cha, boolean dv, Skill[] profs, String cT, String age, String sz, int bS, String langProfs, boolean hOP, Skill[] optionalProfs, int opProfChoices) {
        raceName = rN;
        strMod = str;
        dexMod = dex;
        conMod = con;
        intelligenceMod = intelligence;
        wisMod = wis;
        chaMod = cha;
        darkvision = dv;
        proficiencies = profs;
        for (Skill skl:proficiencies) {
            skl.setProf();
        }
        creatureType = cT;
        this.age = age;
        size = sz;
        baseSpeed = bS;
        languageProficiencies = langProfs;
        hasOptionalProficiencies = hOP;
        optionalProficiencies = optionalProfs;
        optionalProficiencyChoices = opProfChoices;
    }
    public Race() {
        raceName = "";
    }
    public void exportRaceInfo(PlayerCharacter p) throws IOException {
        String fileName = p.getName();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
        out.println("");
        out.println("Creature Type: " + creatureType);
        out.println("Age: " + age);
        out.println("Size: " + size);
        out.println("Base Speed: " + baseSpeed);
        out.println("Language Proficiencies: " + languageProficiencies);
        out.println("");
        out.close();
    }
    public String getRaceName() {
        return raceName;
    }
    public void setOptionalProficiency(PlayerCharacter p, String sklName) {
        Skill skl = null;
        for (Skill e:optionalProficiencies) {
            if (sklName.equalsIgnoreCase(e.getName()))
                skl = e;
        }
        p.setSkillProf(skl, true);
    }

    public Skill[] getOptionalProficiencies() {
        return optionalProficiencies;
    }

    public int getStrMod() {
        return strMod;
    }
    public int getDexMod() {
        return dexMod;
    }
    public int getConMod() {
        return conMod;
    }
    public int getIntelligenceMod() {
        return intelligenceMod;
    }
    public int getWisMod() {
        return wisMod;
    }
    public int getChaMod() {
        return chaMod;
    }
}

class Bugbear extends Race {
    private String longLimbed;
    private String powerfulBuild;
    private String surpriseAttack;
    public Bugbear() {
        super("Bugbear", 2, 1, 0, 0, 0, 0, true, new Skill[]{new Stealth()}, "Humanoid and Goblinoid", "Bugbears reach adulthood at age 16 and live up to 80 years.", "Medium", 30, "Common and Goblin", false, new Skill[0], 0);
        longLimbed = "Long-Limbed:\n When you make a melee attack on your turn, your reach for it is 5 feet greater than normal.";
        powerfulBuild = "Powerful Build:\n You count as one size larger when determining your carrying capacity and the weight you can push, drag, or lift.";
        surpriseAttack = " Surprise Attack:\n If you surprise a creature and hit it with an attack on your first turn in combat, the attack deals an extra 2d6 damage to it. You can use this trait only once per combat.";
    }

    @Override
    public void exportRaceInfo(PlayerCharacter p) throws IOException {
        super.exportRaceInfo(p);
        String fileName = p.getName();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
        out.println(longLimbed);
        out.println(powerfulBuild);
        out.println(surpriseAttack);
        out.close();
    }
}

class Centaur extends Race {
    private String charge;
    private String hooves;
    private String equineBuild;
    public Centaur() {
        super("Centaur", 2, 0, 0, 0, 1, 0, false, new Skill[0], "Fey", "Centaurs mature and age at about the same rate as humans.", "Medium", 40, "Common and Sylvan", true, new Skill[]{new AnimalHandling(), new Medicine(), new Nature(), new Survival()}, 1);
        charge = "Charge:\n If you move at least 30 feet straight toward a target and then hit it with a melee weapon attack on the same turn, you can immediately follow that attack with a bonus action, making one attack against the target with your hooves.";
        hooves = " Hooves:\n Your hooves are natural melee weapons, which you can use to make unarmed strikes. If you hit with them, you deal bludgeoning damage equal to 1d4 + your Strength modifier, instead of the bludgeoning damage normal for an unarmed strike.";
        equineBuild = "Equine Build:\n You count as one size larger when determining your carrying capacity and the weight you can push or drag. In addition, any climb that requires hands and feet is especially difficult for you because of your equine legs. When you make such a climb, each foot of movement costs you 4 extra feet, instead of the normal 1 extra foot.";
    }
    public void exportRaceInfo(PlayerCharacter p) throws IOException {
        super.exportRaceInfo(p);
        String fileName = p.getName();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
        out.println(charge);
        out.println(hooves);
        out.println(equineBuild);
        out.close();
    }
}

class Changeling extends Race {
    private String shapechanger;
    private String bonusASInc;
    public Changeling() {
        super("Changeling", 0, 0, 0, 0, 0, 2, false, new Skill[0], "Humanoid", "Changelings mature slightly faster than humans but share a similar lifespan—typically a century or less. While a changeling can transform to conceal their age, the effects of aging affect them similarly to humans.", "Medium", 30, "Common and 2 languages of choice", true, new Skill[]{new Deception(), new Insight(), new Intimidation(), new Persuasion()}, 2);
        bonusASInc = "Bonus Ability Score Increase:\n You may gain +1 to any ability score (excluding Charisma).";
        shapechanger = "Shapechanger:\n As an action, you can change your appearance and your voice. You determine the specifics of the changes, including your coloration, hair length, and sex. You can also adjust your height and weight, but not so much that your size changes. You can make yourself appear as a member of another race, though none of your game statistics change. You can't duplicate the appearance of a creature you've never seen, and you must adopt a form that has the same basic arrangement of limbs that you have. Your clothing and equipment aren't changed by this trait. You stay in the new form until you use an action to revert to your true form or until you die.";
    }
    public void exportRaceInfo(PlayerCharacter p) throws IOException {
        super.exportRaceInfo(p);
        String fileName = p.getName();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
        out.println(bonusASInc);
        out.println(shapechanger);
        out.close();
    }
}

class Dwarf extends Race {
    protected String dwarvenCombatTraining;
    protected String toolProficiency;
    protected String stonecunning;
    protected String speed;
    public Dwarf(String subraceName, int strBonus, int intBonus, boolean dvValue) {
        super(subraceName + " Dwarf", strBonus, 0, 2, intBonus, 0, 0, dvValue, new Skill[0], "Humanoid", "Dwarves mature at the same rate as humans, but they're considered young until they reach the age of 50. On average, they live about 350 years.", "Medium", 25, "Common and Dwarvish", false, new Skill[0], 0);
        dwarvenCombatTraining = "Dwarven Combat Training:\n You have proficiency with the battleaxe, handaxe, light hammer, and warhammer.";
        toolProficiency = "Tool Proficiency:\n You gain proficiency with the artisan's tools of your choice: Smith's tools, brewer's supplies, or mason's tools.";
        stonecunning = "Stonecunning:\n Whenever you make an Intelligence (History) check related to the origin of stonework, you are considered proficient in the History skill and add double your proficiency bonus to the check, instead of your normal proficiency bonus.";
        speed = "Speed:\n Your speed is not reduced by wearing heavy armor.";
    }
    public void exportRaceInfo(PlayerCharacter p) throws IOException {
        super.exportRaceInfo(p);
        String fileName = p.getName();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
        out.println(dwarvenCombatTraining);
        out.println(toolProficiency);
        out.println(stonecunning);
        out.println(speed);
        out.close();
    }
}
class Duergar extends Dwarf {
    private String superiorDV;
    private String duergarResilience;
    private String extraLanguage;
    private String duergarMagic;
    private String sunlightSensitivity;
    public Duergar() {
        super("Duergar", 1, 0, false);
        superiorDV = "Superior Darkvision:\n Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 120 feet of you as if it were bright light, and in darkness as if it were dim light. You can't discern color in darkness, only shades of gray.";
        duergarResilience = "Duergar Resilience:\n You have advantage on saving throws against poison, and you have resistance against poison damage. You also have advantage on saving throws against illusions and against being charmed or paralyzed.";
        extraLanguage = "Extra Language:\n You can speak, read, and write Undercommon.";
        duergarMagic = "Duergar Magic:\n When you reach 3rd level, you can cast the Enlarge/Reduce spell on yourself once with this trait, using only the spell's enlarge option. When you reach 5th level, you can cast the Invisibility spell on yourself once with this trait. You don't need material components for either spell, and you can't cast them while you're in direct sunlight, although sunlight has no effect on them once cast. You regain the ability to cast these spells with this trait when you finish a long rest. Intelligence is your spellcasting ability for these spells.";
        sunlightSensitivity = "Sunlight Sensitivity:\n You have disadvantage on attack rolls and Wisdom (Perception) checks that rely on sight when you, the target of your attack, or whatever you are trying to perceive is in direct sunlight.";
    }
    public void exportRaceInfo(PlayerCharacter p) throws IOException {
        super.exportRaceInfo(p);
        String fileName = p.getName();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
        out.println(superiorDV);
        out.println(duergarResilience);
        out.println(extraLanguage);
        out.println(duergarMagic);
        out.println(sunlightSensitivity);
        out.close();
    }
}
class MarkOfWarding extends Dwarf {
    private String wardersIntuition;
    private String wardsAndSeals;
    private String spellsOfTheMark;
    public MarkOfWarding() {
        super("Mark of Warding", 0, 1, true);
        wardersIntuition = "Warder's Intuition:\n When you make an Intelligence (Investigation) check or an ability check using thieves' tools, you can roll a d4 and add the number rolled to the ability check.";
        wardsAndSeals = "Wards and Seals:\n You can cast the Alarm and Mage Armor spells with this trait. Starting at 3rd level, you can also cast the Arcane Lock spell with it. Once you cast any of these spells with this trait, you can't cast that spell with it again until you finish a long rest. Intelligence is your spellcasting ability for these spells, and you don't need material components for them when you cast them with this trait.";
        spellsOfTheMark = "Spells of the Mark:\n If you have the Spellcasting or the Pact Magic class feature, the spells on the Mark of Warding Spells table are added to the spell list of your spellcasting class.\n" +
                "   Spell Level\tSpells\n" +
                "   1st\tAlarm, Armor of Agathys\n" +
                "   2nd\tArcane Lock, Knock\n" +
                "   3rd\tGlyph of Warding, Magic Circle\n" +
                "   4th\tLeomund's Secret Chest, Mordenkainen's Faithful Hound\n" +
                "   5th\tAntilife Shell";
    }
    public void exportRaceInfo(PlayerCharacter p) throws IOException {
        super.exportRaceInfo(p);
        String fileName = p.getName();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
        out.println(wardersIntuition);
        out.println(wardsAndSeals);
        out.println(spellsOfTheMark);
        out.close();
    }
}

class Elf extends Race {
    protected String feyAncestry;
    protected String trance;
    public Elf(String subraceName, int conMod, int intMod, int wisMod, int chaMod, int bs) {
        super(subraceName + " Elf", 0, 2, conMod, intMod, wisMod, chaMod, true, new Skill[]{new Perception()}, "Humanoid", "Although elves reach physical maturity at about the same age as humans, the elven understanding of adulthood goes beyond physical growth to encompass worldly experience. An elf typically claims adulthood and an adult name around the age of 100 and can live to be 750 years old.", "Medium", 30, "Common & Elvish", false, new Skill[0], 0);
        feyAncestry = "Fey Ancestry:\n You have advantage on saving throws against being charmed, and magic can't put you to sleep.";
        trance = "Trance:\n Elves don't need to sleep. Instead, they meditate deeply, remaining semiconscious, for 4 hours a day. (The Common word for such meditation is \"trance.\") While meditating, you can dream after a fashion; such dreams are actually mental exercises that have become reflexive through years of practice. After resting in this way, you gain the same benefit that a human does from 8 hours of sleep. If you meditate during a long rest, you finish the rest after only 4 hours. You otherwise obey all the rules for a long rest; only the duration is changed.";
    }
    public void exportRaceInfo(PlayerCharacter p) throws IOException {
        super.exportRaceInfo(p);
        String fileName = p.getName();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
        out.println(feyAncestry);
        out.println(trance);
        out.close();
    }
}
class Drow extends Elf {
    private String sunlightSensitivity;
    private String drowMagic;
    private String drowWeaponTraining;
    public Drow() {
        super("Drow", 0, 0, 0, 1, 30);
        sunlightSensitivity = "Sunlight Sensitivity:\n You have disadvantage on attack rolls and on Wisdom (Perception) checks that rely on sight when you, the target of your attack, or whatever you are trying to perceive is in direct sunlight.";
        drowMagic = "Drow Magic:\n You know the dancing lights cantrip. When you reach 3rd level, you can cast the faerie fire spell once with this trait; you regain the ability to cast it when you finish a long rest. When you reach 5th level, you can also cast the darkness spell once per day with this trait; you regain the ability to cast it when you finish a long rest. Charisma is your spellcasting ability for these spells.";
        drowWeaponTraining = "Drow Weapon Training:\n You have proficiency with rapiers, shortswords, and hand crossbows.";
    }
    public void exportRaceInfo(PlayerCharacter p) throws IOException {
        super.exportRaceInfo(p);
        String fileName = p.getName();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
        out.println(sunlightSensitivity);
        out.println(drowMagic);
        out.println(drowWeaponTraining);
        out.close();
    }
}
class EladrinT1 extends Elf {
    private String feyStep;
    private String weaponTraining;
    public EladrinT1() {
        super("Eladrin (T1)", 0, 1, 0, 0, 30);
        feyStep = "Fey Step:\n You can cast the misty step spell once using this trait. You regain the ability to do so when you finish a short or long rest.";
        weaponTraining = "Elf Weapon Training:\n You have proficiency with the longsword, shortsword, shortbow, and longbow.";
    }
    public void exportRaceInfo(PlayerCharacter p) throws IOException {
        super.exportRaceInfo(p);
        String fileName = p.getName();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
        out.println(feyStep);
        out.println(weaponTraining);
        out.close();
    }
}
class EladrinT2 extends Elf {
    private String feyStep;
    public EladrinT2() {
        super("Eladrin (T2)", 0, 0, 0, 1, 30);
        feyStep = "Fey Step.\n As a bonus action, you can magically teleport up to 30 feet to an unoccupied space you can see. Once you use this trait, you can't do so again until you finish a short or long rest. When you reach 3rd level, your Fey Step gains an additional effect based on your season; if the effect requires a saving throw, the DC equals 8 + your proficiency bonus + your Charisma modifier:\n" +
                "    Autumn. Immediately after you use your Fey Step, up to two creatures of your choice that you can see within 10 feet of you must succeed on a Wisdom saving throw or be charmed by you for 1 minute, or until you or your companions deal any damage to it.\n" +
                "    Winter. When you use your Fey Step, one creature of your choice that you can see within 5 feet of you before you teleport must succeed on a Wisdom saving throw or be frightened of you until the end of your next turn.\n" +
                "    Spring. When you use your Fey Step, you can touch one willing creature within 5 feet of you. That creature then teleports instead of you, appearing in an unoccupied space of your choice that you can see within 30 feet of you.\n" +
                "    Summer. Immediately after you use your Fey Step, each creature of your choice that you can see within 5 feet of you takes fire damage equal to your Charisma modifier (minimum of 1 damage).";
    }
    public void exportRaceInfo(PlayerCharacter p) throws IOException {
        super.exportRaceInfo(p);
        String fileName = p.getName();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
        out.println(feyStep);
        out.close();
    }
}
class HighElf extends Elf {
    private String extraLanguage;
    private String cantrip;
    private String weaponTraining;
    public HighElf() {
        super("High", 0, 1, 0, 0, 30);
        extraLanguage = "Extra Language:\n You can speak, read, and write one extra language of your choosing.";
        cantrip = "Cantrip:\n You know one cantrip of your choice from the wizard spell list. Intelligence is your spellcasting ability for it.";
        weaponTraining = "Elf Weapon Training:\n You have proficiency with the longsword, shortsword, shortbow, and longbow.";
    }
    public void exportRaceInfo(PlayerCharacter p) throws IOException {
        super.exportRaceInfo(p);
        String fileName = p.getName();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
        out.println(extraLanguage);
        out.println(cantrip);
        out.println(weaponTraining);
        out.close();
    }
}
class PallidElf extends Elf {
    private String incisiveSense;
    private String blessingOfTheMoonWeaver;
    public PallidElf() {
        super("Pallid", 0, 0, 1, 0, 30);
        incisiveSense = "Incisive Sense:\n You have advantage on Intelligence (Investigation) and Wisdom (Insight) checks.";
        blessingOfTheMoonWeaver = "Blessing of the Moon Weaver:\n You know the light cantrip. When you reach 3rd level, you can cast the sleep spell once with this trait and regain the ability to do so when you finish a long rest. When you reach 5th level, you can cast the invisibility spell (targeting yourself only) once with this trait and regain the ability to do so when you finish a long rest. Casting these spells with this trait doesn't require material components. Wisdom is your spellcasting ability for these spells.";
    }
    public void exportRaceInfo(PlayerCharacter p) throws IOException {
        super.exportRaceInfo(p);
        String fileName = p.getName();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
        out.println(incisiveSense);
        out.println(blessingOfTheMoonWeaver);
        out.close();
    }
}
class SeaElf extends Elf {
    private String extraLanguage;
    private String seaElfTraining;
    private String childOfTheSea;
    private String friendOfTheSea;
    public SeaElf() {
        super("Sea", 1, 0, 0, 0, 30);
        extraLanguage = "Extra Language:\n You can speak, read, and write Aquan.";
        seaElfTraining = "Sea Elf Training:\n You have proficiency with the spear, trident, light crossbow, and net.";
        childOfTheSea = "Child of the Sea:\n You have a swimming speed of 30 feet, and you can breathe air and water.";
        friendOfTheSea = "Friend of the Sea:\n Using gestures and sounds, you can communicate simple ideas with any beast that has an innate swimming speed.";
    }
    public void exportRaceInfo(PlayerCharacter p) throws IOException {
        super.exportRaceInfo(p);
        String fileName = p.getName();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
        out.println(extraLanguage);
        out.println(seaElfTraining);
        out.println(childOfTheSea);
        out.println(friendOfTheSea);
        out.close();
    }
}
class ShadarKai extends Elf {
    private String necroticResistance;
    private String blessingOfTheRavenQueen;
    public ShadarKai() {
        super("Shadar-Kai", 1, 0, 0, 0, 30);
        necroticResistance = "Necrotic Resistance:\n You have resistance to necrotic damage.";
        blessingOfTheRavenQueen = "Blessing of the Raven Queen:\n As a bonus action, you can magically teleport up to 30 feet to an unoccupied space you can see. Once you use this trait, you can't do so again until you finish a long rest. Starting at 3rd level, you also gain resistance to all damage when you teleport using this trait. The resistance lasts until the start of your next turn. During that time, you appear ghostly and translucent.";
    }
    public void exportRaceInfo(PlayerCharacter p) throws IOException {
        super.exportRaceInfo(p);
        String fileName = p.getName();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
        out.println(necroticResistance);
        out.println(blessingOfTheRavenQueen);
        out.close();
    }
}
class WoodElf extends Elf {
    private String maskOfTheWild;
    private String weaponTraining;
    public WoodElf() {
        super("Wood", 0, 0, 1, 0, 35);
        maskOfTheWild = "Mask of the Wild:\n You can attempt to hide even when you are only lightly obscured by foliage, heavy rain, falling snow, mist, and other natural phenomena.";
        weaponTraining = "Elf Weapon Training:\n You have proficiency with the longsword, shortsword, shortbow, and longbow.";
    }
    public void exportRaceInfo(PlayerCharacter p) throws IOException {
        super.exportRaceInfo(p);
        String fileName = p.getName();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
        out.println(maskOfTheWild);
        out.println(weaponTraining);
        out.close();
    }
}

class Genasi extends Race {
    public Genasi(String subclassName, int strBonus, int dexBonus, int intBonus, int wisBonus) {
        super(subclassName + " Genasi", strBonus, dexBonus, 2, intBonus, wisBonus, 0, false, new Skill[0], "Humanoid with elemental blood", "Genasi mature at about the same rate as humans and reach adulthood in their late teens. They live somewhat longer than humans do, up to 120 years.", "Medium", 30, "Common and Primordial", false, new Skill[0], 0);
    }
}
class AirGenasi extends Genasi {
    private String unendingBreath;
    private String mingleWithTheWind;
    public AirGenasi() {
        super("Air", 0, 1, 0, 0);
        unendingBreath = "Unending Breath:\n You can hold your breath indefinitely while you're not incapacitated.";
        mingleWithTheWind = "Mingle with the Wind:\n You can cast the levitate spell once with this trait, requiring no material components, and you regain the ability to cast it this way when you finish a long rest. Constitution is your spellcasting ability for this spell.";
    }
    public void exportRaceInfo(PlayerCharacter p) throws IOException {
        super.exportRaceInfo(p);
        String fileName = p.getName();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
        out.println(unendingBreath);
        out.println(mingleWithTheWind);
        out.close();
    }
}
class EarthGenasi extends Genasi {
    private String earthWalk;
    private String mergeWithStone;
    public EarthGenasi() {
        super("Earth", 1, 0, 0, 0);
        earthWalk = "Earth Walk:\n You can move across difficult terrain made of earth or stone without expending extra movement.";
        mergeWithStone = "Merge with Stone:\n You can cast the pass without trace spell once with this trait, requiring no material components, and you regain the ability to cast it this way when you finish a long rest. Constitution is your spellcasting ability for this spell.";
    }
    public void exportRaceInfo(PlayerCharacter p) throws IOException {
        super.exportRaceInfo(p);
        String fileName = p.getName();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
        out.println(earthWalk);
        out.println(mergeWithStone);
        out.close();
    }
}
class FireGenasi extends Genasi {
    private String weirdDV;
    private String fireResistance;
    private String reachToTheBlaze;
    public FireGenasi() {
        super("Fire", 0, 0, 1, 0);
        weirdDV = "Darkvision:\n You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. Your ties to the Elemental Plane of Fire make your darkvision unusual: everything you see in darkness is in a shade of red.";
        fireResistance = "Fire Resistance:\n You have resistance to fire damage.";
        reachToTheBlaze = "Reach to the Blaze:\n You know the produce flame cantrip. Once you reach 3rd level, you can cast the burning hands spell once with this trait as a 1st-level spell, and you regain the ability to cast it this way when you finish a long rest. Constitution is your spellcasting ability for these spells.";
    }
    public void exportRaceInfo(PlayerCharacter p) throws IOException {
        super.exportRaceInfo(p);
        String fileName = p.getName();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
        out.println(weirdDV);
        out.println(fireResistance);
        out.println(reachToTheBlaze);
        out.close();
    }
}
class WaterGenasi extends Genasi {
    private String acidResistance;
    private String amphibious;
    private String swim;
    private String callToTheWave;
    public WaterGenasi() {
        super("Water", 0, 0, 0, 1);
        acidResistance = "Acid Resistance:\n You have resistance to acid damage.";
        amphibious = "Amphibious:\n You can breathe air and water.";
        swim = "Swim:\n You have a swimming speed of 30 feet.";
        callToTheWave = "Call to the Wave:\n You know the shape water cantrip. When you reach 3rd level, you can cast the create or destroy water spell as a 2nd-level spell once with this trait, and you regain the ability to cast it this way when you finish a long rest. Constitution is your spellcasting ability for these spells.";
    }
    public void exportRaceInfo(PlayerCharacter p) throws IOException {
        super.exportRaceInfo(p);
        String fileName = p.getName();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
        out.println(acidResistance);
        out.println(amphibious);
        out.println(swim);
        out.println(callToTheWave);
        out.close();
    }
}

class Human extends Race {
    public Human() {
        super("Human", 1, 1, 1, 1, 1, 1, false, new Skill[0], "Humanoid", "Humans reach adulthood in their late teens and live less than a century.", "Medium", 30, "Common & 1 language of choice", false, new Skill[0], 0);
    }
}

class Kalashtar extends Race {
    private String dualMind;
    private String mentalDiscipline;
    private String mindLink;
    private String severedFromDreams;
    public Kalashtar() {
        super("Kalashtar", 0, 0, 0, 0, 2, 1, false, new Skill[0], "Humanoid", "Kalashtar mature and age at the same rate as humans.", "Medium", 30, "Common, Quori, and 1 language of choice", false, new Skill[0], 0);
        dualMind = "Dual Mind:\n You have advantage on all Wisdom saving throws.";
        mentalDiscipline = "Mental Discipline:\n You have resistance to psychic damage.";
        mindLink = "Mind Link:\n You can speak telepathically to any creature you can see, provided the creature is within a number of feet of you equal to 10 times your level. You don't need to share a language with the creature for it to understand your telepathic utterances, but the creature must be able to understand at least one language. When you're using this trait to speak telepathically to a creature, you can use your action to give that creature the ability to speak telepathically with you for 1 hour or until you end this effect as an action. To use this ability, the creature must be able to see you and must be within this trait's range. You can give this ability to only one creature at a time; giving it to a creature takes it away from another creature who has it.";
        severedFromDreams = "Severed from Dreams:\n Kalashtar sleep, but they don't connect to the plane of dreams as other creatures do. Instead, their minds draw from the memories of their otherworldly spirit while they sleep. As such, you are immune to spells and other magical effects that require you to dream, like dream, but not to spells and other magical effects that put you to sleep, like sleep.";
    }
    public void exportRaceInfo(PlayerCharacter p) throws IOException {
        super.exportRaceInfo(p);
        String fileName = p.getName();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
        out.println(dualMind);
        out.println(mentalDiscipline);
        out.println(mindLink);
        out.println(severedFromDreams);
        out.close();
    }
}

