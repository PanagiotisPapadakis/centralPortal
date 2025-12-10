package com.example.centralPortal.modelCopy;




import java.time.LocalDate;

 public class PropertyApartment {
    private Integer id;
    private String property_id;
    private String address;
    private Integer price;
    private String property_type;
    private Integer bedrooms;
    private Integer bathrooms;
    private Integer square_feet;
    private LocalDate listed_date;

    public PropertyApartment() {
    }

    public PropertyApartment(Integer id, String property_id, String address, Integer price, String property_type, Integer bedrooms, Integer bathrooms, Integer square_feet, LocalDate listed_date) {
        this.id = id;
        this.property_id = property_id;
        this.address = address;
        this.price = price;
        this.property_type = property_type;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.square_feet = square_feet;
        this.listed_date = listed_date;
    }

    @Override
    public String toString() {
        return "PropertyApartment{" +
                "id=" + id +
                ", property_id='" + property_id + '\'' +
                ", address='" + address + '\'' +
                ", price=" + price +
                ", property_type='" + property_type + '\'' +
                ", bedrooms=" + bedrooms +
                ", bathrooms=" + bathrooms +
                ", square_feet=" + square_feet +
                ", listed_date=" + listed_date +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProperty_id() {
        return property_id;
    }

    public void setProperty_id(String property_id) {
        this.property_id = property_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getProperty_type() {
        return property_type;
    }

    public void setProperty_type(String property_type) {
        this.property_type = property_type;
    }

    public Integer getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(Integer bedrooms) {
        this.bedrooms = bedrooms;
    }

    public Integer getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(Integer bathrooms) {
        this.bathrooms = bathrooms;
    }

    public Integer getSquare_feet() {
        return square_feet;
    }

    public void setSquare_feet(Integer square_feet) {
        this.square_feet = square_feet;
    }

    public LocalDate getListed_date() {
        return listed_date;
    }

    public void setListed_date(LocalDate listed_date) {
        this.listed_date = listed_date;
    }
}
