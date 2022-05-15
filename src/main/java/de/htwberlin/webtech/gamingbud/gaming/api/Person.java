package de.htwberlin.webtech.gamingbud.gaming.api;

public class Person {

    private long id;
    private String firsName;
    private String lastName;
    private boolean vaccinated;

    public Person(long id, String firsName, String lastName, boolean vaccinated) {
        this.id = id;
        this.firsName = firsName;
        this.lastName = lastName;
        this.vaccinated = vaccinated;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getFirsName() {
        return firsName;
    }
    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public boolean isVaccinated() {
        return vaccinated;
    }
    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }
}
