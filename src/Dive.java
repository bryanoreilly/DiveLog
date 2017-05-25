import com.sun.deploy.util.SystemUtils;


/**
 * Created by bryan.oreilly on 5/24/17.
 */
public class Dive {

    private int diveNumber;
    //private Date date;
    private String location;
    private double maxDepth;
    //private Time time;
    private String divePlannerType;
    private double visibility;
    private double temperature;
    private double weight;
    //private List<String> exposureProtection;
    //private List<> conditions;
    private double startPressure;
    private double endPressure;
    private double timeIn;
    private double timeOut;
    private String comments;


    public Dive() {
    }

    public Dive(int diveNumber, String location, double maxDepth, String divePlannerType, double visibility, double temperature, double weight, double startPressure, double endPressure, double timeIn, double timeOut, String comments) {
        this.diveNumber = diveNumber;
        this.location = location;
        this.maxDepth = maxDepth;
        this.divePlannerType = divePlannerType;
        this.visibility = visibility;
        this.temperature = temperature;
        this.weight = weight;
        this.startPressure = startPressure;
        this.endPressure = endPressure;
        this.timeIn = timeIn;
        this.timeOut = timeOut;
        this.comments = comments;
    }

    public int getDiveNumber() {
        return diveNumber;
    }

    public void setDiveNumber(int diveNumber) {
        this.diveNumber = diveNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getMaxDepth() {
        return maxDepth;
    }

    public void setMaxDepth(double maxDepth) {
        this.maxDepth = maxDepth;
    }

    public String getDivePlannerType() {
        return divePlannerType;
    }

    public void setDivePlannerType(String divePlannerType) {
        this.divePlannerType = divePlannerType;
    }

    public double getVisibility() {
        return visibility;
    }

    public void setVisibility(double visibility) {
        this.visibility = visibility;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getStartPressure() {
        return startPressure;
    }

    public void setStartPressure(double startPressure) {
        this.startPressure = startPressure;
    }

    public double getEndPressure() {
        return endPressure;
    }

    public void setEndPressure(double endPressure) {
        this.endPressure = endPressure;
    }

    public double getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(double timeIn) {
        this.timeIn = timeIn;
    }

    public double getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(double timeOut) {
        this.timeOut = timeOut;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }


    public String diveToString(){
        String returnValue;
        returnValue = "Dive number: " + Double.toString(diveNumber);
        returnValue += "\nLocation: " + location;
        returnValue += "\nMax Depth: " + Double.toString(maxDepth);
        returnValue += "\nDive Planner Type: " + divePlannerType;
        returnValue += "\nVisibility: " + Double.toString(visibility);
        returnValue += "\nTemperature: " + Double.toString(temperature);
        returnValue += "\nWeight: " + Double.toString(weight);
        returnValue += "\nStarting Pressure: " + Double.toString(startPressure);
        returnValue += "\nFinal Pressure: " + Double.toString(endPressure);
        returnValue += "\nTime In: " + Double.toString(timeIn);
        returnValue += "\nTime Out: " + Double.toString(timeOut);
        returnValue += "\nComments: " + comments;
        return returnValue;
    }

//    public static void main(String[] args){
//        Dive dive1 = new Dive(1, "Devil's Den", 25, "Computer", 40, 68, 12, 3000, 1500, 10.6, 11.2, "It was great fun!");
//        System.out.println(dive1.diveToString());
//    }
}
