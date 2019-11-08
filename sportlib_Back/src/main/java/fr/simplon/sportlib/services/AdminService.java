package fr.simplon.sportlib.services;

import org.springframework.stereotype.Service;

@Service
public interface AdminService {

    /** method signatures and arguments if present */

    public void clearCacheStructures();

    public void clearCacheStructure(String structure);
}
