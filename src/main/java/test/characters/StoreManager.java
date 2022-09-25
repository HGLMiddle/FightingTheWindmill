package test.characters;

import test.Character;

public class StoreManager extends Character {
    public StoreManager(int remaining_hp) {
        super(2, 0, -1, 6, remaining_hp);
    }

    @Override
    public int default_atk() {
        return 2;
    }

    @Override
    public int default_def() {
        return 0;
    }

    @Override
    public int default_evd() {
        return -1;
    }

    @Override
    public int default_hp() {
        return 6;
    }
}
