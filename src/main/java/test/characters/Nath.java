package test.characters;

import test.Character;

public class Nath extends Character {
    private int extensionLevel = 0;

    public Nath(int remaining_hp)
    {
        super(-1, -1, 1, 5, remaining_hp);
    }

    //TODO 部件扩张

    @Override
    public int default_atk() {
        return -1;
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
        return 5;
    }
}
