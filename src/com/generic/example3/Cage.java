package com.generic.example3;

public abstract class Cage<T extends Animal & Comparable<Object>> {
    abstract void addAnimal(T animal);
}