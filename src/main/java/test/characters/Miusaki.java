package test.characters;

import test.Character;

public class Miusaki extends Character
{
    public Miusaki(int remaining_hp)
    {
        super(1, -2, 0, 4, remaining_hp);
    }

    @Override
    public int default_atk() {
        return 1;
    }

    @Override
    public int default_def() {
        return -2;
    }

    @Override
    public int default_evd() {
        return 0;
    }

    @Override
    public int default_hp() {
        return 4;
    }

    @Override
    public boolean defendOrNot(int incomingDamage)
    {
        if(!this.canEvade)
            return true;
        if(incomingDamage == 1||incomingDamage <= this.evd)
            return false;
        else if(this.getPresentHP() >= 3)
            return true;
        else return this.getPresentHP() == 2 && incomingDamage <= 2;
    }
    @Override
    public void handleIncomingDamage(int incomingDamage)
    {
        if(this.defendOrNot(incomingDamage))
        //Defending
        {
            int defence_value = Math.max(this.Dice() + this.def, 1);
            this.takeDamage(Math.min(Math.max(incomingDamage - defence_value, 1),2));
        }
        else
        //Evading
        {
            int evade_value = Math.max(this.Dice() + this.evd, 1);
            this.takeDamage(incomingDamage >= evade_value ? incomingDamage : 0 );
        }
    }
}
