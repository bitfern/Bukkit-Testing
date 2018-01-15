package net.kraften.bukkit.test01;

import org.bukkit.plugin.java.JavaPlugin;

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



    }

}