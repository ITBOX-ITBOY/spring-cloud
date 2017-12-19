

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author Gunnar Hillert
 *
 */
@SpringBootApplication
@EnableEurekaServer
@ComponentScan("eurekademo")
public class EurekaApplication {

	public static void main(String[] args) throws Exception {
		Scanner scan=new Scanner(System.in);
		String profiles=scan.nextLine();
		//SpringApplication.run(EurekaApplication.class, args);
		
		new SpringApplicationBuilder(EurekaApplication.class).profiles(profiles).run(args);
	}

}
