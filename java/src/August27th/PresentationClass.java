package August27th;

public class PresentationClass {
    //2.	Create a class Presentation having member variables presentationId, bookedCompanyId, bookedRoomId, startTime, endTime. Create getters and
    //		setters for all member variables. Create object of Presentation class in other class inside main method and set all member values and print
    //		all member values using getters.
   int presentationId;
   int bookedCompanyId;
   int bookedRoomId;
   int startTime;
   int endTime;

    public int getPresentatiodId() {
        return presentationId;
    }

    public void setPresentatiodId(int presentatiodId) {
        this.presentationId = presentatiodId;
    }

    public int getBookedCompanyId() {
        return bookedCompanyId;
    }

    public void setBookedCompanyId(int bookedCompanyId) {
        this.bookedCompanyId = bookedCompanyId;
    }

    public int getBookedRoomId() {
        return bookedRoomId;
    }

    public void setBookedRoomId(int bookedRoomId) {
        this.bookedRoomId = bookedRoomId;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }
}
