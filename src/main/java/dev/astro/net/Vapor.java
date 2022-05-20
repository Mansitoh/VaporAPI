package dev.astro.net;

import dev.astro.net.factions.FactionManager;
import dev.astro.net.nametags.NametagManager;
import dev.astro.net.timer.TimerManager;
import dev.astro.net.timer.type.sotw.SOTWHandler;
import org.bukkit.plugin.java.JavaPlugin;

public final class Vapor extends JavaPlugin {

    public static Vapor get(){
        throw new IllegalStateException("Vapor is not ready yet!");
    }

    public FactionManager getFactionManager(){
        throw new IllegalStateException("Vapor is not ready yet!");
    }

    public TimerManager getTimerManager(){
        throw new IllegalStateException("Vapor is not ready yet!");
    }

    public NametagManager getNametagManager(){
        throw new IllegalStateException("Vapor is not ready yet!");
    }

    public SOTWHandler getSotwHandler(){
        throw new IllegalStateException("Vapor is not ready yet!");
    }
}
