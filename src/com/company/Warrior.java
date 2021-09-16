package com.company;

public class Warrior extends Hero{
    @Override
    public String applySuperAbility(String superAbilityType) {
        super.ability = superAbilityType;
        return "Warrior used ability: " + ability;
    }
}
