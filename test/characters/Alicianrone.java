package test.characters;

import test.Character;

public class Alicianrone extends Character
{

    private int accelerationFlag = 0;

    public Alicianrone(int remaining_hp)
    {
        super(1, -1, 1, 4, remaining_hp);
    }

    @Override
    public int default_atk() {
        return 1;
    }

    @Override
    public int default_def() {
        return -1;
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
    public void BattleStart(Character enemy, boolean isFirst)
    {
        if(enemy.atk == 1)
        {
            this.evd++;
            this.temp_evd = 1;
        }
        else if(enemy.atk >= 2 )
        {
            this.evd++;
            this.evd++;
            this.temp_evd = 2;
        }
    }
}
