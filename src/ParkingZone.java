import java.util.ArrayList;
import java.util.List;

public class ParkingZone {
    private String zoneId;
    private List<ParkingSpot> listSpots;

    // Contructors
    public ParkingZone(String zoneId) {
        this.zoneId = zoneId;
        this.listSpots = new ArrayList<>();
    }

    // Thêm spot mới
    public void addSpots(int numberOfNewSpots) {
        int currentSize = listSpots.size();
        for (int i = 1; i <= numberOfNewSpots; i++) {
            String spotId = zoneId + "-" + (currentSize + i);
            listSpots.add(new ParkingSpot(spotId));
        }
    }

    // Getter
    public int getTotalSpots() {
        return listSpots.size();
    }

    public String getZoneId() {
        return zoneId;
    }

    public List<ParkingSpot> getSpots() {
        return listSpots;
    }
}
