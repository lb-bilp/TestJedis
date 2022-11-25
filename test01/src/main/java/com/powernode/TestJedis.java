package com.powernode;

import redis.clients.jedis.Jedis;

/**
 * @author
 * @PackageName:com.powernode
 * @ClassName:TestJedis
 * @Description:
 * @date:2022/11/23 11:26
 */
public class TestJedis {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.253.130",6379);
        jedis.auth("123456");
        String replication = jedis.info("replication");
        System.out.println(replication);
        System.out.println("11111112221sss");
        System.out.println("aaaaabbb");
        System.out.println("xxxx555xx");
    }
}
