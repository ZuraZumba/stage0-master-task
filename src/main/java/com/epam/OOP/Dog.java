package com.epam.OOP;
import com.epam.OOP.Animal;
public class Dog extends Animal{
    public Dog(){
        super("brown", 4, true);
    }

    public String getDescription(){
        return super.getDescription();
    }


}
