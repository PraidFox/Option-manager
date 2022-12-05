package ru.alfabank.atlassian.optionmanager.rest;

import com.atlassian.jira.component.ComponentAccessor;
import com.atlassian.jira.issue.CustomFieldManager;
import com.atlassian.jira.issue.customfields.manager.OptionsManager;
import com.atlassian.jira.issue.customfields.option.Options;
import com.atlassian.plugins.rest.common.security.AnonymousAllowed;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Objects;

@Path("/hello")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
public class RestTst {

    CustomFieldManager customFieldManager = ComponentAccessor.getCustomFieldManager();
    OptionsManager optionManager = ComponentAccessor.getOptionsManager();


    @GET
    public Response getHealth() {
        return Response.ok("Welcome to Hell").build();
    }


    @GET
    @Path("/options")
    @AnonymousAllowed
    public String getOptions()
    {
        Options opt = optionManager.getOptions(Objects.requireNonNull(customFieldManager.getCustomFieldObject(10000L)).getConfigurationSchemes().get(0).getOneAndOnlyConfig());
        return opt.toString();
    }


}
