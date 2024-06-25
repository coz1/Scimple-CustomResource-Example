package de.tsi.dv.scimplecustomresourceexample.repositories;

import de.tsi.dv.scimplecustomresourceexample.models.ScimCustomUser;
import org.apache.directory.scim.core.repository.InvalidRepositoryException;
import org.apache.directory.scim.core.repository.Repository;
import org.apache.directory.scim.spec.exception.ResourceException;
import org.apache.directory.scim.spec.filter.Filter;
import org.apache.directory.scim.spec.filter.FilterResponse;
import org.apache.directory.scim.spec.filter.PageRequest;
import org.apache.directory.scim.spec.filter.SortRequest;
import org.apache.directory.scim.spec.filter.attribute.AttributeReference;
import org.apache.directory.scim.spec.patch.PatchOperation;
import org.apache.directory.scim.spec.resources.ScimExtension;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service("scimUserRepository")
public class ScimUserRepository implements Repository<ScimCustomUser> {
    @Override
    public Class<ScimCustomUser> getResourceClass() {
        return ScimCustomUser.class;
    }

    @Override
    public ScimCustomUser create(ScimCustomUser resource) throws ResourceException {
        return null;
    }

    @Override
    public ScimCustomUser update(String id, String version, ScimCustomUser resource, Set<AttributeReference> includedAttributes, Set<AttributeReference> excludedAttributes) throws ResourceException {
        return null;
    }

    @Override
    public ScimCustomUser patch(String id, String version, List<PatchOperation> patchOperations, Set<AttributeReference> includedAttributes, Set<AttributeReference> excludedAttributes) throws ResourceException {
        return null;
    }

    @Override
    public ScimCustomUser get(String id) throws ResourceException {
        return null;
    }

    @Override
    public FilterResponse<ScimCustomUser> find(Filter filter, PageRequest pageRequest, SortRequest sortRequest) throws ResourceException {
        return null;
    }

    @Override
    public void delete(String id) throws ResourceException {

    }

    @Override
    public List<Class<? extends ScimExtension>> getExtensionList() throws InvalidRepositoryException {
        return Repository.super.getExtensionList();
    }
}
