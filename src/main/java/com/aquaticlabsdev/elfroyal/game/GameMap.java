package com.aquaticlabsdev.elfroyal.game;

import com.aquaticlabsdev.elfroyal.loc.LocationType;
import com.aquaticlabsdev.elfroyal.loc.Selection;
import com.aquaticlabsdev.elfroyal.util.DataPair;
import org.bukkit.Location;

import java.util.List;
import java.util.Map;

/**
 * @Author: extremesnow
 * On: 12/12/2021
 * At: 20:57
 */
public interface GameMap {

    String getMapName();

    void save();

    void load();

    Selection getMapBounds();

    Map<LocationType, List<Location>> getLocationList();

}
