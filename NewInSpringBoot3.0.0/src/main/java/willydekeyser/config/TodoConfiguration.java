package willydekeyser.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

import willydekeyser.exception.TodoClientException;

@Configuration
public class TodoConfiguration {

	@Bean
	public TodoClient todoClient() throws TodoClientException {
		return httpServiceProxyFactory().createClient(TodoClient.class);
	}
	
	private HttpServiceProxyFactory httpServiceProxyFactory() {
		WebClient webClient = WebClient.builder().build();
		WebClientAdapter client = WebClientAdapter.forClient(webClient);
		return HttpServiceProxyFactory.builder(client).build();
	}
}
