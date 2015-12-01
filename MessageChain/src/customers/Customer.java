package customers;

import places.Address;

public class Customer {
    
    private final String name;
    private Address address;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public Customer address(Address address) {
        this.address = address;
        return this;
    }

    boolean isEuropean() {
        return getAddress().isInEurope();
    }

}
