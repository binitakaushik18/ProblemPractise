package com.tileapi.dao;

import com.tileapi.entity.Tile;

import java.time.LocalDateTime;

/**
 * Created by binita on 09/03/15.
 */
public interface TileDao {
    Tile getTileAt(LocalDateTime time, int position, String clientId);
    Tile getTileAfter(LocalDateTime time, int position, String clientId);
    Tile getTileBefore(LocalDateTime time, int position, String clientId);
    void saveTile(Tile tile, LocalDateTime time, int position, String clientId);
}


