package test.characters;

import test.Character;

public class Syura extends Character
{
    public Syura(int remaining_hp)
    {
            super(0, 1, 0, 4, remaining_hp);
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
        return 0;
    }

    @Override
    public void BattleStart(Character enemy,boolean isFirst)
    {
        if(this.getPresentHP() == 1)
        {
            this.atk++;
            this.temp_atk++;
            this.evd++;
            this.temp_evd++;
        }
    }
}
