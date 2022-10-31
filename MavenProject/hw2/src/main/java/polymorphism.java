public class polymorphism extends encapsulation{
    @Override
    public void setScore(int newScore){
        int score = newScore / 100 * 4;
        System.out.println(score);
    }
}
