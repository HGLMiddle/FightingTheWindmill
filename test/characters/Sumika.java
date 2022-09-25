package test.characters;

import test.Character;

public class Sumika extends Character {
    public Sumika(int remaining_hp) {
        super(1, -1, 1, 5, remaining_hp);
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
        return 1;
    }

    @Override
    public int default_hp() {
        return 5;
    }
}