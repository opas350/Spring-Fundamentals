import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.opas350.repository.CustomerRepository;
import com.opas350.repository.HibernateCustomerRepositoryImpl;
import com.opas350.service.CustomerService;
import com.opas350.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"com.opas350"})
public class AppConfig {
	
	@Bean(name="customerService")
	@Scope("prototype")
	//@Scope("singleton")
	public CustomerService getCustomerService() {
		CustomerServiceImpl customerService = new CustomerServiceImpl();
		//customerService.setCustomerRepository(getCustomerRepository());
		return customerService;
	}
	
//	@Bean(name="customerRepository")
//	public CustomerRepository getCustomerRepository() {
//		return new HibernateCustomerRepositoryImpl(); 
//	}
	
}
