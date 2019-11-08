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
    public void clearCacheStructure(String structure) {
        cacheManager.getCache(structure).clear();
    };

    @Override
    public void clearCacheStructures() {
        /* loop on list of structures */
        Collection<String> structureNames = cacheManager.getCacheNames();
        for (String structureName : structureNames) {
            cacheManager.getCache(structureName).clear();
        }
    }
}
