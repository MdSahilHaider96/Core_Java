package August27th;

public class ClassRoom {
    //3.	Create a class Room having member variables roomId, floorNum, seatCapacity. create getters and  setters for all member variables. Create
    //		object of Room class in other class inside main method and set all member values and print all member values using getters.
    private int roomid;
    private int floorNum;
    private int seatCapacity;

    public int getRoomid() {
        return roomid;
    }

    public void setRoomid(int roomid) {
        this.roomid = roomid;
    }

    public int getFloorNum() {
        return floorNum;
    }

    public void setFloorNum(int floorNum) {
        this.floorNum = floorNum;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    public void setSeatCapacity(int seatCapacity) {
        this.seatCapacity = seatCapacity;
    }
    public void display(){
        System.out.println(this.roomid);
        System.out.println(this.seatCapacity);
        System.out.println(this.floorNum);
    }
}
