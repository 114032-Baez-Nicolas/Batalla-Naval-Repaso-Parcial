package ar.edu.utn.frc.tup.lciii;


/**
 * Esta clase representa un barco
 *
 * El barco es parte de la flota de cada jugador y
 * tiene una posicion y un estado que puede ser AFLOAT (a flote)
 * o SUNKEN (hndidio)
 *
 * @see Position
 * @see ShipStatus
 *
 */
public class Ship {

    /**
     * Position of the ship
     */
    private Position position;

    /**
     * Status of the ship
     */
    private ShipStatus shipStatus;

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public ShipStatus getShipStatus() {
        return shipStatus;
    }

    public void setShipStatus(ShipStatus shipStatus) {
        this.shipStatus = shipStatus;
    }

    public Ship() {
    }

    public Ship(Position position, ShipStatus shipStatus) {
        this.position = position;
        this.shipStatus = shipStatus;
    }

    public void sinkShip() {
        this.shipStatus = ShipStatus.SUNKEN;
    }

    /**
     * Este metodo debe validar si un Ship es igual a otro en base a su posición.
     * Es decir, si la posición de la istancia del barco tiene los mismo datos
     * de position que el objeto pasado por parametro.
     *
     * @param obj El Ship a comparar contra la instancia en la que se ejecuta el metodo
     *
     * @see Object#equals(Object)
     *
     * @return true si este Ship tiene la misma posicion que obj, false si no se da esta condición.
     */
    @Override
    public boolean equals(Object obj) {
        Ship ship = (Ship) obj;
        return this.position.equals(ship.position);
    }
}
