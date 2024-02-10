package org.gaba.lab_2.passengers;

import org.gaba.lab_2.passengers.types.BusPassengerType;

public class BusPassenger extends PassengerAbstract {

    private BusPassengerType type;

    private BusPassenger() {
        super();
    }

    @Override
    public String toString() {
        return String.format("Taxi Passenger [id=%d, type=%s]", id, type);
  }

    public BusPassengerType getType() {
        return type;
    }

    public int cost() {
        return type.getCost();
    }

    @Override
    public void board() {
        System.out.println(this);
    }

    public static BusPassengerBuilder builder() {
        return new BusPassengerBuilder();
    }

    public static class BusPassengerBuilder {
        private final BusPassenger instance;

        private BusPassengerBuilder() {
            this.instance = new BusPassenger();
        }

        public BusPassenger build() {
            return instance;
        }

        public BusPassengerBuilder type(BusPassengerType type) {
            instance.type = type;
            return this;
        }

        public BusPassengerBuilder adult() {
            instance.type = BusPassengerType.ADULT;
            return this;
        }
        public BusPassengerBuilder child() {
            instance.type = BusPassengerType.CHILD;
            return this;
        }
        public BusPassengerBuilder beneficiary() {
            instance.type = BusPassengerType.BENEFICIARY;
            return this;
        }

        public BusPassengerBuilder id(int id) {

            instance.id = id;

            return this;
        }
    }
}
