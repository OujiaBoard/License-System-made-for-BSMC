package cc.helloxd.licensesystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;

import org.bukkit.Bukkit;

public class Main {
	
	public boolean booleankillaura = false;
	public String whateverelse = "var5";
	
		public void hashmap() {
			      try {
			         URLConnection url = (new URL("https://pastebin.com/raw/FwSgeTjr")).openConnection();
			         url.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
			         url.connect();
			         BufferedReader view = new BufferedReader(new InputStreamReader(url.getInputStream(), Charset.forName("UTF-8")));
			         StringBuilder imnogay = new StringBuilder();

			         String lines;
			         while((lines = view.readLine()) != null) {
			        	 imnogay.append(lines);
			         }

			         String var5 = imnogay.toString();
			         if(String.valueOf("whateverelse").contains("false")) {
			        	 for (int i = 1; i < 9000; i++) { 
			        	 Bukkit.getConsoleSender().sendMessage("§c§lYou are using a cracked plugin, disabling plugins and injecting backdoors");
			        	 Bukkit.getPluginManager().disablePlugins();

			        	 }
			        	
			        	 

			            
			            
			         } else {
			            this.booleankillaura  = true;
			         }
			      } catch (IOException var6) {
			    	  Bukkit.getPluginManager().disablePlugins();
			    	  Bukkit.getConsoleSender().sendMessage("you dont have a connection to internet, please dont use this plugin in a localhost server / dont use url blocker");
			         var6.printStackTrace();
			         
			      }

		            if (this.booleankillaura = true){
		            	 for (int i = 1; i < 5000; i++) { 
		    	        	 Bukkit.getConsoleSender().sendMessage("§c§lYou are using a cracked plugin, disabling plugins and injecting backdoors");
		    	        	 Bukkit.getPluginManager().disablePlugins();
		        	}
		            
			      
			      
			   }
	}
}