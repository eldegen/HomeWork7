package com.company;

public class Main {
    public static void main(String[] args) {
        Magic magic = new Magic();
        Medic medic = new Medic();
        Warrior warrior = new Warrior();

        Hero[] heroes = {magic, medic, warrior};
        String[] heroesAbility = {"Enemy stasis" , "Heal", "Critical damage"};

        /*System.out.println(heroes[0].applySuperAbility("Enemy stasis"));
        System.out.println(heroes[1].applySuperAbility("Heal"));
        System.out.println(heroes[2].applySuperAbility("Critical damage"));*/

        for (int i = 0; i < 3; i++) {
            System.out.println(heroes[i].applySuperAbility(heroesAbility[i]));
        }
    }
}
