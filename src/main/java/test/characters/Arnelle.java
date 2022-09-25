package test.characters;

import test.Character;

public class Arnelle extends Character {
    public Arnelle(int remaining_hp) {
        super(1, -1, 0, 5, remaining_hp);
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
        return 0;
    }

    @Override
    public int default_hp() {
        return 5;
    }
}
