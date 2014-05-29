package eu.basileus.api.foobar;

import eu.basileus.api.core.BaseResource;

import javax.annotation.Resource;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("foobars")
public class FoobarResource extends BaseResource {

  @Resource
  private FoobarService foobarService;

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public List<Foobar> getFoobars() {
    return foobarService.getFoobars();
  }

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  public Response createFoobar(Foobar foobar) {
    foobarService.save(foobar);
    return created(foobar.getId());
  }

}
