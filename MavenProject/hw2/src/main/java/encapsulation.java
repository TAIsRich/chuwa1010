public class encapsulation {
    private String student;
    private String id;
    private int score;

    public encapsulation(){

    }

    public int getScore(){
        return score;
    }

    public String getName(){
        return student;
    }

    public String getId(){
        return id;
    }

    public void setScore( int newScore){
        score = newScore;
    }

    public void setName( String newName){
        student = newName;
    }

    public void setId ( String newId){
        id = newId;
    }
}
