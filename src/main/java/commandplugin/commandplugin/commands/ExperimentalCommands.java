package commandplugin.commandplugin.commands;

import commandplugin.commandplugin.CommandPlugin;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import static org.bukkit.Bukkit.getServer;

public class ExperimentalCommands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
         //code area exp
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "Du musst ein Spieler sein!!");
            return false;
        }//SpielerAbfrage ende
        Player player = (Player) sender;
        if (args.length == 1) {
            if (args[0].equalsIgnoreCase("tele")) {
                player.sendMessage(ChatColor.GREEN + player.getName() + " Festhalten es geht los.");
                String testworld = "NeueWelt";
                double x1 = 200;
                double y1 = 200;
                double z1 = 200;
                Location location = new Location(Bukkit.getWorld(testworld), x1, y1, z1);
                ((Player) sender).teleport(location);

            }

        }
        if (args.length == 1) {
            if (args[0].equalsIgnoreCase("diamond")) {
                player.sendMessage(ChatColor.GREEN + player.getName() + " Lass uns suchen.");
                String ore = "Zauberwelt";
                Location location = new Location(Bukkit.getWorld(ore),100,100,100);
                ((Player) sender).teleport(location);


            }

        }
        return false;
    }
}
