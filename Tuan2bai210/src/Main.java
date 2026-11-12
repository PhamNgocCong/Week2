class CentralHub{
    public void registerDevice(SmartLight light)
    {
        System.out.println("[HUB] Đang kết nối với thiết bị: " + light.getName());
    }
}
class SmartLight{
    private String id;
    private String name;
    private int brightness;
    public String getName(){
        return name;
    }
    public int getBrightness(){
        return brightness;
    }
    public SmartLight(String id,String name,int brightness)
    {
        this.id=id;
        this.name=name;
        this.brightness=brightness;
    }
    public SmartLight(String id,String name){
        this(id,name,50);
    }
    public void setBrightness(int brightness){
        this.brightness=brightness;
    }
    public void setBrightness(String preset){
        if(preset=="MAX") this.setBrightness(100);
        else if(preset=="MIN") this.setBrightness(10);
        else if(preset=="ECO") this.setBrightness(30);
        else System.out.println("Ko co che do do");
    }
    void connectToHub(CentralHub hub){
        hub.registerDevice(this);
    }
    public static void main(String[] args) {
        CentralHub hub = new CentralHub();
        SmartLight L1 = new SmartLight("L01","Đèn phòng khách",80);
        SmartLight L2 = new SmartLight("L02","Đèn ngủ");
        L2.setBrightness("ECO");
        L1.connectToHub(hub);
        L2.connectToHub(hub);
        System.out.println(L1.getBrightness() + " " + L2.getBrightness());
    }
}
