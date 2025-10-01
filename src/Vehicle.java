public class Vehicle {
    private VehicleType type;
    private String licensePlate;
    private String ownerName;
    private String ownerNumbers;


    //Contractor
    public Vehicle(VehicleType type, String licensePlate, String ownerName, String ownerNumbers) {
        this.type = type;
        this.licensePlate = licensePlate;
        this.ownerName = ownerName;
        this.ownerNumbers = ownerNumbers;
    }

    // Getter
    public VehicleType getType() {
        return type;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String ownerNumbers() {
        return ownerNumbers;
    }
}
