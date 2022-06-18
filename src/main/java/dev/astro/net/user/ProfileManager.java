package dev.astro.net.user;

import java.io.IOException;
import java.util.Set;
import java.util.UUID;

/**
 * Created by Risas
 * Project: VaporAPI
 * Date: 18-06-2022
 * Twitter: @RisasDev
 * GitHub: https://github.com/RisasDev
 */

public interface ProfileManager {

    void load();

    void save(UUID var1) throws IOException;

    Profile getByUuid(UUID var1);

    Profile getByName(String var1);

    Set getOfflinePlayers();
}
