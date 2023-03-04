package com.prosoft;

import com.prosoft.service.LaptopService;
import com.prosoft.service.LaptopServiceImpl;
import com.prosoft.shell.AppEventsCommands;
import com.prosoft.shell.AppEventsCommandsImpl;

/**
 * computers-store-demo
 *
 */
public class Main {
    public static void main(String[] args) {

        LaptopService laptopService = new LaptopServiceImpl();
        laptopService.initDb();

        AppEventsCommands appEventsCommands = new AppEventsCommandsImpl(laptopService);
        appEventsCommands.startDialog();

    }

}
