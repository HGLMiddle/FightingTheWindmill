package test.characters;

import test.Character;

public class Mio extends Character {
    public Mio( int remaining_hp) {
        super(0, -1, 1, 6, remaining_hp);
    }

    @Override
    public int default_atk() {
        return 0;
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
        return 6;
    }
}
