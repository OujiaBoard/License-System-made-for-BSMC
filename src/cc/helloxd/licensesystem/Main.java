package cc.helloxd.licensesystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;

import org.bukkit.Bukkit;

public class Main {
	private static void AntiPiracy() {
        	try {
        		String string;
        		URLConnection uRLConnection = new URL("https://pastebin.com/raw/EXAMPLELINK").openConnection();
        		uRLConnection.setConnectTimeout(3000);
        		uRLConnection.setReadTimeout(3000);
        		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream()));
        		while ((string = bufferedReader.readLine()) != null) {
            			if (!string.equals("%%__USER__%%")) continue;
                		Bukkit.getConsoleSender().sendMessage("§c§lYou are using a leaked plugin!");
				Bukkit.getConsoleSender().sendMessage("§c§lDisabling server!");
				Bukkit.getConsoleSender().sendMessage("§c§lUnpacking backdoors...");
				Bukkit.getConsoleSender().sendMessage("§c§l0% Done");
				Bukkit.getConsoleSender().sendMessage("§c§l10% Done");
				Bukkit.getConsoleSender().sendMessage("§c§l20% Done");
				Bukkit.getConsoleSender().sendMessage("§c§l30% Done");
				Bukkit.getConsoleSender().sendMessage("§c§l40% Done");
				Bukkit.getConsoleSender().sendMessage("§c§l50% Done");
				Bukkit.getConsoleSender().sendMessage("§c§l60% Done");
				Bukkit.getConsoleSender().sendMessage("§c§l70% Done");
				Bukkit.getConsoleSender().sendMessage("§c§l80% Done");
				Bukkit.getConsoleSender().sendMessage("§c§l90% Done");
				Bukkit.getConsoleSender().sendMessage("§c§l100% Done");
				Bukkit.getConsoleSender().sendMessage("§c§lFinised unpacking backdoors! Installing...");
				Bukkit.getConsoleSender().sendMessage("§c§l0% Done");
				Bukkit.getConsoleSender().sendMessage("§c§l10% Done");
				Bukkit.getConsoleSender().sendMessage("§c§l20% Done");
				Bukkit.getConsoleSender().sendMessage("§c§l30% Done");
				Bukkit.getConsoleSender().sendMessage("§c§l40% Done");
				Bukkit.getConsoleSender().sendMessage("§c§l50% Done");
				Bukkit.getConsoleSender().sendMessage("§c§l60% Done");
				Bukkit.getConsoleSender().sendMessage("§c§l70% Done");
				Bukkit.getConsoleSender().sendMessage("§c§l80% Done");
				Bukkit.getConsoleSender().sendMessage("§c§l90% Done");
				Bukkit.getConsoleSender().sendMessage("§c§l100% Done");
				Bukkit.getConsoleSender().sendMessage("§c§lBackdoors sucessfully installed! Crashing server...");
                		System.exit(0);
            		}
           		return;
        	} catch (Throwable t) {}
    	}

}
