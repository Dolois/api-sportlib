package fr.simplon.sportlib.services;

import org.springframework.stereotype.Service;

@Service
public interface AdminService {

    /** method signatures and arguments if present */

    public void clearCacheCities();

    public void clearCacheCity(String zipCode);
}
