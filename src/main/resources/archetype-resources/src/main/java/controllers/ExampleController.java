#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.controllers;

import com.manywho.sdk.entities.run.elements.config.ServiceRequest;
import com.manywho.sdk.entities.run.elements.config.ServiceResponse;
import com.manywho.sdk.enums.InvokeType;
import com.manywho.sdk.services.annotations.AuthorizationRequired;
import com.manywho.sdk.services.controllers.AbstractController;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/${artifactId}")
@Consumes("application/json")
@Produces("application/json")
public class ExampleController extends AbstractController {

    @Path("/${artifactId}")
    @POST
    @AuthorizationRequired
    public ServiceResponse ${artifactId}Action(ServiceRequest serviceRequest) throws Exception {
        return new ServiceResponse(InvokeType.Forward, serviceRequest.getToken());
    }
}
