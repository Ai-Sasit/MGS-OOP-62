import java.util.List;

public class Information extends DataItem {

    public Information(){}
    public Information(double vat) { this.vat = vat; }
    
    public void reMoney(){
        History Hz = new History();
        List<Double> L = Hz.LoadDeposit();
        List<Double> W = Hz.LoadWithdraw();
        for (Double d : L) { 
            Balance = Balance + d; }
        for (Double d : W) { 
            Balance = Balance - d; }
    }

    public String getSavingMon(String Type){ 
        if (Type.contains("Low")){
            Saving = (Balance + vat) * 0.25;
        }else if (Type.contains("Medium")){
            Saving = (Balance + vat) * 0.50;
        }else if (Type.contains("High")){
            Saving = (Balance + vat) * 0.75;
        }
        return String.format("%,.2f", Saving);
    }
    public String getMon(){ 
        return String.format("%,.2f",Balance - Saving);
    }

    public String getInterest() { return String.format("%,.2f",Balance * (vat/100));}
}