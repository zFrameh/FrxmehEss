package me.frxmeh.essentials;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class gmc implements CommandExecutor{

    @Override
    public boolean onCommand(CommandSender s, Command c, String label, String[] args) {
        Player p = (Player) s;
        if (p.hasPermission("frxmeh.gmc")) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                p.setGameMode(GameMode.CREATIVE);
                p.sendMessage("§bHai impostato la tua modalità di gioco su §fcreativa§b!");
            } else {
                p.sendMessage("§bSei già in modalità §fcreativa§b!");
            }
        } else {
            p.sendMessage("&cNon hai abbastanza permessi per eseguire questo comando.");
        }
        return false;
    }
}
