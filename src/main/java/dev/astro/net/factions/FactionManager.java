package dev.astro.net.factions;

import dev.astro.net.factions.type.Faction;
import dev.astro.net.factions.type.PlayerFaction;
import org.bukkit.Location;
import org.bukkit.entity.Player;

/**
 * Created by Mansitoh
 * Project: VaporAPI Date: 20/05/2022 @ 15:55
 * Twitter: @Mansitoh_PY Github: https://github.com/Mansitoh
 * Discord: discord.skilled-dev.club
 * Website: skilled-dev.club
 * CEO: Skilled | Development
 */
public interface FactionManager {

    Faction getFactionAt(Location location);

    PlayerFaction getPlayerFaction(Player player);
}
