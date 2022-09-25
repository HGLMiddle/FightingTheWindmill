package test.characters;

import test.Character;

public class Tshi extends Character {
    public Tshi(int remaining_hp) {
        super(0, -1, 2, 4, remaining_hp);
    }

    //TODO GiftCard

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
        return 2;
    }

    @Override
    public int default_hp() {
        return 4;
    }
}
