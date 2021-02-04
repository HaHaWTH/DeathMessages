package net.joshb.deathmessages.listener;

import net.joshb.deathmessages.api.PlayerManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByBlockEvent;

public class EntityDamageByBlock implements Listener {


    @EventHandler
    public void onEntityDeath(EntityDamageByBlockEvent e) {
        if (e.getEntity() instanceof Player) {
            Player p = (Player) e.getEntity();
            PlayerManager pm = PlayerManager.getPlayer(p);
            pm.setLastDamageCause(e.getCause());
        }
    }

}
