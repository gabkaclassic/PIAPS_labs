package org.gaba.lab_2.passengers;

import org.gaba.lab_2.passengers.types.BusPassengerType;
import org.gaba.lab_2.passengers.types.TaxiPassengerType;

public class TaxiPassenger extends PassengerAbstract {

    private TaxiPassengerType type;

    private TaxiPassenger() {
        super();
    }

    @Override
    public String toString() {
        return String.format("Taxi Passenger [id=%d, type=%s]", id, type);
    }

    @Override
    public void board() {
        System.out.println(this);
    }

    public TaxiPassengerType getType() {
        return type;
    }
    public boolean babyChair() {
        return type.isBabyChairNeeded();
    }

    public static TaxiPassengerBuilder builder() {
        return new TaxiPassengerBuilder();
    }

    public static class TaxiPassengerBuilder {

        private final TaxiPassenger instance;

        TaxiPassengerBuilder() {
            instance = new TaxiPassenger();
        }
        public TaxiPassenger build() {
            return instance;
        }

        public TaxiPassengerBuilder adult() {
            instance.type = TaxiPassengerType.ADULT;
            return this;
        }
        public TaxiPassengerBuilder child() {
            instance.type = TaxiPassengerType.CHILD;
            return this;
        }

        public TaxiPassengerBuilder type(TaxiPassengerType type) {

            instance.type = type;

            return this;
        }

        public TaxiPassengerBuilder id(int id) {

            instance.id = id;

            return this;
        }
    }
}
