import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opas350.service.CustomerService;

public class Application {

	public static void main(String[] args) {

		//CustomerService service = new CustomerServiceImpl();
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		CustomerService service = appContext.getBean("customerService", CustomerService.class);
		
		System.out.println(service.findAll().get(0).getFirstName());
	}

}
