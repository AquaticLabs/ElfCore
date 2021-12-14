package com.aquaticlabsdev.elfroyal.timer;

import com.aquaticlabsdev.elfroyal.ElfRoyalPlugin;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitTask;

/**
 * @Author: extremesnow
 * On: 12/12/2021
 * At: 00:08
 */
public abstract class GameTimer implements Timer {


    private final ElfRoyalPlugin plugin;
    @Getter
    public BukkitTask timerTask;
    public boolean async = true;

    public final int topTime;
    public int time = 0;
    public final TimeTickType timeTickType;

    public GameTimer(ElfRoyalPlugin plugin, int time, TimeTickType timeTickType, boolean async) {
        this.plugin = plugin;
        this.topTime = time;
        this.async = async;
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
                    if (!async) {
                        Bukkit.getScheduler().runTask(plugin, this::whenComplete);
                        return;
                    }
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
