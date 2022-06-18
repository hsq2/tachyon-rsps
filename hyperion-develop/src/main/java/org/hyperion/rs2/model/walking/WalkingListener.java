package org.hyperion.rs2.model.walking;

import org.hyperion.rs2.model.Player;

public class WalkingListener {

    private final Player player;

    public WalkingListener(Player player) {
        this.player = player;
    }

    public void runEnergyChanged(int runEnergy) {
        player.getActionSender().sendRunEnergy(runEnergy);
    }
}
