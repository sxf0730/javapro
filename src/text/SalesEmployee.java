package text;

public  class  SalesEmployee extends ColaEmployee {
    private int sale;
    private double royaltyrate;
public SalesEmployee(int sale,double royaltyrate,String name,int month){
    super(name,month);
    this.sale=sale;
    this.royaltyrate=royaltyrate;
}
    @Override
    public double getSalary(int month) {

        return sale*royaltyrate;
    }
}
