package model.services;

import model.entity.Patient;
import model.entity.Visit;

import java.util.List;

public interface VisitsCreator {
    List<Visit> createVisit(List<Visit> visits, Patient patient);
}
