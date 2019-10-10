package pt.intellijente.deepchat;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    static Main main;
    private PluginDescriptionFile pdf = this.getDescription();

    @Override
    public void onLoad() {
        getServer().getConsoleSender().sendMessage("§6##########################################");
        getServer().getConsoleSender().sendMessage("§7- §eDeepChatCommands " + pdf.getVersion() + " by " + pdf.getAuthors());
        getServer().getConsoleSender().sendMessage("");
        getServer().getConsoleSender().sendMessage("§7- §eLoading events...");
        getServer().getConsoleSender().sendMessage("§6##########################################");
    }

    @Override
    public void onEnable() {
        main = this;
        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new Command(), this);
        getServer().getConsoleSender().sendMessage("§6##########################################");
        getServer().getConsoleSender().sendMessage("§7- §eDeepChatCommands " + pdf.getVersion() + " by " + pdf.getAuthors());
        getServer().getConsoleSender().sendMessage("");
        getServer().getConsoleSender().sendMessage("§7- §aEvents loaded with success");
        getServer().getConsoleSender().sendMessage("§6##########################################");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage("§6##########################################");
        getServer().getConsoleSender().sendMessage("§7- §eDeepChatCommands " + pdf.getVersion() + " by " + pdf.getAuthors());
        getServer().getConsoleSender().sendMessage("");
        getServer().getConsoleSender().sendMessage("§7- §cPlugin Disabled");
        getServer().getConsoleSender().sendMessage("§6##########################################");
    }
}
