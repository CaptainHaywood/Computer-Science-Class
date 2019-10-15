public class Driver {
    public static void main (String[] args){
        Clicker click = new Clicker();
        click.setLimit(10);
        click.doClick();
        click.doClick();
        click.doClick();
        click.doClick();
        click.doClick();
        click.doClick();
        click.doClick();
        click.doClick();
        click.doClick();
        click.doClick();
        click.doClick();
        click.doClick();
        click.doClick();
        click.doClick();
        click.doClick();
        System.out.println("" + click.getClicks());
    }
}