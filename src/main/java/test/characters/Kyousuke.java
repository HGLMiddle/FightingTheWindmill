package test.characters;

import test.Character;

public class Kyousuke extends Character {
    private boolean isCastOff = false;

    public Kyousuke(int remaining_hp) {
        super(-1, 2, 0, 5, remaining_hp);
    }

    //TODO 脱衣效果

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
        return 0;
    }

    @Override
    public int default_hp() {
        return 5;
    }
}
