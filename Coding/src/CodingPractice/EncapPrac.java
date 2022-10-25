package CodingPractice;

public class EncapPrac {
    private String name;
    private String passcode;
    private  String major;
    private  String course;

       public EncapPrac(){

}
public  EncapPrac(String name, String passcode){
    this.name = name;
    this.passcode = passcode;

}

    public EncapPrac(String name, String passcode, String major, String course) {
        this.name = name;
        this.passcode = passcode;
        this.major = major;
        this.course = course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPasscode(String passcode) {
        this.passcode = passcode;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getPasscode() {
        return passcode;
    }

    public String getMajor() {
        return major;
    }

    public String getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }
}
