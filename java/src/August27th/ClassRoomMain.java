package August27th;

public class ClassRoomMain extends  ClassRoom
{
    public static void main(String[] args) {
        ClassRoom classRoom= new ClassRoom();
        classRoom.setSeatCapacity(100);
        classRoom.setRoomid(10);
        classRoom.setFloorNum(4);
        classRoom.display();
    }
}
