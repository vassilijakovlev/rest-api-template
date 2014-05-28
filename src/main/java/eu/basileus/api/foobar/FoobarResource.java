package eu.basileus.api.foobar;

import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("foobars")
public class FoobarResource {

  @Resource
  private FoobarService foobarService;

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public List<Foobar> getInventories() {
    return foobarService.getFoobars();
  }

}
