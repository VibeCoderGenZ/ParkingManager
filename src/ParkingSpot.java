public class ParkingSpot {
    private String spotID;
    private Vehicle currentVehicle;
    private boolean isOccupied;

    // Constructor
    public ParkingSpot(String spotID) {
        this.spotID = spotID;
        this.isOccupied = false;
        this.currentVehicle = null;
    }

    // Getter
    public String getSpotID() {
        return spotID;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public Vehicle getCurrentVehicle() {
        return currentVehicle;
    }

    // truyền thông tin về xe mới vào
    public void newVehicle(Vehicle currentVehicle) {
        this.currentVehicle = currentVehicle;
        this.isOccupied = true;
    }

    // truyền thông tin khi xe đã đi
    public void removeVehicle() {
        this.currentVehicle = null;
        this.isOccupied = false;
    }
}