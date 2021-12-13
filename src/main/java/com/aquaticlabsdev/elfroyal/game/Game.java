package com.aquaticlabsdev.elfroyal.game;

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

    void stop();

    void finish();



}
