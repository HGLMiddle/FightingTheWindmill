package test.characters;

import test.Character;

public class SweetBreaker extends Character {
    public SweetBreaker(int remaining_hp) {
        super(0, 0, 0, 6, remaining_hp);
    }

    @Override
    public int default_atk() {
        return 0;
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
