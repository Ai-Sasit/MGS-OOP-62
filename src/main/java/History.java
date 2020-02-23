import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

class History {

    BufferedReader CSVR1,CSVR2,CSVR3;
    String raw1,raw2,raw3;
    protected static FileWriter CSV1,CSV2,CSV3;
    String pattern = "dd-MM-yyyy | HH:mm";
    SimpleDateFormat simpleDateFormat =new SimpleDateFormat(pattern, new Locale("us", "US"));
    String date = simpleDateFormat.format(new Date());
    
    static{
        try {
        CSV1 = new FileWriter("HistoryList.biz",true);
        CSV2 = new FileWriter("Deposit.biz",true);
        CSV3 = new FileWriter("Withdraw.biz",true);
        } catch (IOException e) {}
    }
    public void SaveHistory(int index,char Type, double Money) {

        if (Type == 'D') {
            try {
                CSV1.append(String.format("%d , %20.1f , %20s , %20s\n", index, Money, "Disposit",date));
                CSV1.flush();
                CSV2.append(Money+"\n");
                CSV2.flush();
            } catch (IOException e) {}
        } else if (Type == 'W') {
            try {
                CSV1.append(String.format("%d , %20.1f , %20s , %20s\n", index, Money, "Withdraw",date));
                CSV1.flush();
                CSV3.append(Money+"\n");
                CSV3.flush();
            } catch (IOException e) {}
        }
    }

    public List<String> LoadHistory() {
        List<String> list = new ArrayList<String>();
        try {
            CSVR1 = new BufferedReader(new FileReader("HistoryList.biz"));
            while ((raw1 = CSVR1.readLine()) != null) { list.add(raw1); }
            CSVR1.close();
        } catch (FileNotFoundException e) {} catch (IOException e) {}
        return list;
    }
    public List<Double> LoadDeposit(){
        List<Double> LD = new ArrayList<Double>();
        try {
            CSVR2 = new BufferedReader(new FileReader("Deposit.biz"));
            while ((raw2 = CSVR2.readLine()) != null) { LD.add(Double.parseDouble(raw2));}
        } catch (FileNotFoundException e) {} catch (IOException e) {}
        return LD;
    }
    public List<Double> LoadWithdraw(){
        List<Double> LW = new ArrayList<Double>();
        try {
            CSVR3 = new BufferedReader(new FileReader("Withdraw.biz"));
            while ((raw3 = CSVR3.readLine()) != null) { LW.add(Double.parseDouble(raw3)); }
        } catch (FileNotFoundException e) {} catch (IOException e) {}
        return LW;
    }
}