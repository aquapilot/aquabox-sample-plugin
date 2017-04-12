package com.foo.listeners;

import org.aquapilot.aquabox.api.event.sensor.SensorValueChangeEvent;
import org.aquapilot.aquabox.api.listener.AquaboxListener;
import org.aquapilot.aquabox.api.listener.Handler;
import org.slf4j.Logger;

/**
 * This class listener to any changes that happend on sensors
 */
public class SensorListener implements AquaboxListener {

   private Logger logger;

   public SensorListener(Logger logger) {
      System.out.println("SENSOR LISTENER INITIALIZED -------------------------------------");
      this.logger = logger;
      logger.info("SensorListener constructor called");
   }

   @Handler
   public void aStateChangedItsValue(SensorValueChangeEvent event) {
      logger.info("aStateChangedItsValue called");
      System.out.println("A state changed its value im called from the plugin !!!!");
   }
}
