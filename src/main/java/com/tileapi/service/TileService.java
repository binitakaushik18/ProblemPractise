package com.tileapi.service;

import com.tileapi.entity.Tile;

import java.time.LocalDateTime;

/**
 * Created by binita on 09/03/15.
 */
public interface TileService {
    void saveTile(Tile tile, LocalDateTime time, int position, String clientId);
}
