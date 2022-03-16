package spring;

// What are the types of Spring MVC Dependency Injection?
// Constructor-Based and setter-based

public class DependInjection {
	
	/* 
 @Configuration
@ComponentScan("com.interviewbit.constructordi")
public class SpringAppConfig {
   @Bean
   public Shape shapes() {
       return new Shapes("Rectangle");
   }
   @Bean
   public Dimension dimensions() {
       return new Dimension(4,3);
   }
}
	 */
 /*  
  * ...at  Constructor-Based
	@Component
	public class Figure {
	   private Shape shape;
	   private Dimension dimension;
	   
	   @Autowired
	   public Figure(Shape shape, Dimension dimension) {
	       this.shape = shape;
	       this.dimension = dimension;
	   }
	}
	*/
	
}
