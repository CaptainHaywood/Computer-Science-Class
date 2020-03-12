import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DataSet {
    private List data = new ArrayList();

    public void add(double num){
        data.add(num);
    }

    public double getSmallest(){
        return (double) Collections.min(data);
    }

    public double getLargest(){
        return (double) Collections.max(data);
    }

    public double getRange(){
        return (double) Collections.max(data) - (double) Collections.min(data);
    }

    public double getAverage(){
        int count = data.size();
        int iter = 0;
        double preCalc = 0;

        while (iter != count){
            double item = (double) data.get(iter);
            preCalc = preCalc + item;
            iter++;
        }

        return preCalc / count;
    }


}
