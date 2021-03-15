package me.frxmeh.essentials;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class gms implements CommandExecutor{

    @Override
    public boolean onCommand(CommandSender s, Command c, String label, String[] args) {
        Player p = (Player) s;
        if (p.hasPermission("frxmeh.gms")) {
            if (p.getGameMode() != GameMode.SURVIVAL) {
                p.setGameMode(GameMode.SURVIVAL);
                p.sendMessage("§bHai impostato la tua modalità di gioco su §fsopravvivenza§b!");
            } else {
                p.sendMessage("§bSei già in modalità §fsopravvivenza§b!");
            }
        } else {
            p.sendMessage("&cNon hai abbastanza permessi per eseguire questo comando.");
        }
        return false;
    }
}
