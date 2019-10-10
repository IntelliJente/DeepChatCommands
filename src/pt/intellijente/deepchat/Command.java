package pt.intellijente.deepchat;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class Command implements Listener {

    @EventHandler
    public void onChat(PlayerCommandPreprocessEvent event) {
        for (String key : Main.main.getConfig().getConfigurationSection("Commands").getKeys(false)) {
            if (event.getMessage().equalsIgnoreCase(Main.main.getConfig().getString("Commands."+key+".command"))) {
                event.setCancelled(true);
                for (String msg : Main.main.getConfig().getStringList("Commands."+key+".message")) {
                    event.getPlayer().sendMessage(msg.replaceAll("&", "§"));
                }
            }
        }
    }

}
