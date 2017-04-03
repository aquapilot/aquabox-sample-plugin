package com.foo;

import org.aquapilot.aquabox.api.JavaPlugin;
import org.slf4j.Logger;

/**
 * Created by vermeille on 03.04.2017.
 */
public class SamplePlugin extends JavaPlugin {

   private final Logger LOGGER = getLogger();

   public void onEnable() {

      LOGGER.debug("Sample plugin is now enabled");
   }

   public void onDisable() {

      LOGGER.debug("Sample plugin is now disabled");
   }
}
