package in.abc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.abc.comp.Employee;

@SpringBootApplication
public class BootProg05ConfigurationPropertiesAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootProg05ConfigurationPropertiesAppApplication.class, args);
		
		Employee employee = context.getBean(Employee.class);
		System.out.println(employee);
		
		((ConfigurableApplicationContext) context).close();
	}

}
