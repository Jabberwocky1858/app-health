package at.gepaplexx;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/healthctl")
public class HealthControlResource {
    @Inject
    State state;

    @Path("/live")
    @GET
    public Response killAndRevive() {
        state.livenesstoggle();
        return Response.noContent().build();
    }

    @Path("/ready")
    @GET
    public Response occupyAndLeaveAlone() {
        state.readinesstoggle();
        return Response.noContent().build();
    }
}
