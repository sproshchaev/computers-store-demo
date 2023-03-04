package com.prosoft.repository;

import com.prosoft.domain.Laptop;

import java.util.Set;

/**
 * Класс LaptopRepositoryImpl содержит методы, реализующие интерфейс LaptopRepository
 */
public class LaptopRepositoryImpl implements LaptopRepository {
    private final Db db;

    public LaptopRepositoryImpl() {
        this.db = new Db();
    }

    @Override
    public int count() {
        return db.getLaptop().size();
    }

    @Override
    public Laptop save(Laptop laptop) {
        long id = db.getLaptop().size() + 1;
        laptop.setId(id);
        db.getLaptop().add(laptop);
        return laptop;
    }

    @Override
    public Set<Laptop> getAllLaptop() {
        return db.getLaptop();
    }

}
