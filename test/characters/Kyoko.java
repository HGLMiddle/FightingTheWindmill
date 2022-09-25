package test.characters;

import test.Character;

public class Kyoko extends Character
{
    public Kyoko(int remaining_hp)
    {
        super(-1, 3, -2, 5,remaining_hp);
    }

    @Override
    public int default_atk() {
        return -1;
    }

    @Override
    public int default_def() {
        return 3;
    }

    @Override
    public int default_evd() {
        return -2;
    }

    @Override
    public int default_hp() {
        return 5;
    }

    @Override
    public boolean defendOrNot(int incomingDamage)
    {
        return true;
    }
}
