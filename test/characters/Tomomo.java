package test.characters;

import test.Character;

public class Tomomo extends Character {
    public Tomomo(int remaining_hp) {
        super(2, 0, 0, 4, remaining_hp);
    }

    @Override
    public int default_atk() {
        return 2;
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
        return 4;
    }
}
