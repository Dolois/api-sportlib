package fr.formation.sportlib;

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
import java.util.SimpleTimeZone;

@SpringBootApplication
@EnableCaching
public class SportlibApplication {

	public static void main(String[] args) {
		SpringApplication.run(SportlibApplication.class, args);
	}

	@Bean
	public ModelMapper mapper() {
		return new ModelMapper();
	}

	// class generique de Spring
	@Bean
	public CacheManager createSimpleCacheManager() {
		SimpleCacheManager simpleCacheManager = new SimpleCacheManager();
		List<Cache> caches = new ArrayList<>();

		// concurrent => pour les acces des differents threads
		// region => places
		caches.add(new ConcurrentMapCache("places"));
		simpleCacheManager.setCaches(caches);

		return simpleCacheManager;
	}
}
