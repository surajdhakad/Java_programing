package Feb_17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

class Hospital {
    private int hospitalCode;
    private String hospitalName;
    private List<String> listOfTreatments;
    private String contactPerson;
    private String contactNumber;
    private String location;

    public Hospital(int hospitalCode, String hospitalName, List<String> listOfTreatments, String contactPerson,
                    String contactNumber, String location) {
        this.hospitalCode = hospitalCode;
        this.hospitalName = hospitalName;
        this.listOfTreatments = listOfTreatments;
        this.contactPerson = contactPerson;
        this.contactNumber = contactNumber;
        this.location = location;
    }

    public int getHospitalCode() {
        return hospitalCode;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public List<String> getListOfTreatments() {
        return listOfTreatments;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Hospital [hospitalCode=" + hospitalCode + ", hospitalName=" + hospitalName + ", listOfTreatments="
                + listOfTreatments + ", contactPerson=" + contactPerson + ", contactNumber=" + contactNumber
                + ", location=" + location + "]";
    }
}

class HospitalService {
    private List<Hospital> hospitals = new ArrayList<>();
    private int nextHospitalCode = 1; 

    public int addHospital(String hospitalName, List<String> listOfTreatments, String contactPerson, String contactNumber, String location) {
        Hospital hospital = new Hospital(nextHospitalCode++, hospitalName, listOfTreatments, contactPerson, contactNumber, location);
        hospitals.add(hospital);
        return hospital.getHospitalCode();
    }

    public Map<Integer, String> getHospitals() {
        Map<Integer, String> hospitalMap = new HashMap<>();
        for (Hospital hospital : hospitals) {
            hospitalMap.put(hospital.getHospitalCode(), hospital.getHospitalName());
        }
        return hospitalMap;
    }

    public Hospital getHospitalDetails(int hospitalCode) {
        for (Hospital hospital : hospitals) {
            if (hospital.getHospitalCode() == hospitalCode) {
                return hospital;
            }
        }
        return null; 
    }
}

public class Hospital_mange {
    public static void main(String[] args) {
        HospitalService hospitalService = new HospitalService();

        int code1 = hospitalService.addHospital("YASHODA", Arrays.asList("Cardiac", "ENT", "Ortho", "Pediatric", "Gastro"), "MATHEWS", "9848222222", "Sec");
        int code2 = hospitalService.addHospital("MAX", Arrays.asList("Cardiac", "Neuro"), "JOHN", "9848222223", "North");

        System.out.println("Hospitals: " + hospitalService.getHospitals());

        Hospital hospitalDetails = hospitalService.getHospitalDetails(code1);
        if (hospitalDetails != null) {
            System.out.println("Details of Hospital Code " + code1 + ": " + hospitalDetails);
        } else {
            System.out.println("Hospital not found.");
        }
    }
}