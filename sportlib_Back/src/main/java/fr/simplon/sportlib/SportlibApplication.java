package fr.simplon.sportlib;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableCaching
public class SportlibApplication {

	public static void main(String[] args) {
		SpringApplication.run(SportlibApplication.class, args);
	}

	@Bean
	public CacheManager createSimpleCacheManager() {
		SimpleCacheManager simpleCacheManager = new SimpleCacheManager();
		List<Cache> caches = new ArrayList<>();
		caches.add(new ConcurrentMapCache("structures"));
		simpleCacheManager.setCaches(caches);
		return simpleCacheManager;
	}

	@Bean
	protected LocalValidatorFactoryBean validator(MessageSource messageSource) {
		// messageSource = messages.properties in src/main/resources
		LocalValidatorFactoryBean validatorFactoryBean = new LocalValidatorFactoryBean();
		validatorFactoryBean.setValidationMessageSource(messageSource);
		return validatorFactoryBean;
	}

	@Bean
	protected ModelMapper mapper() {
		return new ModelMapper();
	}
}
