package ru.ssau.tk.pillank1.Kazakov_Practice.collections;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WaypointTest {

    @Test
    public void testToString() {
        Waypoint depot = new Waypoint();
        Waypoint warehouse = new Waypoint();

        depot.setType(WaypointType.DEPOT);
        warehouse.setType(WaypointType.WAREHOUSE);
        depot.setName("Vokzal");
        warehouse.setName("Angar");
        depot.setLatitude(58.48);
        warehouse.setLatitude(65.41);
        depot.setLongitude(88.46);
        warehouse.setLongitude(13.84);

        assertEquals(depot.toString(), "Waypoint: Type: DEPOT; Name: Vokzal; Latitude: 58.48; Longitude: 88.46.");
        assertEquals(warehouse.toString(), "Waypoint: Type: WAREHOUSE; Name: Angar; Latitude: 65.41; Longitude: 13.84.");
    }
}