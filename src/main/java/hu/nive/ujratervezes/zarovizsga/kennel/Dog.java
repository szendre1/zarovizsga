package hu.nive.ujratervezes.zarovizsga.kennel;

 abstract public class Dog {
    private String name;
    private  int happiness=0;

    public Dog(String name) {
        this.name = name;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public String getName() {
        return name;
    }

    public int getHappiness() {
        return happiness;
    }



  //  public abstract void play(int hours);



    public void play(int hours){

    }

    public void feed(){

    }

}
