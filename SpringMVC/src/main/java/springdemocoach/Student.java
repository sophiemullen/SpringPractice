package springdemocoach;

import org.springframework.beans.factory.annotation.Value;

import java.util.LinkedHashMap;

public class Student {

    private String firstName;
    private String lastName;
    private String country;
//    private LinkedHashMap<String, String> countryOptions;

    public Student() {
//        countryOptions = new LinkedHashMap<>();
//        countryOptions.put("BE", "Belgium");
//        countryOptions.put("DE", "Germany");
//        countryOptions.put("FR", "France");
//        countryOptions.put("ES", "Spain");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

//    public LinkedHashMap<String, String> getCountryOptions() {
//        return countryOptions;
//    }
//
//    public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
//        this.countryOptions = countryOptions;
//    }
}
