package com.aquaticlabsdev.elfroyal.loc;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

/**
 * @author Trevor/extremesnow
 * @since 9/7/2020 at 10:00 PM
 */

public class Selection {

    private World world;
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private int z1;
    private int z2;

    public Selection(final Location location1, final Location location2) {
        world = location1.getWorld();
        x1 = location1.getBlockX();
        y1 = location1.getBlockY();
        z1 = location1.getBlockZ();
        x2 = location2.getBlockX();
        y2 = location2.getBlockY();
        z2 = location2.getBlockZ();
        sortCords();
    }

    public boolean contains(final Location location) {
        return this.x1 <= location.getX() && location.getX() <= this.x2 && this.y1 <= location.getY() && location.getY() <= this.y2 && this.z1 <= location.getZ() && location.getZ() <= this.z2;
    }

    public boolean contains(final Player player) {
        final Location location = player.getLocation();
        return this.x1 <= location.getX() && location.getX() <= this.x2 && this.y1 <= location.getY() && location.getY() <= this.y2 && this.z1 <= location.getZ() && location.getZ() <= this.z2;
    }

    public int blockCount() {
        int count = 0;
        for (int x = x1; x <= x2; x++) {
            for (int y = y1; y <= y2; y++) {
                for (int z = z1; z <=  z2; z++) {
                    count++;
                }
            }
        }
        return count;
    }

    private void sortCords() {
        if (this.x1 > this.x2) {
            final int temp = this.x1;
            this.x1 = this.x2;
            this.x2 = temp;
        }
        if (this.y1 > this.y2) {
            final int temp = this.y1;
            this.y1 = this.y2;
            this.y2 = temp;
        }
        if (this.z1 > this.z2) {
            final int temp = this.z1;
            this.z1 = this.z2;
            this.z2 = temp;
        }
    }

    public int getX1() {
        return x1;
    }

    public int getX2() {
        return x2;
    }

    public int getY1() {
        return y1;
    }

    public int getY2() {
        return y2;
    }

    public int getZ1() {
        return z1;
    }

    public int getZ2() {
        return z2;
    }

    public World getWorld() {
        return world;
    }
}
