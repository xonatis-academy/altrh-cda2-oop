package src.domain;

public class House extends Entity {

    private String address;

    public House(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return address;
    }

    @Override
    public boolean match(String text) {
        return address.toLowerCase().contains(text.toLowerCase());
    }
}
