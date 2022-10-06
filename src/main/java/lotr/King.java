package lotr;

import lotr.Nobel;

public class King extends Nobel {
    public King(){
        super(5, 15, 5, 15);
    }
    @Override
    public int getPower(){
        if (super.getPower() < 5){
            return 5;
        } else if (super.getPower() > 15) {
            return 15;
        }
        return super.getPower();
    }
    @Override
    public void setPower(int power){
        if (power < 5){
            super.setPower(5);
        } else if (power > 15) {
            super.setPower(15);
        }
        else{
            super.setPower(power);
        }
    }
}
