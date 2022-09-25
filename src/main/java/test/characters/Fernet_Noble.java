package test.characters;

import test.Character;

public class Fernet_Noble extends Character
{
    public Fernet_Noble(int remaining_hp)
    {
        super(-1, 1, -1, 6, remaining_hp);
    }

    @Override
    public int default_atk() {
        return -1;
    }

    @Override
    public int default_def() {
        return 1;
    }

    @Override
    public int default_evd() {
        return -1;
    }

    @Override
    public int default_hp() {
        return 6;
    }

    @Override
    public void DuelingInterdictionPoint(Character challanger)
    {
        //PB4Y-2.jpg
    }
}
