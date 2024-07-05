package commandplugin.commandplugin.listeners;


import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;

public class ConnectionListener implements Listener {
        @EventHandler
        public void onJoin(PlayerJoinEvent event){
            Player player = event.getPlayer();
            event.setJoinMessage(ChatColor.GOLD + player.getName() + " Herzlich Willkommen auf unserem Server: Kalle's Plugin schenkt dir 1 Diamond");
            player.getInventory().addItem(new ItemStack(Material.DIAMOND));
        }
        @EventHandler
        public void onLeft (PlayerQuitEvent event){
        Player player = event.getPlayer();
        event.setQuitMessage(ChatColor.RED + player.getName() + " Bis bald auf unserem Server");
        }


}
