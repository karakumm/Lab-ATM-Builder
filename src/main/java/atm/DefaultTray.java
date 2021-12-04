package atm;

public abstract class DefaultTray implements Tray {
    private final int BILL;
    private Tray nextTray;

    public DefaultTray(int bill) {
        this.BILL = bill;

    }
    public void process(int amount) {
        if (nextTray != null) {
            nextTray.process(amount % BILL);
        }
        else if (amount % BILL > 0) {
            throw new IllegalArgumentException();
        }
        System.out.println("extracted " + amount / BILL + " with amount of " + BILL);
    }

    public void setNext(Tray tray) {
        this.nextTray = tray;
    }
}
