package com.foo;

import com.foo.listeners.SensorListener;
import org.aquapilot.aquabox.api.JavaPlugin;
import org.slf4j.Logger;

/**
 * Created by vermeille on 03.04.2017.
 */
public class SamplePlugin extends JavaPlugin {

   private final Logger LOGGER = getLogger();

   public void onEnable() {
      System.out.println("System out : enabled");
      LOGGER.debug("Sample plugin is now enabled");

      this.getPluginManager().registerEvents(new SensorListener(LOGGER), this);

   }

   public void onDisable() {
      System.out.println("System out : disabled");
      LOGGER.debug("Sample plugin is now disabled");
   }
}
