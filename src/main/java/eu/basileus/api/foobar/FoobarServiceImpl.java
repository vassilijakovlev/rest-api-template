package eu.basileus.api.foobar;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("foobarService")
public class FoobarServiceImpl implements FoobarService {

  @Resource
  private FoobarDao foobarDao;

  @Override
  public List<Foobar> getFoobars() {
    return foobarDao.loadAll();
  }
}
