package test.characters;

import test.Card;
import test.Character;

import java.util.List;

public class QPD extends Character
{
    private int puddingA = 0;
    private int puddingB = 0;
    private int puddingC = 0;

    public QPD(int remaining_hp) {
        super(0, 0, 0, 5, remaining_hp);
    }

    //TODO 布丁守护者

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
