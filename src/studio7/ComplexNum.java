public class ComplexNum {

    private int realNum;
    private int imgNum;

    public ComplexNum(int realNum, int imgNum){

        this.realNum = realNum;
        this.imgNum = imgNum;
    } 
    public ComplexNum Sum(ComplexNum other){

        int realSum = this.realNum + other.realNum;
        int imgNum = this.imgNum + other.imgNum;

        return new ComplexNum(realSum, imgNum);
    }
    public int Product(){


    }
}
