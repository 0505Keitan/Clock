package com.keitan.first;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public final class First extends JavaPlugin {

  @Override
  public void onEnable() {
    // Plugin startup logic
    getLogger().info("プラグインが有効になったよ！");
  }

  @Override
  public void onDisable() {
    // Plugin shutdown logic
    getLogger().info("プラグインが無効になったよ！");
  }

  @Override
  public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
    if(cmd.getName().equalsIgnoreCase("ping")){
      sender.sendMessage("pong");
      return true;
    }else if(cmd.getName().equalsIgnoreCase("time")){
      Date date=new Date();
      DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm");
      String formattedDate=dateFormat.format(date);
      sender.sendMessage(formattedDate);
      return true;
    }
    return false;
  }
}
