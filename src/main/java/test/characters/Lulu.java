package test.characters;

import test.Character;

public class Lulu extends Character {
    private boolean isLunchActived = false;

    public Lulu(int remaining_hp) {
        super(0, 1, -1, 5, remaining_hp);
    }

    //TODO 午餐效果

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
        return 0;
    }

    @Override
    public int default_hp() {
        return 0;
    }
}
