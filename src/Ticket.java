import java.time.LocalDateTime;

public class Ticket {
    private final int ticketID;
    private static int ticketCounter = 0;
    private final Vehicle currentVehicle;
    private final LocalDateTime timeIn;
    private LocalDateTime timeOut;
    private final ParkingSpot spot;
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
        return timeOut == null;
    }

    // ==================== Tính Giá Tiền =========================
    public void feeCaculator() {
        // ?????? muốn tính giá theo 2 cách theo giờ và theo lượt để làm sao
        // app sẽ hỗ trợ thêm cả tính tổng doanh thu theo thời gian nhất định nữa ?
    }
}
