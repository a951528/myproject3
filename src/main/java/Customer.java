public class Customer {
    int id; //
    int consumption;
    //int openPoint;
    float off = 0.1f;

    public Customer(){

    }

    public Customer(int id,int consumption){
        this.id = id;
        this.consumption = consumption;
    }

    public float GetEndmoney(){
        return consumption - (consumption/1000)*off*1000;
    }


    public void print(){

        //float Endmoney = consumption - (consumption/1000)*off*1000;
        //float openPoint = consumption - Endmoney;

        float offmoney = consumption - GetEndmoney();
        System.out.print(id + "\t" + consumption + "\t" + GetEndmoney());

    }

    /*
    public int cost (int consumption){
        return (int) (consumption*0.9);
    }

     */



}
