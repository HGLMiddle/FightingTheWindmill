package test.characters;

import test.Character;

import java.util.Random;

public class Tequila extends Character {
    public Tequila(int remaining_hp) {
        super(0, 1, -3, 5, remaining_hp);
    }

    //TODO Totally wrong logic.
   /* @Override
    public void takeDamage(int damage_value)
    {
        if(damage_value <= 0)
            return;
        this.present_hp -= damage_value;
        this.atk += damage_value;
        this.tempAtk += damage_value;
        if (this.present_hp<=0)
        {
            this.isAlive = false;
            this.present_hp = 0;
        }
    }*/

    @Override
    public int default_atk() {
        return 0;
    }

    @Override
    public int default_def() {
        return 1;
    }

    @Override
    public int default_evd() {
        return -3;
    }

    @Override
    public int default_hp() {
        return 5;
    }
}
