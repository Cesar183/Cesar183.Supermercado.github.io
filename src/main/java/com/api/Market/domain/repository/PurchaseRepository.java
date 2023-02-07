package com.api.Market.domain.repository;

import com.api.Market.domain.Purchase;

import java.util.List;
import java.util.Optional;

public interface PurchaseRepository {
    List<Purchase> getAll();
    Optional<List<Purchase>> getCyClient(String clientId);
    Purchase save(Purchase purchase);
}
