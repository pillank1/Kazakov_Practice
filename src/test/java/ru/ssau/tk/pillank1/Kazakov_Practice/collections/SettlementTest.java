package ru.ssau.tk.pillank1.Kazakov_Practice.collections;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SettlementTest {

    @Test
    public void testToString() {
        Settlement city = new Settlement();
        Settlement village = new Settlement();

        city.setType(SettlementType.CITY);
        village.setType(SettlementType.VILLAGE);
        city.setName("Toglyatti");
        village.setName("Sovety");
        city.setLatitude(35.43);
        village.setLatitude(32.69);
        city.setLongitude(65.09);
        village.setLongitude(67.95);

        assertEquals(city.toString(), "Settlement: Type: CITY; Name: Toglyatti; Latitude: 35.43; Longitude: 65.09.");
        assertEquals(village.toString(), "Settlement: Type: VILLAGE; Name: Sovety; Latitude: 32.69; Longitude: 67.95.");
    }
}