package kr.junhojang125.mavensample.plugin;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class MavenSamplePlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getLogger().info("Maven Sample Plugin Enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Maven Sample Plugin Disabled!");
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        MiniMessage.miniMessage().deserialize("<rainbow>Welcome to the server!, ");
        event.joinMessage(Component.text(MiniMessage.miniMessage().deserialize("<rainbow>Welcome to the server!, ") + event.getPlayer().getName()));
    }
}
