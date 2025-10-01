import java.time.LocalDateTime;

public class Ticket {
    private int ticketID;
    private static int ticketCounter = 0;
    private Vehicle currentVehicle;
    private LocalDateTime timeIn;
    private LocalDateTime timeOut;
    private ParkingSpot spot;
    private long fee;

    // Contractor khi xe vào
    public Ticket(Vehicle currentVehicle, ParkingSpot spot) {
        this.ticketID = ticketCounter++;
        this.currentVehicle = currentVehicle;
        this.spot = spot;
        this.timeIn = LocalDateTime.now();
        this.timeOut = null;
        this.fee = 0;
    }

    // Xóa vé active khi xe ra
    public void vehicleOut() {
        this.timeOut = LocalDateTime.now();
        spot.removeVehicle();
    }

    // Getter
    public int getTicketID() {
        return ticketID;
    }

    public Vehicle getCurrentVehicle() {
        return currentVehicle;
    }

    public LocalDateTime getTimeIn() {
        return timeIn;
    }

    public LocalDateTime getTimeOut() {
        return timeOut;
    }

    public ParkingSpot getSpot() {
        return spot;
    }

    public long getFee() {
        return fee;
    }

    // xem trạng thái vé còn active
    public boolean getActive() {
        if (timeOut == null) {
            return true;
        }
        return false;
    }

    // ==================== Tính Giá Tiền =========================
    public void feeCaculator() {
        
    }
}
