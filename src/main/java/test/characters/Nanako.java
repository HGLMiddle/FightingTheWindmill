package test.characters;

import test.Character;

public class Nanako extends Character {
    public Nanako(int remaining_hp) {
        super(0, 2, 1, 3, remaining_hp);
    }

    @Override
    public int default_atk() {
        return 0;
    }

    @Override
    public int default_def() {
        return 2;
    }

    @Override
    public int default_evd() {
        return 1;
    }

    @Override
    public int default_hp() {
        return 3;
    }
}
