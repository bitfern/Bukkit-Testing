package net.kraften.bukkit.test01;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Bukkit;

public class Main extends JavaPlugin {
    
    @Override
    public void onEnable(){
        //Fired when the server enables the plugin

        System.out.println("[Kraften-Testing] Starting");
        getServer().getPluginManager().registerEvents(new EventListener(), this);


    }

    @Override
    public void onDisable(){
        //Run on server shutdown
        System.out.println("[Kraften-Testing] Stopping processes");


    }

}