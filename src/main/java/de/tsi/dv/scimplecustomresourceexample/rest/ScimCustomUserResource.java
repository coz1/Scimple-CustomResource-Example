package de.tsi.dv.scimplecustomresourceexample.rest;

import de.tsi.dv.scimplecustomresourceexample.models.ScimCustomUser;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.Path;
import org.apache.directory.scim.core.repository.RepositoryRegistry;
import org.apache.directory.scim.core.schema.SchemaRegistry;
import org.apache.directory.scim.server.rest.BaseResourceTypeResourceImpl;

@ApplicationScoped
@Path("CustomUsers")
public class ScimCustomUserResource extends BaseResourceTypeResourceImpl<ScimCustomUser> {

    @Inject
    public ScimCustomUserResource(SchemaRegistry schemaRegistry, RepositoryRegistry repositoryRegistry) {
        super(schemaRegistry, repositoryRegistry, ScimCustomUser.class);
    }

    public ScimCustomUserResource() {
        // CDI
        this(null, null);
    }
}
