package com.example.lab08;

import java.util.ArrayList;
import java.util.List;
// testing CI
public class CustomList {
    private List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }
    public boolean hasCity(City city) {
        return cities.contains(city);
    }


    public int countCities() {
        return cities.size();
    }

    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    } //del test passes
    // Will be implemented later using TDD (leave blank for now)
    // public boolean hasCity(City city) { ... }
}
