package com.emerald.thunder;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.Bukkit;
import org.bukkit.World;

// All nuetral mobs
import org.bukkit.entity.Enderman;
import org.bukkit.entity.PolarBear;
import org.bukkit.entity.PigZombie;
import org.bukkit.entity.CaveSpider;
import org.bukkit.entity.Dolphin;
import org.bukkit.entity.Goat;
import org.bukkit.entity.Bee;
import org.bukkit.entity.IronGolem;
import org.bukkit.entity.Llama;
import org.bukkit.entity.Panda;
import org.bukkit.entity.Piglin;
import org.bukkit.entity.Spider;
import org.bukkit.entity.Wolf;

public class NuetralHostility extends JavaPlugin {
    @Override
    public void onEnable() {
        // Start game loop
        getServer().getScheduler().scheduleSyncRepeatingTask(
                this,
                new Runnable() {
                    public void run() {
                        updateEntities();
                    }
                },
                0L,
                1L);
    }

    public void updateEntities() {
        for (World world : Bukkit.getWorlds()) {
            for (Entity entity : world.getEntities()) {
                if (entity instanceof Enderman) {

                    Enderman enderman = (Enderman) entity;
                    enderman.setTarget(getClosestPlayer(enderman));

                } else if (entity instanceof PolarBear) {

                    PolarBear bear = (PolarBear) entity;
                    bear.setTarget(getClosestPlayer(bear));

                } else if (entity instanceof PigZombie) {

                    PigZombie zombie = (PigZombie) entity;
                    zombie.setTarget(getClosestPlayer(zombie));

                } else if (entity instanceof Bee) {

                    Bee bee = (Bee) entity;
                    bee.setTarget(getClosestPlayer(bee));

                } else if (entity instanceof CaveSpider) {

                    CaveSpider spider = (CaveSpider) entity;
                    spider.setTarget(getClosestPlayer(spider));

                } else if (entity instanceof Dolphin) {

                    Dolphin dolphin = (Dolphin) entity;
                    dolphin.setTarget(getClosestPlayer(dolphin));

                } else if (entity instanceof Goat) {

                    Goat goat = (Goat) entity;
                    goat.setTarget(getClosestPlayer(goat));

                } else if (entity instanceof IronGolem) {

                    IronGolem golem = (IronGolem) entity;
                    golem.setTarget(getClosestPlayer(golem));

                } else if (entity instanceof Llama) {

                    Llama llama = (Llama) entity;
                    llama.setTarget(getClosestPlayer(llama));

                } else if (entity instanceof Panda) {

                    Panda panda = (Panda) entity;
                    panda.setTarget(getClosestPlayer(panda));

                } else if (entity instanceof Piglin) {
                    

                    Piglin piglin = (Piglin) entity;
                    piglin.setTarget(getClosestPlayer(piglin));

                } else if (entity instanceof Spider) {

                    Spider spider = (Spider) entity;
                    spider.setTarget(getClosestPlayer(spider));

                } else if (entity instanceof Wolf) {

                    Wolf wolf = (Wolf) entity;
                    wolf.setTarget(getClosestPlayer(wolf));

                }
            }
        }
    }

    public Player getClosestPlayer(Entity e) {
        Player closestPlayer = null;

        for (Player player : getServer().getOnlinePlayers()) {
            if (closestPlayer == null) {
                closestPlayer = player;
            } else {
                if (player.getLocation().distance(e.getLocation()) < closestPlayer.getLocation()
                        .distance(e.getLocation())) {
                    closestPlayer = player;
                }
            }
        }

        return closestPlayer;
    }
}
