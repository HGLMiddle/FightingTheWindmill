package test.characters;

import test.Character;

public class QP extends Character {
    public QP(int remaining_hp) {
        super(0, 0, 0, 5, remaining_hp);
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
        return 5;
    }
}
