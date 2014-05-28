package eu.basileus.api.foobar;

import eu.basileus.api.core.BaseDao;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.Date;
import java.util.List;

@Repository
public class FoobarDao extends BaseDao {

  public List<Foobar> loadAll() {
    Foobar foobar = new Foobar();
    foobar.setId(100500);
    foobar.setDate(new Date());
    foobar.setStatus("baz");
    return Collections.singletonList(foobar);
  }
}
