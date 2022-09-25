package test.characters;

import test.Character;

public class Sham extends Character {
    public Sham(int remaining_hp) {
        super(0, 1, 1, 4, remaining_hp);
    }

    @Override
    public int default_atk() {
        return 0;
    }

    @Override
    public int default_def() {
        return 1;
    }

    @Override
    public int default_evd() {
        return 1;
    }

    @Override
    public int default_hp() {
        return 4;
    }
}
