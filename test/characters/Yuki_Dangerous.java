package test.characters;

import test.Character;

public class Yuki_Dangerous extends Character {
    public Yuki_Dangerous(int remaining_hp) {
        super(1, 0, -1, 5, remaining_hp);
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
        return -1;
    }

    @Override
    public int default_hp() {
        return 5;
    }
}
