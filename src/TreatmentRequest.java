public class TreatmentRequest {
    int patientId;
    long arrivalTime;

    public TreatmentRequest(int patientId) {
        this.patientId = patientId;
        this.arrivalTime = System.currentTimeMillis();


    }
    public String toString() {  //To convert an object to a String
        return "PatientID=" + patientId + ", time=" + arrivalTime;
    }
}
