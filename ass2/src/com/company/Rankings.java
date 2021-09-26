package com.company;

public interface Rankings {
    void registerFighter(UFC fighter);
    void unregisterFighter(UFC fighter);
    void notifyAllFighters();
}
