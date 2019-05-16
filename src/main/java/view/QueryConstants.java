package view;

public interface QueryConstants {
    String SELECT_FROM_VISIT = "select * from visit";
    String SELECT_FROM_PATIENT = "select * from patient";
    String SELECT_FROM_PATIENT_DOCTOR = "select * from patient_doctor_link";
    String SELECT_FROM_DOCTOR = "select * from doctor";

    String SELECT = "SELECT patient.p_id, patient.p_surname,\n" +
            "       patient.p_first_name, patient.p_second_name,\n" +
            "       patient.med_card_id, doctor.d_id, \n" +
            "       doctor.d_surname, doctor.d_first_name,\n" +
            "       doctor.d_second_name FROM patient join patient_doctor_link on patient.p_id = patient_doctor_link.p_id\n" +
            "       JOIN doctor on patient_doctor_link.d_id = doctor.d_id;";

    String SELECT_JOIN = "select * from patient \n" +
            "left join visit on patient.med_card_id = visit.mc_id\n" +
            "group by patient.med_card_id;";
}
