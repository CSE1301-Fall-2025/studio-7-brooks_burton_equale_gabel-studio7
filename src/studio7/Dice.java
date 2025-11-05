public class Dice {

    private int sideNum;

    public Dice(int sideNum){

        this.sideNum = sideNum;

    }
    public int ranNum(){

        int ranNum = (int)(this.sideNum * (Math.random())+1);

        return ranNum;


    }
    public static void main(String[] args){
        Dice n = new Dice(6);

        System.out.print(n.ranNum());
    }
}

