package com.aquaticlabsdev.elfroyal.game;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @Author: extremesnow
 * On: 12/12/2021
 * At: 00:04
 */
@Getter @Setter
public abstract class ElfGame implements Game {

    public String gameID;
    private GameState state = GameState.PREGAME;
    private Map<UUID, Player> playersToPlay = new HashMap<>();
    private Map<String, GameMap> maps;


    public ElfGame(String gameID) {
        this.gameID = gameID;
    }




}
