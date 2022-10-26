package org.edureka.shipping;

public class PackageShipment implements IShipment {
    @Override
    public boolean addShipment() {
        return false;
    }

    @Override
    public boolean deleteShipment() {
        return false;
    }

    @Override
    public boolean getShipment() {
        System.out.println("Get a shipment");
        return false;
    }
}
