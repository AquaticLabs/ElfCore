package com.aquaticlabsdev.elfroyal.game;

import org.bukkit.entity.Player;

/**
 * @Author: extremesnow
 * On: 12/12/2021
 * At: 00:05
 */
public interface Game {


    void activate();

    void startPregameCountdown();

    void start();

    GameState getState();

    String type();

    void stop();

    void finish();

    void broadcastGameMessage(String string);

    void playerAbandon(Player player);



}
