package test.characters;

import test.Character;

public class Kiriko extends Character {
    public Kiriko(int remaining_hp) {
        super(0, -1, 0, 8, remaining_hp);
    }

    //TODO 用卡掉血效果

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
        return 0;
    }

    @Override
    public int default_hp() {
        return 8;
    }
}
