import model.*;
import model.Model;


import java.util.logging.Logger;

public class Runner {
    public static void main(String[] args) {
        Logger logger = Logger.getGlobal();
        BusinessCar bmw = new BusinessCar(Model.BMW, 100, 350, 50000);
        EconomCar toyota = new EconomCar(Model.MAZDA, 50, 200, 10000);
        LimousineCar mercedes = new LimousineCar(Model.MERCEDES, 10, 250, 100000);
        TaxiPark park = new TaxiPark();
        park.addCar(bmw);
        park.addCar(toyota);
        park.addCar(mercedes);
        String fullCostOfTaxiPark = "Full cost of taxi station = " + park.getTotalPriceOfTaxiPark();
        String sortCarsByFuel = "Sort cars by fuel consumption: " + park.sortByFuelConsumption();
        String searchCarsBySpeed = "Search cars by speed range: " + park.getCarListByParams(100, 300);
        logger.info(fullCostOfTaxiPark);
        logger.info(sortCarsByFuel);
        logger.info(searchCarsBySpeed);
    }
}
