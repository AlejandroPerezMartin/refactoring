package places;

public class City {
    
    private final String name;
    private final Country country;

    public City(String name, Country country) {
        this.name = name;
        this.country = country;
    }

    public String name() {
        return name;
    }

    public Country country() {
        return country;
    }

    public boolean isEuropean() {
        return country().isEuropean();
    }

}
