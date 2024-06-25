package de.tsi.dv.scimplecustomresourceexample.models;

import jakarta.ws.rs.ext.Provider;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.directory.scim.spec.annotation.ScimAttribute;
import org.apache.directory.scim.spec.annotation.ScimResourceType;
import org.apache.directory.scim.spec.resources.Address;
import org.apache.directory.scim.spec.resources.ScimResource;

import java.net.URI;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@ScimResourceType(
        id = ScimCustomUser.RESOURCE_NAME,
        name = ScimCustomUser.RESOURCE_NAME,
        schema = ScimCustomUser.SCHEMA_URI,
        description = "Top level ScimUser",
        endpoint = "/CustomUsers"
)
@XmlRootElement(name = ScimCustomUser.RESOURCE_NAME)
@XmlAccessorType(XmlAccessType.FIELD)
public class ScimCustomUser extends ScimResource {

    public static final String RESOURCE_NAME = "CustomUsers";
    public static final String SCHEMA_URI = "urn:ietf:params:scim:schemas:core:2.0:CustomUsers";

    public ScimCustomUser() {
        super(SCHEMA_URI, RESOURCE_NAME);
    }

    @ScimAttribute(
            description = "A Boolean value indicating the User's administrative status."
    )

    @XmlElement(name = "active")
    Boolean active = true;

    @ScimAttribute(
            description = "A physical mailing address for this User, as described in ..."
    )
    @XmlElement(name = "addresses")
    List<Address> addresses;
}