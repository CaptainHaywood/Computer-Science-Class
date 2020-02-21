import java.util.Arrays;

public class ArrayMethods {
    private int[] values;
    public ArrayMethods(int[] initialValues) {values = initialValues;}

    public String getValues(){
        String ret = Arrays.toString(values);
        ret = ret.replace("[", "");
        ret = ret.replace("]", "");
        ret = ret.replace(",", "");
        ret = ret + " ";
        return ret;
    }

    public void swapFirstAndLast(){
        int first = values[0];
        int last = values[values.length - 1];
        values[0] = last;
        values[values.length - 1] = first;
    }

    public void shiftRight(){
        int last = values[values.length - 1];

        for( int index =values.length - 2; index >= 0 ; index-- )
            values[index + 1] = values [index];

        values[0] = last;
    }

    public void replaceEvens(){
        int count = values.length;
        int iteration = 0;
        while (iteration < count){
            if(values[iteration] % 2 == 0){
                values[iteration] = 0;
            }
            iteration++;
        }
    }

    public void replaceWithLargerNeighbors(){
        int[] result = new int[values.length];
        for (int i = 0; i < values.length; ++i) {
            if (i == 0 || i == values.length - 1) {
                result[i] = values[i];
            } else {
                result[i] = Math.max(values[i-1], values[i+1]);
            }
        }
        values = result;
    }

    public void removeMiddle(){
        int middleStart = (values.length - 1) / 2;
        int middleEnd = (values.length - 1) - middleStart;
        int elementsToRemove = middleEnd - middleStart + 1;

        int[] result = new int[values.length - elementsToRemove];
        System.arraycopy(values, 0, result, 0, middleStart);
        System.arraycopy(values, middleEnd + 1, result, middleStart, middleStart);
        values = result;
    }

    public void moveEvensInFront(){
        /*int oddCount = 0;
        int evenCount = 0;

        int count = values.length;
        int iteration = 0;
        while(iteration < count){
            if(values[iteration] % 2 == 0 || values[iteration] == 0){
                evenCount++;
            }
            else{
                oddCount++;
            }
            iteration++;
        }

        int[] evens = new int[evenCount];
        int[] odds = new int[oddCount];

        count = evens.length;
        iteration = 0;
        while(iteration < count){
            if(values[iteration] % 2 == 0 || values[iteration] == 0){
                if(iteration < evens.length + 1){
                    evens[iteration] = values[iteration];
                }
            }
            iteration++;
        }

        count = evens.length;
        iteration = 0;
        while(iteration < count){
            if(values[iteration] % 2 != 0){
                if(iteration < odds.length + 1){
                    odds[iteration] = values[iteration];
                }
            }
            iteration++;
        }


        int aLen = evens.length;
        int bLen = odds.length;
        int[] result = new int[aLen + bLen];

        System.arraycopy(evens, 0, result, 0, aLen);
        System.arraycopy(odds, 0, result, aLen, bLen);

        values = result;*/
        int temp = 0;
        int a = 0;
        for(int i = 0; i < values.length; i++){
            if(values[i] % 2 == 0){

                for (int j = i; j>a; j--){
                    temp = values[j - 1];
                    values[j - 1] = values[j];
                    values[j] = temp;
                }
                a++;
            }
        }
    }

    public int getSecondLargest(){
        int num;
        for (int i = 0; i < values.length; i++)
        {
            for (int j = i + 1; j < values.length; j++)
            {
                if (values[i] > values[j])
                {
                    num = values[i];
                    values[i] = values[j];
                    values[j] = num;
                }
            }
        }
        return values[values.length-2];
    }

    public boolean isAscendingOrder(){
        for(int i = 1; i < values.length; i++)
        {
            if(values[i - 1] > values[i])
                return false;
        }
        return true;
    }

    public boolean containsAdjacentDuplicates(){
        Arrays.sort(values);

        for (int i = 1; i < values.length; i++)
            if (values[i] - values[i-1] > 1){
                return false;
            }
        return true;
    }

    public boolean containsDuplicates(){
        for (int i = 0; i < values.length; i++) {
            for (int j = i + 1; j < values.length; j++) {
                if (values[i] == (values[j])) {
                    return true;
                }
            }
        }

        return false;
    }
}
