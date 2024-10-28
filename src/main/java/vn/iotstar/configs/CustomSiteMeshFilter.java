package vn.iotstar.configs;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;

public class CustomSiteMeshFilter extends ConfigurableSiteMeshFilter {
	@Override
	  protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
	           // Map default decorator. This shall be applied to all paths if no other paths match.
		builder.addDecoratorPath("/tes*", "/WEB-INF/decorators/tes.jsp*")


		 // Map decorators to specific path patterns.


		 // Exclude few paths from decoration.
		 .addExcludedPath("/home*").addExcludedPath("/home/*")


		 .addExcludedPath("/login*").addExcludedPath("/login/*")


		 .addExcludedPath("/alogin*").addExcludedPath("/alogin/*")


		 .addExcludedPath("/api/**").addExcludedPath("/api/**");
	  }
	
}
