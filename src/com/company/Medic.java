package com.company;

public class Medic extends Hero{
    @Override
    public String applySuperAbility(String superAbilityType) {
        super.ability = superAbilityType;
        return "Medic used ability: " + ability;
    }
}
