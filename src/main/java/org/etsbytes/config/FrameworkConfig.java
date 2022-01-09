package org.etsbytes.config;

import org.aeonbits.owner.Config;

@Config.Sources(value="file:./src/test/resources/config/config.properties")
public interface FrameworkConfig extends Config {
	
	long timeout();
	String url();
	String browser();
}
