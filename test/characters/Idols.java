package test.characters;

import test.Character;

import java.util.Random;

public class Idols extends Character
{
    public Idols(int remaining_hp)
    {
        super(0, 0, 1, 4, remaining_hp);
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
    public void battleWith(Character enemy,int turns)
    {
        boolean singleUsedFlag1 = false;
        if(new Random().nextInt(2)==0)
        {
            this.atk++;
            singleUsedFlag1 = true;
        }
        else
        {
            this.def++;
        }
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
        if (singleUsedFlag1)
        {
            this.atk--;
        }else {
            this.def--;
        }
    }
}
