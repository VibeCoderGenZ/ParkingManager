import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private String lotName;
    private List<ParkingZone> listZones;

    // Contructors
    public ParkingLot(String lotName) {
        this.lotName = lotName;
        this.listZones = new ArrayList<>();
    }

    // Thêm Zone mới bằng tên
    public void addZones(String zoneId) {
        listZones.add(new ParkingZone(zoneId));
    }

    // Getter
    public String getName() {
        return lotName;
    }

    public List<ParkingZone> getZones() {
        return listZones;
    }
}
