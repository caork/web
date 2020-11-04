package dcits.web;



abstract class Test{

    public abstract boolean run();

    public abstract void app_test();
}

class Testing{
    public void testing(){
        redis redistest = new redis();
        redistest.app_test();
    }
}

