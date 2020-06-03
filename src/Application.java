public class Application {
    Product st[] = {new Product (1,100.00,"karan",12.0),new Product(2,55.00,"varun",33.00)};
}
    public double findPrice(String pName)
    {
        for(int i=0;i<Productst.length;i++)
            if(pName.equalsIgnoreCase(stProduct[i].getName()))
                return stProduct[i].getPrice();
        return '0';
    }

    public int findProduct(int stock)
    {
        for(int i=0;i<stProduct.length;i++)
            if(stock==stProduct[i].getNo() && stock<10)
                return stProduct[i].getNo();
        return -1;
    }


}
