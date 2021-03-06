package garage;

public class Receipt {
    private String repairTyp;
    private double totalPrice;
    private int count;
    private double price;

    public Receipt(String repairTyp, double price, int count) {
        this.repairTyp = repairTyp;
        totalPrice = price * count;
        this.count = count;
        this.price = price;
    }

    public void printReceipt() {
        System.out.printf("Typ naprawy %s , ilość %d, cena %.2fzł łączna cena %.2fzł\n",
                repairTyp,count,price,totalPrice );
       // String.format()
    }

    public int getCount() {
        return count;
    }
}
