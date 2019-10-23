/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseball;

/**
 *
 * @author Wilso
 */public class BaseballSet  {
    
    private String name;
    private String team;
    private int atBats;
    private int hits;

    //default constructor
    public BaseballSet() {
        this.name = "";
        this.team = "";
        this.atBats = 0;
        this.hits = 0;
    }

    public BaseballSet(String name, String team, int atBats, int hits) {
        this.name = name;
        this.team = team;
        this.atBats = atBats;
        this.hits = hits;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBird() {
        return bird;
    }

    public void setBird(String bird) {
        this.bird = bird;
    }

    public String getFlower() {
        return flower;
    }

    public void setFlower(String flower) {
        this.flower = flower;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
}
