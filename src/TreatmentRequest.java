public class TreatmentRequest {
    int patientId;
    long arrivalTime;
    boolean priority;

    public TreatmentRequest(int patientId, boolean priority) {
        this.patientId = patientId;
        this.arrivalTime = System.currentTimeMillis();
        this.priority = priority;
    }

    @Override // I learned in class
    public String toString() {  //To convert an object to a String
        return "PatientID=" + patientId  +  "priority=" + priority+ ", time=" + arrivalTime;
    }
}
