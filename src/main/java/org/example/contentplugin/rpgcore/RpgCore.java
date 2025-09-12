package org.example.contentplugin.rpgcore;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.example.contentplugin.rpgcore.damage.data.Manage;

import java.sql.Connection;
import java.sql.DriverManager;

public final class RpgCore extends JavaPlugin {
    private Connection connection;
    private static RpgCore plugin;
    private Manage manage;
    @Override
    public void onEnable() {
        plugin = this;
        String url = "jdbc:mysql://localhost/3300/rpg_server";
        String user = "root";
        String password = "guswns041115!";
        try{
            connection = DriverManager.getConnection(url, user, password);
        }
        catch (Exception e){
            Bukkit.getPluginManager().disablePlugin(this);
        }



        manage = new Manage();
        //TODO: add remaining actions. such as event manager that makes skill run, or damage manager to search damage
    }

    public static RpgCore getPlugin(){
        return plugin;
    }

    public Connection getConnection(){
        return connection;
    }

    public Manage getManage(){
        return manage;
    }

    @Override
    public void onDisable() {
        try{
            connection.close();
        }
        catch (Exception e){

        }
    }
}
