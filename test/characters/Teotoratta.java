package test.characters;

import test.Character;

public class Teotoratta extends Character {
    public Teotoratta(int remaining_hp) {
        super(0, 0, 1, 5, remaining_hp);
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
        return 1;
    }

    @Override
    public int default_hp() {
        return 5;
    }
}
