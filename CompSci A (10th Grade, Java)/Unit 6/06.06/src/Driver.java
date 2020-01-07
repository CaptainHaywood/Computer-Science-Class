public class Driver {
    public static void main(String[] args) {
        DataSet ds = new DataSet();

        ds.add(1);
        ds.add(2);
        ds.add(3);

        System.out.println(ds.getAverage());
    }
}
