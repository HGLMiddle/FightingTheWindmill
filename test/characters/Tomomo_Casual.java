package test.characters;

import test.Character;

public class Tomomo_Casual extends Character {
    public Tomomo_Casual(int remaining_hp) {
        super(-1, 0, 1, 4, remaining_hp);
    }

    @Override
    public int default_atk() {
        return -1;
    }

    @Override
    public int default_def() {
        return 0;
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
