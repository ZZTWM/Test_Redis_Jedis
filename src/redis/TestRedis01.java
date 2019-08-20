package redis;

import redis.clients.jedis.Jedis;

public class TestRedis01 {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		jedis.set("foo", "bar");
		String value = jedis.get("foo");
		System.out.println(value);
	}
}
