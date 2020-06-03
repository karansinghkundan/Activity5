public class Product {
    private int no;
    private double cost;
    private String Name;
    private double stock;

    public Product(int no, double cost, String name, double stock) {
        this.no = no;
        this.cost = cost;
        Name = name;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "no=" + no +
                ", cost=" + cost +
                ", Name='" + Name + '\'' +
                ", stock=" + stock +
                '}';
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public double getPrice() {
        if (cost >= 100) {
           this.cost = this.cost + (0.3 * this.cost);
            return this.cost;
        }
        else if (cost >= 50 && cost < 100) {
            this.cost = this.cost + (0.35 * this.cost);
            return this.cost;
        }
        else {
            this.cost = this.cost + (0.45 * this.cost);
             return this.cost;
        }
    }
    public boolean chkStock()
    {
        if(stock>10)
            return true;
        else
            return false;
    }
public double chkDiscount()
{
    if(getPrice()>=100) {
        this.cost = this.cost - (0.05 * cost);
        return cost;
    }
    else if(getPrice()>=40 && cost<100) {
        cost = cost - (0.04 * cost);
        return cost;
    }
    else
        return 0;

    }
}











