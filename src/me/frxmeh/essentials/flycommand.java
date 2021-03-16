package me.frxmeh.essentials;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class flycommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("frxmeh.fly")) {
                if (!player.getAllowFlight()) {
                    player.setAllowFlight(true);
                    player.sendMessage("§bHai §fabilitato il volo");
                } else {
                    player.setAllowFlight(false);
                    player.sendMessage("§bHai §fdisabilitato il volo");
                }
            } else {
                player.sendMessage("&cNon hai abbastanza permessi per eseguire questo comando.");
            }
        }
        return false;
    }
}
