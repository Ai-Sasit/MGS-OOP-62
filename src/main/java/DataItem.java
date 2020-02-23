public class DataItem {
    protected double vat = 0,AVG,avgtemp,Saving;
    protected static double Balance = 0,Interest = 0;
    protected static double Inter;

    public void setInter(String vat){
        DataItem.Inter = Double.parseDouble(vat);
    }
    public double getInter(){
        return Inter;
    }

}