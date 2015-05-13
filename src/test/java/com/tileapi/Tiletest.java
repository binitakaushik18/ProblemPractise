package com.tileapi;

import com.tileapi.entity.Tile;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created by binita on 09/03/15.
 */
public class Tiletest {

    @Test(expected = IllegalArgumentException.class)
    public void testTileWithInvalidLabel() throws Exception {
        new Tile("$dshfg",6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTileWithInvalidPosition() throws Exception {
        new Tile("Tile",10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTileWithBlankLabel() throws Exception {
        new Tile("",4);

    }

    @Test
    public void testValidTile() throws Exception {
        Tile tile = new Tile("Tile",4);
        assertEquals("Should call tile equals method and validate that tile is created", tile, new Tile("Tile",4));

    }
}
