import java.util.List;

public class Tools extends DataItem {

    public String getBalance() {return String.format("%.2f",Balance);}

    public void setBalance(char Type, double MonneyIn) {
        if (Type == 'D'){
            Balance = Balance + MonneyIn;
        }else if (Type == 'W'){
            Balance = Balance - MonneyIn;
        }
    }
    public String getAVG(){
        History Wits = new History();
        List<Double> data = Wits.LoadWithdraw();
        avgtemp = 0;
        for (double D : data){
            avgtemp = avgtemp + D;
        }
        AVG = avgtemp / data.size();
        return String.format("%.2f",AVG);
    }
    public String getCurrency(String Type, double MonneyIn) {
        if(Type.contains("US")){
            return String.format("%.3f",MonneyIn / 31.55 );
        }else if(Type.contains("EUR")){
            return String.format("%.3f",MonneyIn / 34.22);
        }else if(Type.contains("GBP")){
            return String.format("%.3f",MonneyIn / 40.87);
        }else if(Type.contains("JPY")){
            return String.format("%.3f",MonneyIn / 0.28);
        }else if(Type.contains("SGD")){
            return String.format("%.3f",MonneyIn / 22.57);
        }
        return "No input Data!";
    }
}