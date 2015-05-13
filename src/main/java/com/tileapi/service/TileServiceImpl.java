package com.tileapi.service;

import com.tileapi.dao.TileDao;
import com.tileapi.entity.Tile;

import java.time.LocalDateTime;

/**
 * Created by binita on 09/03/15.
 */
public class TileServiceImpl implements TileService {
    public TileServiceImpl(TileDao tileDao) {
        this.tileDao = tileDao;
    }

    TileDao tileDao;
    public static final LocalDateTime INFINITE_DATE = LocalDateTime.of(2100,01,01,00,00,00);

    @Override
    public void saveTile(Tile tile, LocalDateTime time, int position, String clientId) {
        //test scenario1
        Tile tileAt = tileDao.getTileAt(time,position,clientId);
        Tile tileBefore = tileDao.getTileBefore(time,position,clientId);
        Tile tileLater = tileDao.getTileAfter(time,position,clientId);
        Tile newTile = new Tile("TV Guide",2);

        if(tileLater ==null)
        {
            //do something
        }

        if(tileAt == null){
            newTile.setPosition(position);
            newTile.setEndDate(INFINITE_DATE);
        }

        if(tileBefore != null){
            tileBefore.setEndDate(newTile.getStartDate());
        }

        tileDao.saveTile(tile,time,position,clientId);
//        tileDao.saveTile(tileBefore,tileBefore.getStartDate(),tileBefore.getPosition(),clientId);



    }
}
