package exc22_Car;

public class Car {

    private final static int CAR_START_OK = 100;
    private final static int START_NOK_ENGINE = 200;
    private final static int START_NOK_FUEL = 300;
    private final static int START_OK_FUEL_OPEN = 400;
    private final static int START_OK_DOOR_OPEN = 500;

    private int fuelLevel;
    private boolean engienOk;
    private boolean fuelClose;
    private boolean doorClose;
    private boolean engineWorking;

    public Car(int fuelLevel, boolean engienOk, boolean fuelClose, boolean doorClose, boolean engineWorking) {
        this.fuelLevel = fuelLevel;
        this.engienOk = engienOk;
        this.fuelClose = fuelClose;
        this.doorClose = doorClose;
        this.engineWorking = engineWorking;
    }

    public void status () {
        if(checkFuelLevel() && engienOk && fuelClose && doorClose ) {
            System.out.println("Wszystkie systemy sprawne");
        }
        if (!engienOk ) {
            System.out.println("Silnik niesprawny");
        }
        if (!fuelClose ) {
            System.out.println("Bak otwarty");
        }
        if (!doorClose ) {
            System.out.println("Drzwi otwarte");
        }
        if (!checkFuelLevel() ) {
            System.out.println("Brak paliwa");
        }

    }
    public void start () {
        int startStatus = tryStart();
        printStartInfo (startStatus);
    }

    private void printStartInfo(int startStatus) {
    switch (startStatus){
        case CAR_START_OK -> System.out.println("Samochod udalo sie uruchomic");
        case START_NOK_ENGINE -> System.out.println("Awaria silnika");
        case START_NOK_FUEL -> System.out.println("Brak paliwa");
        case START_OK_DOOR_OPEN -> System.out.println("Samochod udalo sie uruchomic, drzwi otwarte");
        case START_OK_FUEL_OPEN -> System.out.println("Samochod udalo sie uruchomic, bak otwarty");
        default -> System.out.println("Błędny status");
    }


    }

    private int tryStart() {
        if (checkFuelLevel() && engienOk && fuelClose && doorClose && !engineWorking) {
            engineWorking=true;
            return CAR_START_OK;
        }
        else if (!engienOk ) return START_NOK_ENGINE;
        else if (!checkFuelLevel() ) return START_NOK_FUEL;
        else if (checkFuelLevel() && engienOk && !fuelClose && doorClose && !engineWorking ){
            engineWorking=true;
            return START_OK_FUEL_OPEN;
        }
        else if (checkFuelLevel() && engienOk && fuelClose && !doorClose && !engineWorking ){
            engineWorking=true;
            return START_OK_DOOR_OPEN;
        }
        else return 0;
    }

    private boolean checkFuelLevel (){
        return fuelLevel>0;
    }


}
