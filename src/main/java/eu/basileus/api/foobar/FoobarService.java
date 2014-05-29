package eu.basileus.api.foobar;


import java.util.List;

public interface FoobarService {

  public List<Foobar> getFoobars();

  void save(Foobar foobar);
}
