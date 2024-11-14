package sg.edu.nus.iss.vttp5a_day11l;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

@SpringBootApplication
public class vttp5ssfday11l {

	public static void main(String[] args) {
		SpringApplication.run(vttp5ssfday11l.class, args);
	
		// SpringApplication.run(Vttp5aDay11lApplication.class, args);

	}

	@Bean
	public CommonsRequestLoggingFilter logging() {

		CommonsRequestLoggingFilter crlf = new CommonsRequestLoggingFilter();
		crlf.setIncludeClientInfo(true);
		crlf.setIncludeQueryString(true);
		return crlf;
	}
}
