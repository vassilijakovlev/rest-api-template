package eu.basileus.api.core;

import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;
import java.util.Set;

public class SpringWebAppInitializer implements WebApplicationInitializer {


  @Override
  public void onStartup(ServletContext container) {
    AnnotationConfigWebApplicationContext appContext =
        new AnnotationConfigWebApplicationContext();
    appContext.register(AppConfig.class);
    addApacheCxfServlet(container);

    container.addListener(new ContextLoaderListener(appContext));
  }

  private void addApacheCxfServlet(ServletContext servletContext) {
    CXFServlet cxfServlet = new CXFServlet();

    ServletRegistration.Dynamic appServlet = servletContext.addServlet("CXFServlet", cxfServlet);
    appServlet.setLoadOnStartup(1);

    Set<String> mappingConflicts = appServlet.addMapping("/api/v1/*");
  }

}