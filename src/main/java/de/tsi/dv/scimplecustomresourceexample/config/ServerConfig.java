package de.tsi.dv.scimplecustomresourceexample.config;

import jakarta.ws.rs.core.Application;
import org.apache.directory.scim.server.configuration.ServerConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServerConfig {
    @Bean
    ServerConfiguration serverConfiguration() {
        return new ServerConfiguration()
                .setId("BlaBlub")
                .setBulkMaxOperations(50);
    }

    @Bean
    Application scimApplication() {
        return new ScimServerApplication();
    }
}
