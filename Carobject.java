class Fan {
    private boolean isOn; // निजी वेरिएबल

    public void turnOn() {
        isOn = true;
        System.out.println("Fan is turned on.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Fan is turned off.");
    }

    public boolean isFanOn() {
        return isOn;
    }
}

public class Carobject {
    public static void main(String[] args) {
        Fan myFan = new Fan();

        myFan.turnOn();
        System.out.println("Is fan on? " + myFan.isFanOn());

        myFan.turnOff();
        System.out.println("Is fan on? " + myFan.isFanOn());
    }
}
