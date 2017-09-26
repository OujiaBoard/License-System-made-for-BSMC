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
                		Bukkit.getConsoleSender().sendMessage("§c§lYou are using a cracked plugin, disabling server and injecting backdoors");
                		System.exit(0);
            		}
           		return;
        	} catch (Throwable t) {}
    	}

}
