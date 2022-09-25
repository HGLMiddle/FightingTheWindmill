package test.characters;

import test.Character;

public class Hime_Moonlight extends Character
{
    public boolean isFullMoon = false;
    private boolean fullMoonFlag = false;
    public Hime_Moonlight(int remaining_hp) {
        super(1, -2, 2, 5, remaining_hp);
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
        return 2;
    }

    @Override
    public int default_hp() {
        return 5;
    }

    @Override
    public void BattleStart(Character enemy,boolean isFirst)
    {
        if(isFullMoon)
        {
            this.atk = -1;
            this.def = -1;
            this.evd = 3;
            this.fullMoonFlag = true;
        }
    }
    @Override
    public void BattleEnd()
    {
        if(this.fullMoonFlag)
        {
            this.atk = 1;
            this.def = -2;
            this.evd = 2;
            this.fullMoonFlag = false;
        }
        super.BattleEnd();
    }
}
