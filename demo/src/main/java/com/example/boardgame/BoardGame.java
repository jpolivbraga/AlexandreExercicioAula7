package com.example.boardgame;

public class BoardGame {
    private String name;
    private int minPlayers;
    private int maxPlayers;

    public BoardGame(String name, int minPlayers, int maxPlayers) {
        this.name = name;
        this.minPlayers = minPlayers;
        this.maxPlayers = maxPlayers;
    }

    public String getName() {
        return name;
    }

    public int getMinPlayers() {
        return minPlayers;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    @Override
    public String toString() {
        return name + " (" + minPlayers + "-" + maxPlayers + " jogadores)";
    }
}
