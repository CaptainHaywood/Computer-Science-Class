import java.util.*;

public class DataSet {
    private ArrayList<Integer> values = new ArrayList<Integer>();

    public void add(int num){
        values.add(num);
    }

    public int getMin(){
        return Collections.min(values);
    }

    public int getMax(){
        return Collections.max(values);
    }

    public int getRange() {
        return Collections.max(values) - Collections.min(values);
    }

    public double getMedian(){
        if(values.size() % 2 == 0){
            double lower = values.size() / 2 - 1;
            double upper = values.size() / 2 + 1;
            return values.get((int) (upper / lower));
        }
        else{
            return values.get(values.size() / 2);
        }

    }

    public int getFrequency(int num){
        int count = values.size();
        int iteration = 0;
        int res = 0;

        while(iteration < count){
            if(values.get(iteration) == num){
                res++;
            }
            iteration++;
        }
        return res;
    }

    public int getMaxFrequency(){
        int maximum = 0;
        for (int i = 0; i < values.size(); i++) {
            int count = 0;
            for (int j = 0; j < values.size(); j++) {
                if (values.get(i) == values.get(j))
                    count++;
            }
            if (count >= maximum)
                maximum = count;
        }
        return maximum;
    }

    public boolean hasMode(){
        int count = values.size();
        int iteration = 0;

        while(iteration < count){
            if(getFrequency(values.get(iteration)) != 1){
                return true;
            }
            iteration++;
        }
        return false;
    }

    public int[] getMode(){
        ArrayList<Integer> result = new ArrayList<Integer>();
        int[] res = new int [3];

        int count = values.size();
        int iteration = 0;

        while(iteration < count){
            if(getFrequency(values.get(iteration)) != 1 && getFrequency(values.get(iteration)) == getMaxFrequency()){
                if(result.contains(values.get(iteration)) == false){
                    result.add(values.get(iteration));
                }
            }
            iteration++;
        }

        count = result.size();
        iteration = 0;

        while(iteration < count){
            res[iteration] = result.get(iteration);
            iteration++;
        }

        return res;
    }
}
