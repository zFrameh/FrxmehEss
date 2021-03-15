package me.frxmeh.essentials;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class enable extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getLogger().info("FrxmehGMC abilitato con successo!");
        getCommand("gmc").setExecutor(new gmc());
        getCommand("gms").setExecutor(new gms());
        getCommand("gmsp").setExecutor(new gmsp());
        getCommand("gmadv").setExecutor(new gmadv());
        getCommand("fly").setExecutor(new flycommand()); }

    @EventHandler
    public void OnChat(AsyncPlayerChatEvent event) {
        event.setFormat(ChatColor.WHITE + "%s" + ChatColor.DARK_GRAY + " » " + ChatColor.GRAY + "%s");
    }
}
