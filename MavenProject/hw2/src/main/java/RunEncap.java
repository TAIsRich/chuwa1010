public class RunEncap {
    public static void main(String args[]){
        encapsulation encap = new encapsulation();
        encap.setName("Shino");
        encap.setId("001");
        encap.setScore(100);
        
        System.out.print("Name:"+encap.getName()+" Id: "+encap.getId()+" Score: "+encap.getScore());
    }
}
