package classes;

public class Doc {
    private String name;
    private String idNumber;
    private String especiality;
    private int numberRoom;
    private int docotorId;
    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
        THURSDAY, FRIDAY, SATURDAY
    }
    Doc(){
        System.out.println("construcotr del doctor");
    }
    public Doc(String name, String idNumber, String speciallity, int numberRoom, int docotorId){
        this.name = name;
        this.idNumber = idNumber;
        this.especiality = speciallity;
        this.numberRoom = numberRoom;
        this.docotorId = docotorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getEspeciality() {
        return especiality;
    }

    public void setEspeciality(String especiality) {
        this.especiality = especiality;
    }

    public int getNumberRoom() {
        return numberRoom;
    }

    public void setNumberRoom(int numberRoom) {
        this.numberRoom = numberRoom;
    }

    public int getDocotorId() {
        return docotorId;
    }

    public void setDocotorId(int docotorId) {
        this.docotorId = docotorId;
    }
}
