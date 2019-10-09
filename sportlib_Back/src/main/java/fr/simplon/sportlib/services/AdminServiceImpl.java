package fr.simplon.sportlib.services;

import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Service;
import java.util.Collection;

@Service
public class AdminServiceImpl implements AdminService {

    private final CacheManager cacheManager;

    protected AdminServiceImpl(CacheManager cacheManager) {
        this.cacheManager = cacheManager;
    };

    @Override
    public void clearCacheCity(String zipCode) {
        cacheManager.getCache(zipCode).clear();
    };

    @Override
    public void clearCacheCities() {
        /* iterer la liste des villes */
        Collection<String> cityNames = cacheManager.getCacheNames();
        for (String cityName : cityNames) {
            cacheManager.getCache(cityName).clear();
        }
    }
}
