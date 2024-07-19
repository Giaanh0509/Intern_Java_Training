package Practice3;

public class VehicleOwner {
    private String idNumber;
    private String fullName;
    private String email;

    public VehicleOwner(String idNumber, String fullName, String email) {
        this.idNumber = idNumber;
        this.fullName = fullName;
        this.email = email;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
