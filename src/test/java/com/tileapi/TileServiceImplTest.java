package com.tileapi;

import com.tileapi.dao.TileDao;
import com.tileapi.entity.Tile;
import com.tileapi.service.TileService;
import com.tileapi.service.TileServiceImpl;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by binita on 09/03/15.
 */
public class TileServiceImplTest {
    TileService tileService = null;
    TileDao mockTileDao = null;
    public static final String CLIENTID = "STB";
    public static final LocalDateTime FEB_DATE = LocalDateTime.of(2015, 03, 8, 00, 00, 00);
    public static final LocalDateTime INFINITE_DATE = LocalDateTime.of(2100, 01, 01, 00, 00, 00);

    @Before
    public void setUp() throws Exception {
        mockTileDao = mock(TileDao.class);
        tileService = new TileServiceImpl(mockTileDao);
    }


    @Test
    public void testSaveTileForScenario1() throws Exception {
        when(mockTileDao.getTileAt(LocalDateTime.now(), 4, CLIENTID)).thenReturn(null);
        when(mockTileDao.getTileBefore(LocalDateTime.now(), 4, CLIENTID)).thenReturn(new Tile("Planner", 3, FEB_DATE, INFINITE_DATE));
        when(mockTileDao.getTileAfter(LocalDateTime.now(), 4, CLIENTID)).thenReturn(null);

        Tile validTile = new Tile("Easter special", 4);
        validTile.setEndDate(INFINITE_DATE);

        doNothing().when(mockTileDao).saveTile(validTile,FEB_DATE,4,CLIENTID);
        tileService.saveTile(validTile, FEB_DATE, 4, CLIENTID);
        Tile tile = mockTileDao.getTileBefore(LocalDateTime.now(), 4, CLIENTID);

        doNothing().when(mockTileDao).saveTile(tile, FEB_DATE, 3, CLIENTID);
        tileService.saveTile(tile, FEB_DATE, 3, CLIENTID);
    }
/*
    @Test
    public void testSaveTileForInvalidScenario() throws Exception {


    }*/
}
