package com.example.boardgame;

public class Main {
    public static void main(String[] args) {
        BoardGameCatalog catalog = new BoardGameCatalog();
        catalog.addGame(new BoardGame("Catan", 3, 4));
        catalog.addGame(new BoardGame("Azul", 2, 4));

        System.out.println("Jogos no catálogo:");
        catalog.getAllGames().forEach(System.out::println);
    }
}
