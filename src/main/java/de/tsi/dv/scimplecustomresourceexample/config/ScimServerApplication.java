package de.tsi.dv.scimplecustomresourceexample.config;

import de.tsi.dv.scimplecustomresourceexample.rest.ScimCustomUserResource;
import jakarta.ws.rs.core.Application;
import org.apache.directory.scim.server.rest.ScimResourceHelper;

import java.util.HashSet;
import java.util.Set;

public class ScimServerApplication extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<>(ScimResourceHelper.scimpleFeatureAndResourceClasses());
        classes.add(ScimCustomUserResource.class);
        return classes;
    }
}