package eu.basileus.api.core;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.Resource;

public class BaseDao {

  @Resource
  protected JdbcTemplate jdbcTemplate;

}
