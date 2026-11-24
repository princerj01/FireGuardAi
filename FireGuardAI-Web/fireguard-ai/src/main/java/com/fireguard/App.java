package com.fireguard;

import java.util.Random;

public class App {

    public static void main(String[] args) throws InterruptedException {

        Random random = new Random();

        System.out.println("========== FIREGUARD AI BUILDING MONITOR ==========");

        while(true) {

            int gasLevel = random.nextInt(100);
            int temperature = random.nextInt(100);

            System.out.println("\n--- Sensor Data (Flat 203) ---");
            System.out.println("Gas Level: " + gasLevel);
            System.out.println("Temperature: " + temperature);

            if(gasLevel > 70) {
                System.out.println("⚠ WARNING: GAS LEAK DETECTED!");
            }

            if(temperature > 80) {
                System.out.println("🔥 ALERT: FIRE RISK DETECTED!");
            }

            if(gasLevel < 70 && temperature < 80) {
                System.out.println("✅ Status: SAFE");
            }

            Thread.sleep(5000);
        }
    }
}