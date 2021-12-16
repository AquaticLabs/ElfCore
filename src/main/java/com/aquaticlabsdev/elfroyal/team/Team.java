package com.aquaticlabsdev.elfroyal.team;


import java.util.List;
import java.util.UUID;

public interface Team {

    String getName();
    String getColor();

    List<UUID> getMembers();


}
