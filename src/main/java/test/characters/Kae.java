package test.characters;

import test.Character;

public class Kae extends Character {

    private boolean blazeFlag = false;

    public Kae(int remaining_hp) {
        super(0, -1, 1, 4, remaining_hp);
    }

    @Override
    public int default_atk() {
        return 0;
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
    public void BattleStart(Character enemy,boolean isFirst)
    {
        if(isFirst)
        {
            this.def--;
            this.blazeFlag = true;
        }
        this.atk -= this.def;
    }

    @Override
    public void BattleEnd()
    {
        this.atk = 0;
        if(this.blazeFlag)
            this.def++;
        super.BattleEnd();
    }
}
