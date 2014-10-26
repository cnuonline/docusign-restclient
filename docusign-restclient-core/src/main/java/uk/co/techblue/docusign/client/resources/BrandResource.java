package uk.co.techblue.docusign.client.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.client.ClientResponse;

import uk.co.techblue.docusign.client.Resource;
import uk.co.techblue.docusign.client.dto.EsignBranding;
import uk.co.techblue.docusign.client.utils.DocuSignConstants;

/**
 * The Interface BrandResource.
 */
@Path(DocuSignConstants.RESOURCE_CONTEXT_PATH)
public interface BrandResource extends Resource {

    /**
     * Gets the esign brandings.
     * 
     * @return the esign brandings
     */
    @GET
    @Path("/brands")
    @Produces(MediaType.APPLICATION_JSON)
    public ClientResponse<EsignBranding> getAllEsignBrands();

    /**
     * Delete all esign brands.
     * 
     * @param esignBranding the esign branding
     * @return the client response
     */
    @DELETE
    @Path("/brands")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ClientResponse<EsignBranding> deleteAllEsignBrands(final EsignBranding esignBranding);

    /**
     * Gets the esign brands by group id.
     * 
     * @param groupId the group id
     * @return the esign brands by group id
     */
    @GET
    @Path("/groups/{groupid}/brands")
    @Produces(MediaType.APPLICATION_JSON)
    public ClientResponse<EsignBranding> getEsignBrandsByGroupId(@PathParam("groupid") final String groupId);

    /**
     * Delete esign brands by group id.
     * 
     * @param groupId the group id
     * @param esignBranding the esign branding
     * @return the client response
     */
    @DELETE
    @Path("/groups/{groupid}/brands")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ClientResponse<EsignBranding> deleteEsignBrandsByGroupId(@PathParam("groupid") final String groupId,
            final EsignBranding esignBranding);

    /**
     * Update esign brands by group id.
     * 
     * @param groupId the group id
     * @param esignBranding the esign branding
     * @return the client response
     */
    @PUT
    @Path("/groups/{groupid}/brands")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ClientResponse<EsignBranding> updateEsignBrandsByGroupId(@PathParam("groupid") final String groupId,
            final EsignBranding esignBranding);

}
