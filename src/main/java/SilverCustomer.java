
public class SilverCustomer extends Customer{

    public SilverCustomer(int id,int consumption){
        super(id,consumption);
    }

    public float Getpoint(){
        return (consumption/1000)*off*1000;
    }

    //Override
    public void print(){
        System.out.print(id + "\t" + consumption + "\t" + GetEndmoney()+ "\t" + Getpoint());

    }


}
