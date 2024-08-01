package com.accenture.maven;

import java.util.*;


public class MarketProjects {

    public static void main(String[] args) {
        SortedMap<String, String> sortedMap = new TreeMap<>();
        NavigableMap<String, String> marketProjects = (NavigableMap<String, String>) sortedMap;

        marketProjects.put("US Market", "Project A");
        marketProjects.put("EU Market", "Project B");
        marketProjects.put("APAC Market", "Project C");

        System.out.println("Market-Project Pairs:");
        for (Map.Entry<String, String> entry : marketProjects.entrySet()) {
            System.out.println("Market: " + entry.getKey() + ", Project: " + entry.getValue());
        }

        String market = "EU Market";
        String project = marketProjects.get(market);
        System.out.println("\nProject for " + market + ": " + project);

        marketProjects.remove("APAC Market");
        System.out.println("\nAfter removal of APAC Market:");
        for (Map.Entry<String, String> entry : marketProjects.entrySet()) {
            System.out.println("Market: " + entry.getKey() + ", Project: " + entry.getValue());
        }

        Map.Entry<String, String> firstEntry = marketProjects.firstEntry();
        Map.Entry<String, String> lastEntry = marketProjects.lastEntry();
        System.out.println("\nFirst Market-Project Pair: " + firstEntry.getKey() + " - " + firstEntry.getValue());
        System.out.println("Last Market-Project Pair: " + lastEntry.getKey() + " - " + lastEntry.getValue());
    }
}
