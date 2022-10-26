package org.edureka.shipping;

import java.util.List;

public class PackageShipment implements IShipment {

    private List<Shipment> shipmentList;

    @Override
    public boolean addShipment() {
        System.out.println("Adding new shipment");
        return false;

    }

    @Override
    public boolean deleteShipment() {
        return false;
    }

    @Override
    public boolean getShipment() {
        return false;
    }
}
