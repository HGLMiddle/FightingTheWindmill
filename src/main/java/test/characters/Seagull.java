package test.characters;

import test.Character;

public class Seagull extends Character
{
    public Seagull()
    {
        super(+1, -1, -1, 3);
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
        return -1;
    }

    @Override
    public int default_hp() {
        return 3;
    }
}
