package test.characters;

import test.Character;

public class Ceoreparque extends Character
{
    private Character enemy = null;
    public Ceoreparque(int remaining_hp) {
        super(0, 0, 1, 4, remaining_hp);
    }
    public boolean isEvadeSuccessful(int evade_value,int incomingDamage)
    {
        return evade_value > incomingDamage;
    }

    @Override
    public void BattleStart(Character enemy,boolean isFirst)
    {
        this.enemy = enemy;
    }

    @Override
    public int default_atk() {
        return 0;
    }

    @Override
    public int default_def() {
        return 0;
    }

    @Override
    public int default_evd() {
        return 1;
    }

    @Override
    public int default_hp() {
        return 4;
    }

    @Override
    public void handleIncomingDamage(int incomingDamage)
    {
        if(this.defendOrNot(incomingDamage))
        //Defending
        {
            int defence_value = Math.max(this.Dice() + this.def, 1);
            this.takeDamage(Math.max(incomingDamage - defence_value, 1));
        }
        else
        //Evading
        {
            int evade_value = Math.max(this.Dice() + this.evd, 1);

            if(isEvadeSuccessful(evade_value,incomingDamage))
            {
                try{
                    enemy.takeDamage(1);
                }catch (NullPointerException ignored){}
                this.takeDamage(0);
            }
            else
            {
                this.takeDamage(incomingDamage);
            }
        }
    }

    @Override
    public void BattleEnd()
    {
        this.enemy = null;
        super.BattleEnd();
    }
}
