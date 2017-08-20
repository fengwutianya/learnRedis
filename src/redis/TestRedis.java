package redis;

import redis.clients.jedis.Jedis;

/**
 * Created by xuan on 2017/8/20 0020.
 */
public class TestRedis {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        jedis.set("foo", "val");
        String val = jedis.get("foo");
        System.out.println(val);
    }
}
