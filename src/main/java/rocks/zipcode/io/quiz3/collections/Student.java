package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    List<Lab> labs;

    public Student() {
        labs = new ArrayList<>();

    }

    public Student(List<Lab> labs) {
        this.labs = labs;
    }

    public Lab getLab(String labName) {
        for (Lab l : labs) {
            if (l.getName() == labName) {
                return l;
            }
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) throws UnsupportedOperationException {
        try {
            getLab(labName).setStatus(labStatus);
        } catch (NullPointerException e) {
            throw new UnsupportedOperationException();
        }
    }
    public void forkLab(Lab lab) {
        lab.setStatus(LabStatus.PENDING);
        labs.add(lab);
    }

    public LabStatus getLabStatus(String labName) {
        return getLab(labName).getStatus();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (int i = labs.size() - 1; i >= 0; i--) {
            Lab lab = labs.get(i);
            res.append(lab.getName() + " > " + lab.getStatus().toString());
            if (i > 0) res.append("\n");
        }
        return res.toString();
    }
}
