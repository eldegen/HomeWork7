package com.company;

public class Main {
    public static void main(String[] args) {
        Magic magic = new Magic();
        Medic medic = new Medic();
        Warrior warrior = new Warrior();

        Hero[] heroes = {magic, medic, warrior};
        System.out.println(heroes[0].applySuperAbility("Enemy stasis"));
        System.out.println(heroes[1].applySuperAbility("Heal"));
        System.out.println(heroes[2].applySuperAbility("Critical damage"));
    }
}
