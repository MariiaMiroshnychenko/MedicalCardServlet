package model.entity;

import java.util.List;
import java.util.Objects;

public class MedicalCard {
    private Integer mcId;
    private List<PatientVisit> visitId;
    private List<ExamResultByReferral> refResultId;
    private String finalDiagnosis;
    private String discharge;
    private Patient patient;

    public MedicalCard(Integer mcId, List<PatientVisit> visitId,
                       List<ExamResultByReferral> refResultId,
                       String finalDiagnosis, String discharge, Patient patient) {
        this.mcId = mcId;
        this.visitId = visitId;
        this.refResultId = refResultId;
        this.finalDiagnosis = finalDiagnosis;
        this.discharge = discharge;
        this.patient = patient;
    }

    public MedicalCard() {
    }

    public Integer getMcId() {
        return mcId;
    }

    public void setMcId(Integer mcId) {
        this.mcId = mcId;
    }

    public List<PatientVisit> getVisitId() {
        return visitId;
    }

    public void setVisitId(List<PatientVisit> visitId) {
        this.visitId = visitId;
    }

    public List<ExamResultByReferral> getRefResultId() {
        return refResultId;
    }

    public void setRefResultId(List<ExamResultByReferral> refResultId) {
        this.refResultId = refResultId;
    }

    public String getFinalDiagnosis() {
        return finalDiagnosis;
    }

    public void setFinalDiagnosis(String finalDiagnosis) {
        this.finalDiagnosis = finalDiagnosis;
    }

    public String getDischarge() {
        return discharge;
    }

    public void setDischarge(String discharge) {
        this.discharge = discharge;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MedicalCard that = (MedicalCard) o;
        return Objects.equals(mcId, that.mcId) &&
                Objects.equals(visitId, that.visitId) &&
                Objects.equals(refResultId, that.refResultId) &&
                Objects.equals(finalDiagnosis, that.finalDiagnosis) &&
                Objects.equals(discharge, that.discharge) &&
                Objects.equals(patient, that.patient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mcId, visitId, refResultId, finalDiagnosis, discharge, patient);
    }
}
