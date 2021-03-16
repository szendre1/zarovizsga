package hu.nive.ujratervezes.zarovizsga.kennel;

public class Husky extends Dog{
    public Husky(String name) {
        super(name);
    }

    @Override
    public void play(int hours){
        this.setHappiness(this.getHappiness()+(hours*3));
    }


    @Override
    public void feed(){
        super.setHappiness(super.getHappiness()+4);
    }
}
