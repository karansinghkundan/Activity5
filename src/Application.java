import javax.naming.Name;

public class Application {
    Product st[] = {new Product (1,100.00,"karan",12.0),new Product(2,55.00,"varun",33.00)};

    public double findPrice(String name) {
        for (Product p : st) {
            if (p.getName().equalsIgnoreCase(name)) {
                if (p.chkDiscount() != p.getPrice()) {
                    return p.chkDiscount();
                }
                return p.getPrice();
            }
        }
        return 0.0;
    }
        public int chkStock()
        {
            int stockcount = 0;
            for(Product p : st)
            {
                if(!p.chkStock())
                {
                    stockcount++;
                }

            }
            return stockcount;

        }



    }
