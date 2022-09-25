package test.characters;

import test.Character;

public class Yuuki extends Character {
    public Yuuki(int remaining_hp,boolean isInEvenTurn) {
        super(0, 0, 0, 4, remaining_hp);

        //TODO Something is wrong.
        if(isInEvenTurn)
        {
            this.atk = 2;
            this.def = -1;
        }else
        {
            this.atk = -1;
            this.def = 2;
        }
    }

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
