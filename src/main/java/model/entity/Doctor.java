package model.entity;

public class Doctor {
    private int doctorId;
    private String doctorSurname;
    private String doctorFirstName;
    private String doctorSecondName;

    public Doctor(int doctorId, String doctorSurname, String doctorFirstName, String doctorSecondName) {
        this.doctorId = doctorId;
        this.doctorSurname = doctorSurname;
        this.doctorFirstName = doctorFirstName;
        this.doctorSecondName = doctorSecondName;
    }

    public Doctor() {
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorSurname() {
        return doctorSurname;
    }

    public void setDoctorSurname(String doctorSurname) {
        this.doctorSurname = doctorSurname;
    }

    public String getDoctorFirstName() {
        return doctorFirstName;
    }

    public void setDoctorFirstName(String doctorFirstName) {
        this.doctorFirstName = doctorFirstName;
    }

    public String getDoctorSecondName() {
        return doctorSecondName;
    }

    public void setDoctorSecondName(String doctorSecondName) {
        this.doctorSecondName = doctorSecondName;
    }
}

