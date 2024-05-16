package ar.edu.utn.frc.tup.lciii;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

class BattleShipGameTest {

    @Test
    @DisplayName("probarSiElJuegoEstaFinalizado")
    void testIsFinish() {
        BattleShipGame game = new BattleShipGame();

        List<Ship> playerShips = new ArrayList<>();
        List<Ship> appShips = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            playerShips.add(new Ship(new Position(i, 0), ShipStatus.AFLOAT));
            appShips.add(new Ship(new Position(i, 0), ShipStatus.AFLOAT));
        }

        game.setPlayerShips(playerShips);
        game.setAppShips(appShips);

        assertFalse(game.isFinish());
        for (Ship ship : playerShips) {
            ship.sinkShip();
        }
        assertTrue(game.isFinish());
    }

}