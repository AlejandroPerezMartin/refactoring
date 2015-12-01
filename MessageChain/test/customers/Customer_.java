package customers;

import org.junit.Test;
import places.Address;
import places.City;
import places.Continent;
import places.Country;

import static org.junit.Assert.assertTrue;

public class Customer_ {

    @Test
    public void should_be_able_to_check_if_is_european() {
        Customer customer = new Customer("Carlos Acosta")
                .address(new Address()
                        .postalCode("35011")
                        .city(new City("Barcelona", new Country("España", Continent.EUROPE))));

        assertTrue(customer.isEuropean());
    }

}
