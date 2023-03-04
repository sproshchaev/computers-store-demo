package com.prosoft.repository;

import com.prosoft.domain.Laptop;

import java.util.HashSet;
import java.util.Set;

/**
 * Класс Db эмулирует Базу данных, содержащую сущности Laptop
 */
public class Db {
    private final Set<Laptop> laptop;

    public Db() {
        this.laptop = new HashSet<>();
    }

    public Set<Laptop> getLaptop() {
        return laptop;
    }

}
