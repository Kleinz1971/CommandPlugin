package commandplugin.commandplugin;

import commandplugin.commandplugin.commands.*;
import commandplugin.commandplugin.listeners.ConnectionListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class CommandPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        //getCommand("do").setExecutor(new BasicCommands());
        getCommand("doexp").setExecutor(new ExperimentalCommands());



    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
