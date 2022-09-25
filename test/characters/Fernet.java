package test.characters;

import test.Character;

public class Fernet extends Character {
    public Fernet(int remaining_hp) {
        super(-1, 2, -2, 6, remaining_hp);
    }

    @Override
    public int default_atk() {
        return -1;
    }

    @Override
    public int default_def() {
        return 2;
    }

    @Override
    public int default_evd() {
        return -2;
    }

    @Override
    public int default_hp() {
        return 6;
    }
}
