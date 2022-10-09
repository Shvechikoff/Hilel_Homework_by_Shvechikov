package ItHilel.HW16;

public class Person {
    private String fName;
    private int dateOfBirth;
    private String mail;
    private String phone;
    private String lName;
    private int weight;
    private int pressure;
    private int countOfSteps;

    public Person(String fName, int dateOfBirth, String mail, String phone
            , String lName, int weight, int pressure, int countOfSteps) {
        this.fName = fName;
        this.dateOfBirth = dateOfBirth;
        this.mail = mail;
        this.phone = phone;
        this.lName = lName;
        this.weight = weight;
        this.pressure = pressure;
        this.countOfSteps = countOfSteps;
    }

    public String getfName() {
        return fName;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public String getMail() {
        return mail;
    }

    public String getPhone() {
        return phone;
    }

    public String getlName() {
        return lName;
    }

    public int getWeight() {
        return weight;
    }

    public int getPressure() {
        return pressure;
    }

    public int getCountOfSteps() {
        return countOfSteps;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void setCountOfSteps(int countOfSteps) {
        this.countOfSteps = countOfSteps;
    }

    @Override
    public String toString() {
        return "Person information: " +
                "name = " + fName +
                ", date = " + dateOfBirth +
                ", mail = " + mail +
                ", phone = " + phone +
                ", secondName = " + lName +
                ", weight = " + weight +
                ", pulse = " + pressure +
                ", steps = " + countOfSteps;
    }
}


