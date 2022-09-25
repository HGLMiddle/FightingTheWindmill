package test.characters;

import test.Character;

public class Tomato extends Character {
    public Tomato(int remaining_hp) {
        super(1, 0, 0, 3, remaining_hp);
    }

    @Override
    public int default_atk() {
        return 1;
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
        return 3;
    }
}
