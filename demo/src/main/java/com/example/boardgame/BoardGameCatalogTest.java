package com.example.boardgame;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BoardGameCatalogTest {

    @Test
    void testAddAndFindGame() {
        BoardGameCatalog catalog = new BoardGameCatalog();
        BoardGame catan = new BoardGame("Catan", 3, 4);
        catalog.addGame(catan);

        assertEquals(catan, catalog.findByName("Catan"));
    }

    @Test
    void testFindNonExistingGame() {
        BoardGameCatalog catalog = new BoardGameCatalog();
        assertNull(catalog.findByName("Monopoly"));
    }
}
