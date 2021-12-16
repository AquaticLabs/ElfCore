package com.aquaticlabsdev.elfroyal.team;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

/**
 * @Author: extremesnow
 * On: 12/15/2021
 * At: 19:48
 */
@Getter @Setter
public abstract class ElfTeam implements Team{

    private String name;
    private List<UUID> members;
    private String color; // Stick to colors that you can convert in the scoreboards


    public ElfTeam() {
    }

}
