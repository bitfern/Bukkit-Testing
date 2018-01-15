package net.kraften.bukkit.test01;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class EventListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){

        // Broadcast Playername
        Bukkit.broadcastMessage(ChatColor.AQUA + event.getPlayer().getDisplayName() + "Has just joined the game!");
        // Broadcast Number of online players
        if (Bukkit.getOnlinePlayers().size() > 10){

            Bukkit.broadcastMessage(ChatColor.GREEN + Integer.toString(Bukkit.getOnlinePlayers().size()) + ChatColor.AQUA + " / 10");
            Bukkit.broadcastMessage(ChatColor.AQUA + "Players are online");

        }

        else{

            Bukkit.broadcastMessage(ChatColor.RED + Integer.toString(Bukkit.getOnlinePlayers().size()) + ChatColor.AQUA + " / 10");
            Bukkit.broadcastMessage(ChatColor.AQUA + "Players are online");
            Bukkit.

        }


    }

}
