package rocks.zipcode.io.quiz3.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {
    String name;
    LabStatus status;
    public Lab() {
    }

    public Lab(String labName) {
        this.name = labName;
    }

    public String getName() {
        return name;
    }

    public void setStatus(LabStatus labStatus) {
        status = labStatus;
    }

    public LabStatus getStatus() {
        return status;
    }
}
