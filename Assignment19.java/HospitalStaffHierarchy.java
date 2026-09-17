class Staff {
    protected String name;
    protected String id;

    public Staff(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void displayRole() {
        System.out.println("Role Staff");
    }
}

class Doctor extends Staff {
    private String specialization;

    public Doctor(String name, String id, String specialization) {
        super(name, id);
        this.specialization = specialization;
    }

    @Override
    public void displayRole() {
        System.out.println("Role Doctor; Specialization " + specialization);
    }
}

class Nurse extends Staff {
    private String ward;

    public Nurse(String name, String id, String ward) {
        super(name, id);
        this.ward = ward;
    }

    @Override
    public void displayRole() {
        System.out.println("Role Nurse; Ward " + ward);
    }
}

public class HospitalStaffHierarchy {
    public static void main(String[] args) {
        Staff[] staffList = {
            new Doctor("Dr. Mehta", "D101", "Cardiology"),
            new Nurse("Kavya", "N205", "ICU")
        };

        for (Staff staff : staffList) {
            staff.displayRole();
        }
    }
}
