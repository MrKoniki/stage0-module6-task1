package com.epam.mjc.stage0;

public class Bird extends Animal {
    public Bird() {
        super("blue",2,false);
    }
    @Override
    public String getDescription() {
        return "This animal is mostly " + super.getColor() + ". It has " + (super.getNumberOfPaws() > 1 ? super.getNumberOfPaws() + " paws" : super.getNumberOfPaws() + " paw")  + " and " + (super.getHasFur() ? "a" : "no") +" fur. Moreover, it has 2 wings and can fly.";
    }

}
