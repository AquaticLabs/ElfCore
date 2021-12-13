package com.aquaticlabsdev.elfroyal.timer;

import com.aquaticlabsdev.elfroyal.ElfRoyalPlugin;
import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitTask;

/**
 * @Author: extremesnow
 * On: 12/12/2021
 * At: 00:08
 */
public abstract class ObjectTimer implements Timer {


    private final ElfRoyalPlugin plugin;
    @Getter
    private BukkitTask timerTask;

    private final int topTime;
    @Getter
    private int time = 0;
    private final TimeTickType timeTickType;

    public ObjectTimer(ElfRoyalPlugin plugin, int time, TimeTickType timeTickType) {
        this.plugin = plugin;
        this.topTime = time;
        if (timeTickType == TimeTickType.DOWN) {
            this.time = time;
        }
        this.timeTickType = timeTickType;
    }

    @Override
    public void start() {

        timerTask = Bukkit.getScheduler().runTaskTimerAsynchronously(plugin, () -> {

            if (timeTickType == TimeTickType.UP) {

                if (time >= topTime) {
                    stop();
                    whenComplete();
                    return;
                }

                time++;
            } else {
                if (time <= 0) {
                    stop();
                    whenComplete();
                    return;
                }
                time--;
            }
        }, 0, 20);
    }

    @Override
    public void stop() {
        this.timerTask.cancel();
    }


    public abstract void whenComplete();




}
