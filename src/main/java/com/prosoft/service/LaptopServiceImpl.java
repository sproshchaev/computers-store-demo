package com.prosoft.service;

import com.prosoft.domain.Laptop;
import com.prosoft.repository.LaptopRepository;
import com.prosoft.repository.LaptopRepositoryImpl;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Класс LaptopServiceImpl содержит реализацию методов LaptopService
 */
public class LaptopServiceImpl implements LaptopService {

    private final LaptopRepository laptopRepository;

    public LaptopServiceImpl() {
        this.laptopRepository = new LaptopRepositoryImpl();
    }

    @Override
    public int count() {
        return laptopRepository.count();
    }

    @Override
    public void initDb() {
        laptopRepository.save(new Laptop(String.valueOf(Math.random()).substring(2), "Sony", 256,
                1000, "Win", "yellow"));
        laptopRepository.save(new Laptop(String.valueOf(Math.random()).substring(2), "IBM", 512,
                2000, "Win", "blue"));
        laptopRepository.save(new Laptop(String.valueOf(Math.random()).substring(2), "Apple", 256,
                1000, "MacOS", "yellow"));
        laptopRepository.save(new Laptop(String.valueOf(Math.random()).substring(2), "IBM", 512,
                2000, "Win", "blue"));
        laptopRepository.save(new Laptop(String.valueOf(Math.random()).substring(2), "Sony", 256,
                1000, "Win", "red"));
    }

    /**
     * Метод getLaptopByCriteria возвращает множество объектов, соответствующих критерию: 1-RAM, 2-HDD
     *
     * @param criteria - Map, содержащий критерии выборки
     * @return - множество сущностей, удовлетворяющих условиям критерия
     */
    @Override
    public Set<Laptop> getLaptopByCriteria(Map<Integer, String> criteria) {
        Set<Laptop> laptopSet = laptopRepository.getAllLaptop();
        Set<Laptop> resultSet = new HashSet<>();
        for (Map.Entry map : criteria.entrySet()) {
            switch ((int) map.getKey()) {
                case 1:
                    resultSet = getLaptopSetByRam(laptopSet, Integer.parseInt((String) map.getValue()));
                    break;
                case 2:
                    resultSet = getLaptopSetByHdd(laptopSet, Integer.parseInt((String) map.getValue()));
                    break;
            }
        }
        return resultSet;
    }

    private Set<Laptop> getLaptopSetByRam(Set<Laptop> laptopSet, int ram) {
        Set<Laptop> resultSet = new HashSet<>();
        for (Laptop laptop : laptopSet) {
            if (laptop.getRam() >= ram) {
                resultSet.add(laptop);
            }
        }
        return resultSet;
    }

    private Set<Laptop> getLaptopSetByHdd(Set<Laptop> laptopSet, int hdd) {
        Set<Laptop> resultSet = new HashSet<>();
        for (Laptop laptop : laptopSet) {
            if (laptop.getHdd() >= hdd) {
                resultSet.add(laptop);
            }
        }
        return resultSet;
    }

}
