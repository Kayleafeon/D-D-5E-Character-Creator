package net.amber.culminating;
public class Skill {
    protected String name;
    protected String baseStat;
    protected boolean isProficient;
    public Skill(String n, String bs) {
        name = n;
        baseStat = bs;
        isProficient = false;
    }

    public String getName() {
        return name;
    }

    public String getBaseStat() {
        return baseStat;
    }
    public void setProf(boolean isProf) {
        isProficient = isProf;
    }
    public void setProf() {
        isProficient = true;
    }
    public boolean getTorFProficient() {
        return isProficient;
    }
    public String toString() {
        return getName();
    }
}
    class Acrobatics extends Skill {
        private int mod;
        public Acrobatics() {
            super("Acrobatics", "Dex");
            mod = 0;
        }
        public int getMod() {
            return mod;
        }
        public void setMod(PlayerCharacter p) {
            int tmp = p.getDex() - 10 / 2;
            if (getTorFProficient())
                tmp += p.getProfBonus();
            mod = tmp;
        }
    }

    class AnimalHandling extends Skill {
        private int mod;

        public AnimalHandling() {
            super("Animal Handling", "Wis");
            mod = 0;
        }

        public int getMod() {
            return mod;
        }

        public void setMod(PlayerCharacter p) {
            int tmp = p.getWis() - 10 / 2;
            if (getTorFProficient())
                tmp += p.getProfBonus();
            mod = tmp;
        }
 }

    class Arcana extends Skill {
        private int mod;
        public Arcana() {
            super("Arcana", "Int");
            mod = 0;
        }

        public int getMod() {
            return mod;
        }

        public void setMod(PlayerCharacter p) {
            int tmp = p.getIntelligence() - 10 / 2;
            if (getTorFProficient())
                tmp += p.getProfBonus();
            mod = tmp;
        }
    }

    class Athletics extends Skill {
        private int mod;
        public Athletics() {
            super("Athletics", "Str");
            mod = 0;
        }

        public int getMod() {
            return mod;
        }


        public void setMod(PlayerCharacter p) {
            int tmp = p.getStr() - 10 / 2;
            if (getTorFProficient())
                tmp += p.getProfBonus();
            mod = tmp;
        }

    }

    class Deception extends Skill {
        private int mod;

        public Deception() {
            super("Deception", "Cha");
            mod = 0;
        }

        public int getMod() {
            return mod;
        }


        public void setMod(PlayerCharacter p) {
            int tmp = p.getCha() - 10 / 2;
            if (getTorFProficient())
                tmp += p.getProfBonus();
            mod = tmp;
        }

    }

    class History extends Skill {
        private int mod;

        public History() {
            super("History", "Int");
            mod = 0;
        }

        public int getMod() {
            return mod;
        }


        public void setMod(PlayerCharacter p) {
            int tmp = p.getIntelligence() - 10 / 2;
            if (getTorFProficient())
                tmp += p.getProfBonus();
            mod = tmp;
        }

    }

    class Insight extends Skill {
        private int mod;

        public Insight() {
            super("Insight", "Wis");
            mod = 0;
        }

        public int getMod() {
            return mod;
        }


        public void setMod(PlayerCharacter p) {
            int tmp = p.getWis() - 10 / 2;
            if (getTorFProficient())
                tmp += p.getProfBonus();
            mod = tmp;
        }

    }

    class Intimidation extends Skill {
        private int mod;

        public Intimidation() {
            super("Intimidation", "Cha");
            mod = 0;
        }

        public int getMod() {
            return mod;
        }


        public void setMod(PlayerCharacter p) {
            int tmp = p.getCha() - 10 / 2;
            if (getTorFProficient())
                tmp += p.getProfBonus();
            mod = tmp;
        }

    }

    class Investigation extends Skill {
        private int mod;

        public Investigation() {
            super("Investigation", "Int");
            mod = 0;
        }

        public int getMod() {
            return mod;
        }


        public void setMod(PlayerCharacter p) {
            int tmp = p.getIntelligence() - 10 / 2;
            if (getTorFProficient())
                tmp += p.getProfBonus();
            mod = tmp;
        }

    }

    class Medicine extends Skill {
        private int mod;

        public Medicine() {
            super("Medicine", "Wis");
            mod = 0;
        }

        public int getMod() {
            return mod;
        }


        public void setMod(PlayerCharacter p) {
            int tmp = p.getWis() - 10 / 2;
            if (getTorFProficient())
                tmp += p.getProfBonus();
            mod = tmp;
        }

    }

    class Nature extends Skill {
        private int mod;

        public Nature() {
            super("Nature", "Int");
            mod = 0;
        }

        public int getMod() {
            return mod;
        }


        public void setMod(PlayerCharacter p) {
            int tmp = p.getIntelligence() - 10 / 2;
            if (getTorFProficient())
                tmp += p.getProfBonus();
            mod = tmp;
        }

    }

    class Perception extends Skill {
        private int mod;

        public Perception() {
            super("Perception", "Wis");
            mod = 0;
        }

        public int getMod() {
            return mod;
        }


        public void setMod(PlayerCharacter p) {
            int tmp = p.getWis() - 10 / 2;
            if (getTorFProficient())
                tmp += p.getProfBonus();
            mod = tmp;
        }

    }

    class Performance extends Skill {
        private int mod;

        public Performance() {
            super("Performance", "Cha");
            mod = 0;
        }

        public int getMod() {
            return mod;
        }

        public void setMod(PlayerCharacter p) {
            int tmp = p.getCha() - 10 / 2;
            if (getTorFProficient())
                tmp += p.getProfBonus();
            mod = tmp;
        }

    }

    class Persuasion extends Skill {
        private int mod;

        public Persuasion() {
            super("Persuasion", "Cha");
            mod = 0;
        }

        public int getMod() {
            return mod;
        }


        public void setMod(PlayerCharacter p) {
            int tmp = p.getCha() - 10 / 2;
            if (getTorFProficient())
                tmp += p.getProfBonus();
            mod = tmp;
        }

    }

    class Religion extends Skill {
        private int mod;

        public Religion() {
            super("Religion", "Int");
            mod = 0;
        }

        public int getMod() {
            return mod;
        }

        public void setMod(PlayerCharacter p) {
            int tmp = p.getIntelligence() - 10 / 2;
            if (getTorFProficient())
                tmp += p.getProfBonus();
            mod = tmp;
        }

    }

    class SleightOfHand extends Skill {
        private int mod;

        public SleightOfHand() {
            super("SleightOfHand", "Dex");
            mod = 0;
        }

        public int getMod() {
            return mod;
        }


        public void setMod(PlayerCharacter p) {
            int tmp = p.getDex() - 10 / 2;
            if (getTorFProficient())
                tmp += p.getProfBonus();
            mod = tmp;
        }

    }

    class Stealth extends Skill {
        private int mod;

        public Stealth() {
            super("Stealth", "Dex");
            mod = 0;
        }

        public int getMod() {
            return mod;
        }


        public void setMod(PlayerCharacter p) {
            int tmp = p.getDex() - 10 / 2;
            if (getTorFProficient())
                tmp += p.getProfBonus();
            mod = tmp;
        }

    }

    class Survival extends Skill {
        private int mod;

        public Survival() {
            super("Survival", "Wis");
            mod = 0;
        }

        public int getMod() {
            return mod;
        }


        public void setMod(PlayerCharacter p) {
            int tmp = p.getWis() - 10 / 2;
            if (getTorFProficient())
                tmp += p.getProfBonus();
            mod = tmp;
        }

    }