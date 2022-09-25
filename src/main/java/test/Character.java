package test;

import test.characters.FlyingCastle;

import java.util.Random;

public abstract class Character
{
    public abstract int default_atk();
    public abstract int default_def();
    public abstract int default_evd();
    public abstract int default_hp();

    public int atk;
    public int def;
    public int evd;
    public int max_hp;
    protected int present_hp;
    public boolean isAlive;
    public boolean canCounterattack = true;

    public Card cardUsed = null;
    public int battleTurns = 1;
    public boolean canEvade = true;

    public int temp_atk = 0;
    public int temp_def = 0;
    public int temp_evd = 0;

    public Character(int atk,int def,int evd,int max_hp)
    {
        this.atk=atk;
        this.def=def;
        this.evd=evd;
        this.max_hp=max_hp;
        this.present_hp=max_hp;
        this.isAlive=true;
    }

    public Character(int atk,int def,int evd,int max_hp,int remaining_hp)
    {
        this.atk=atk;
        this.def=def;
        this.evd=evd;
        this.max_hp=max_hp;
        this.present_hp=remaining_hp;
        this.isAlive=true;
    }

    public int Dice()
    {
        return new Random().nextInt(6)+1;
    }

    public int getPresentHP()
    {
        return present_hp;
    }

    public int getResist()
    {
        return present_hp + def ;
    }

    public void useBattleCard(Card card,Character user,Character competitor)
    {
        if(competitor instanceof FlyingCastle)
            return;
        switch (card) {
            case FINAL_BATTLE:
                user.battleTurns=10;
                competitor.battleTurns=10;
                break;
            case ON_FIRE:
                user.atk++;
                user.def--;
                user.temp_atk++;
                user.temp_def--;
                break;
            case RBITS:
                user.def+=2;
                user.temp_def+=2;
                break;
            case RAINBOW_CIRCLE:
                user.evd+=2;
                user.temp_evd+=2;
                user.def--;
                user.temp_def--;
                break;
            default:
                break;
        }
    }

    //false means evd,and true means def.
    //see handleIncomingDamage for more info.
    public boolean defendOrNot(int incomingDamage)
    {
        if(!this.canEvade)
            return true;
        if(incomingDamage <= this.evd||this.getPresentHP() == 1)
            return false;
        if(incomingDamage == this.getPresentHP())
            return true;
        if(this.getResist() <= this.evd)
            return true;
        return this.getResist() <= this.evd
                && incomingDamage <= this.getPresentHP();
    }

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
            this.takeDamage(incomingDamage >= evade_value ? incomingDamage : 0 );
        }
    }

    public void takeDamage(int damage_value)
    {
        if(damage_value <= 0)
            return;
        this.present_hp -= damage_value;
        if (this.present_hp<=0)
        {
            this.isAlive = false;
            this.present_hp = 0;
        }
    }

    public void DuelWith(Character target)
    {
        target.DuelingInterdictionPoint(this);
        this.ExecuteFullBattleCycle(this,target);
    }

    public void DuelingInterdictionPoint(Character challanger) {}

    public void BattleStart(Character enemy,boolean isFirst) {}

    public void BattleWon(Character defected) {}

    public void Heal(int heal_value)
    {
        if(heal_value <= 0)
            return;
        this.present_hp += heal_value;
        if(this.present_hp>= this.max_hp)
        {
            this.present_hp=this.max_hp;
        }
    }

    public int AttackDice()
    {
        return Math.max(this.atk + this.Dice(), 1);
    }

    //TODO 战斗轮数量
    public void ExecuteFullBattleCycle(Character first,Character second)
    {
        first.useBattleCard(first.cardUsed,first,second);
        second.useBattleCard(second.cardUsed,second,first);
        first.BattleStart(second,true);
        second.BattleStart(first,false);
        second.handleIncomingDamage(first.AttackDice());
        if(second.isAlive&&second.canCounterattack)
            first.handleIncomingDamage(second.AttackDice());
        if(!second.isAlive)
        {
            first.BattleWon(second);
            return;
        }
        else if(!first.isAlive)
        {
            second.BattleWon(first);
            return;
        }
        while(first.battleTurns > 1)
        {
            second.handleIncomingDamage(first.AttackDice());
            if(second.isAlive&&second.canCounterattack)
                first.handleIncomingDamage(second.AttackDice());
            if(!second.isAlive)
            {
                first.BattleWon(second);
                return;
            }
            else if(!first.isAlive)
            {
                second.BattleWon(first);
                return;
            }
            this.battleTurns--;
        }
        first.BattleEnd();
        second.BattleEnd();
    }

    public void BattleEnd()
    {
        if(this.temp_atk != 0)
        {
            this.atk-=this.temp_atk;
            this.temp_atk = 0;
        }
        if(this.temp_def != 0)
        {
            this.def-=this.temp_def;
            this.temp_def = 0;
        }
        if(this.temp_evd != 0)
        {
            this.evd-=this.temp_evd;
            this.temp_evd = 0;
        }
        this.canEvade = true;
    }

    //depleted method.
    public void battleWith(Character enemy,int turns)
    {
        for(int i = 1; i <= turns; i++)
        {
            int offense1 = Math.max(this.atk + this.Dice(), 1);
            enemy.handleIncomingDamage(offense1);
            if (enemy.isAlive&&!(enemy instanceof FlyingCastle))
            {
                int offense2 = Math.max(enemy.atk + enemy.Dice(), 1);
                this.handleIncomingDamage(offense2);
            }
        }
    }
    public void reset()
    {
        this.atk=default_atk();
        this.def=default_def();
        this.evd=default_evd();
        this.max_hp=default_hp();
    }
}
