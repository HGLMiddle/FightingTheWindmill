package test.characters;

import test.Character;

public class Mei extends Character {
    private boolean redAndBlueFlag = false;

    public Mei(int remaining_hp,boolean hasRedAndBlue) {
        super(0, 0, 0, 4, remaining_hp);
    }

    //TODO 小红&小蓝效果

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
        return 4;
    }
}
