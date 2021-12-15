package com.aquaticlabsdev.elfroyal.game;

import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @Author: extremesnow
 * On: 12/13/2021
 * At: 12:46
 */
@Getter @Setter
public class GamePlacements {


    private Map<UUID, Integer> placementMap = new LinkedHashMap<>();
    private Map<Integer, UUID> byValueMap = new LinkedHashMap<>();

    public GamePlacements() {}

    public void addPlacement(UUID uuid, int placement) {
        placementMap.put(uuid, placement);
        byValueMap.put(placement, uuid);
    }

    public int getPlacement(UUID uuid) {
        return placementMap.get(uuid);
    }

    public UUID getByPlacement(int placement) {
        UUID uuid = byValueMap.get(placement);
        return uuid;
    }

}
