package test.characters;

import test.Character;

public class Cook extends Character
{
    private boolean isHungry = false;
    public Cook(int remaining_hp)
    {
        super(0, -1, 3, 4, remaining_hp);
    }

    //TODO 设置好饥饿效果-1EVD

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
        return 3;
    }

    @Override
    public int default_hp() {
        return 4;
    }
}
