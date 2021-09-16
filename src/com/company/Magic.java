package com.company;

public class Magic extends Hero{

    @Override
    public String applySuperAbility(String superAbilityType) {
        super.ability = superAbilityType;
        return "Magic used ability: " + ability;
    }
}
