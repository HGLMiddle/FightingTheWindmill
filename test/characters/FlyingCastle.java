package test.characters;

import test.Character;

public class FlyingCastle extends Character
{
    public FlyingCastle(int remaining_hp)
    {
        super(1, -1, -2, 8, remaining_hp);
        this.canCounterattack = false;
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
        return -2;
    }

    @Override
    public int default_hp() {
        return 8;
    }
}
