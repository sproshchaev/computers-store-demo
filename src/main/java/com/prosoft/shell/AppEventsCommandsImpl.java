package com.prosoft.shell;

import com.prosoft.domain.Laptop;
import com.prosoft.service.LaptopService;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Класс AppEventsCommandsImpl содержит реализацию методов интерфейса AppEventsCommands
 */
public class AppEventsCommandsImpl implements AppEventsCommands {

    private final LaptopService laptopService;

    public AppEventsCommandsImpl(LaptopService laptopService) {
        this.laptopService = laptopService;
    }

    @Override
    public void startDialog() {
        int criteria = getCriteria();
        int value = getCriteriaValue();
        Map<Integer, String> criteriaMap = new HashMap<>();
        criteriaMap.put(criteria, String.valueOf(value));
        printResult(laptopService.getLaptopByCriteria(criteriaMap));
    }

    private int getCriteria() {
        System.out.println("Computers store: " + laptopService.count() + " позиций");
        System.out.println("Введите цифру, соответствующую критерию выборки:\n 1-RAM\n 2-HDD");
        System.out.print("> ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private int getCriteriaValue() {
        System.out.println("Введите минимальное значение:");
        System.out.print("> ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private void printResult(Set<Laptop> laptopSet) {
        System.out.println("Позиции в наличии:");
        int count = 0;
        for (Laptop laptop : laptopSet) {
            System.out.println(" " + ++count + ") " + laptop);
        }
    }

}
