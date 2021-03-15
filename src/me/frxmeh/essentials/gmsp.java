package me.frxmeh.essentials;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class gmsp implements CommandExecutor{

    @Override
    public boolean onCommand(CommandSender s, Command c, String label, String[] args) {
        Player p = (Player) s;
        if (p.hasPermission("frxmeh.gmsp")) {
            if (p.getGameMode() != GameMode.SPECTATOR) {
                p.setGameMode(GameMode.SPECTATOR);
                p.sendMessage("§bHai impostato la tua modalità di gioco su §fspettatore§b!");
            } else {
                p.sendMessage("§bSei già in modalità §fspettatore§b!");
            }
        } else {
            p.sendMessage("&cNon hai abbastanza permessi per eseguire questo comando.");
        }
        return false;
    }
}
