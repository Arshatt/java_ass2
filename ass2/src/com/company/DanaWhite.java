package com.company;

import java.util.ArrayList;
import java.util.List;

public class DanaWhite implements Rankings {

    private List<String> rankings = new ArrayList<>();
    private List<UFC> fighters = new ArrayList<>();

    public void addRankings(String fighters) {
        this.rankings.add(fighters);
        notifyAllFighters();
    }

    public void removeRankings(String fighters) {
        this.rankings.remove(fighters);
        notifyAllFighters();
    }


    @Override
    public void registerFighter(UFC fighter) {

        this.fighters.add(fighter);
    }

    @Override
    public void unregisterFighter(UFC fighter) {

        this.fighters.remove(fighter);
    }
    @Override
    public void notifyAllFighters() {
        for(UFC fighter:fighters){
            fighter.update(this.rankings);
        }
    }
}
