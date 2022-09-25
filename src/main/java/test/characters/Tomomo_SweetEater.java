package test.characters;

import test.Character;

public class Tomomo_SweetEater extends Character {
    public Tomomo_SweetEater(int remaining_hp) {
        super(3, 0, 0, 6, remaining_hp);
    }

    @Override
    public int default_atk() {
        return 3;
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
        return 6;
    }
}
