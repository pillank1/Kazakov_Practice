package ru.ssau.tk.pillank1.Kazakov_Practice.collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class RouteLengthComparator {
    static Map<Route, Double> routeLengthMap = new HashMap<>();

    static int compare(Route route1, Route route2) {

        if (RouteLengthComparator.routeLengthMap.get(route1) == null) {
            RouteLengthComparator.routeLengthMap.put(route1, route1.length());
        }

        if (RouteLengthComparator.routeLengthMap.get(route2) == null) {
            RouteLengthComparator.routeLengthMap.put(route2, route2.length());
        }

        return Double.compare(RouteLengthComparator.routeLengthMap.get(route1), RouteLengthComparator.routeLengthMap.get(route2));
    }
}
