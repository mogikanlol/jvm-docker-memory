package com.example.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.util.ArrayList;
import java.util.List;

public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        printMemoryInfo();
        int mb = 1024 * 1024;
        // 1 int = 32 bit
        // 1 gb = 8 * 1024 * 1024 * 1024
        int size = 1024 * 1024 * 1024 / 32 * 8;
        int[] arr = new int[size];
        System.out.println(arr.length);

        log.info("Total memory : {} mb", Runtime.getRuntime().totalMemory() / mb);
    }

    private static void printMemoryInfo() {
        int mb = 1024 * 1024; // 1 mb = 1024 kb = 1024 * 1024 b
        MemoryMXBean memoryBean = ManagementFactory.getMemoryMXBean();
        long xms = memoryBean.getHeapMemoryUsage().getInit() / mb;
        long xmx = memoryBean.getHeapMemoryUsage().getMax() / mb;
        log.info("Initial memory (xms) : {} mb", xms);
        log.info("Max memory (xms) : {} mb", xmx);
    }
}
