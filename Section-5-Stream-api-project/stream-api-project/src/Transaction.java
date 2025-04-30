import java.time.LocalDate;

public class Transaction {
    private int id;
    private String user;
    private LocalDate date;
    private int amount;

    public Transaction(int id, String user, LocalDate date, int amount) {
        this.id = id;
        this.user = user;
        this.date = date;
        this.amount = amount;
    }

    public int getId(){
        return id;
    }

    public String getUser(){
        return user;
    }

    public LocalDate getDate(){
        return date;
    }

    public int getAmount(){
        return amount;
    }

    @Override
    public String toString(){
        return "Transaction{"+"id="+id+", user='"+user+'\''+", date="+date+", amount="+amount+'}';
    }
}
