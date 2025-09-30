package com.example.boardgame;

import java.util.ArrayList;
import java.util.List;

public class BoardGameCatalog {
    private List<BoardGame> games = new ArrayList<>();

    public void addGame(BoardGame game) {
        games.add(game);
    }

    public List<BoardGame> getAllGames() {
        return games;
    }

    public BoardGame findByName(String name) {
        return games.stream()
                .filter(g -> g.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }
}
