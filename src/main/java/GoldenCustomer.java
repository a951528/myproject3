
public class GoldenCustomer extends SilverCustomer{

    public GoldenCustomer(int id,int consumption){
        super(id,consumption);
    }

    public float Getpoint(){
        return (consumption/1000)*2*off*1000;
    }

    public void print(){
        System.out.print(id + "\t" + consumption + "\t" + GetEndmoney()+ "\t" + Getpoint());

    }

}
