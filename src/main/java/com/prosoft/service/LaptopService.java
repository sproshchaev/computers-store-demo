package com.prosoft.service;

import com.prosoft.domain.Laptop;

import java.util.Map;
import java.util.Set;

/**
 * Интерфейс LaptopService содежит методы для доступа к слою репозитория со стороны слоя представления (UI)
 */
public interface LaptopService {
    int count();
    void initDb();
    Set<Laptop> getLaptopByCriteria(Map<Integer, String> criteria);

}
