package dcits.web;


import redis.clients.jedis.Jedis;

public class redis extends Test {

    // Ping the localhost whether response
    @Override
    public boolean run() {
        Jedis database = new Jedis("localhost");
        if (database.ping().equals("PONG")) {
            return true;
        } else {
            return false;
        }
    }

    // Print the result of redis testing via run method
    @Override
    public void app_test() {
        System.out.println("testing redis database:");
        if (run()) {
            System.out.println("redis works success");
        } else {
            System.out.println("redis disconnect please check the task");
        }
    }
}

