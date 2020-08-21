package jp.eximradar.keitan.time;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class Time extends JavaPlugin {

  @Override
  public void onEnable() {
    // Plugin startup logic
    getCommand("time").setExecutor(new TimeCommandExecutor(this));
    getLogger().info("プラグインが有効になったよ！");
  }

  @Override
  public void onDisable() {
    // Plugin shutdown logic
    getLogger().info("プラグインが無効になったよ！");
  }
}
