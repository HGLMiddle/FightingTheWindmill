package test.characters;

import test.Character;

public class Natsumi extends Character {
    public Natsumi(int remaining_hp) {
        super(-1, 0, 0, 5, remaining_hp);
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
        return 0;
    }

    @Override
    public int default_hp() {
        return 5;
    }
}
