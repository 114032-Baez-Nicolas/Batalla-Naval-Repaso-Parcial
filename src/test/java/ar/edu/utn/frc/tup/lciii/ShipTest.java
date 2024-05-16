package ar.edu.utn.frc.tup.lciii;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShipTest {

    @Test
    @DisplayName("probarIgualdadDeBarcoBasadoEnPosicion")
    void testEquals() {
        Position position1 = new Position(1, 1);
        Position position2 = new Position(2, 2);

        Ship ship1 = new Ship(position1, ShipStatus.AFLOAT);
        Ship ship2 = new Ship(position1, ShipStatus.AFLOAT);

        assertTrue(ship1.equals(ship2));
        ship2.setPosition(position2);
        assertFalse(ship1.equals(ship2));
    }
}