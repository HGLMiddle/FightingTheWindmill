package test.characters;

import test.Character;

public class Iru extends Character
{
    public Iru(int remaining_hp)
    {
        super(0, 0, 0, 5, remaining_hp);
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
        return 0;
    }

    @Override
    public int default_hp() {
        return 5;
    }

    //TODO 修改覆写点
    @Override
    public void battleWith(Character enemy,int turns)
    {
        enemy.takeDamage(1);
        for(int i = 1; i <= turns; i++)
        {
            int offense2 = Math.max(enemy.Dice() + enemy.atk, 1);
            this.handleIncomingDamage(offense2);
            if (this.isAlive)
            {
                int offense1 = Math.max(this.Dice() + this.atk, 1);
                enemy.handleIncomingDamage(offense1);
            }
        }
    }
}
