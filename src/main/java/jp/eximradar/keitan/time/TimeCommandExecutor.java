package jp.eximradar.keitan.time;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class TimeCommandExecutor implements CommandExecutor {
  private final Time time;
  public TimeCommandExecutor(Time time) {
    this.time = time;
  }

  @Override
  public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
    if(cmd.getName().equalsIgnoreCase("ping")){
      sender.sendMessage("pong");
      return true;
    }else if(cmd.getName().equalsIgnoreCase("time")){
      Date date=new Date();
      DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
      String formattedDate=dateFormat.format(date);
      sender.sendMessage("現在時刻は" + formattedDate + "です！");
      return true;
    }
    return false;
  }
}