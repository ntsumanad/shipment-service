package org.edureka.shipping;

public class PackageShipment implements IShipment {
    @Override
    public boolean addShipment() {
        return false;
    }

    @Override
    public boolean deleteShipment() {
        System.out.println("Deleting an existing shipment");
        return false;
    }

    @Override
    public boolean getShipment() {
        return false;
    }
}
