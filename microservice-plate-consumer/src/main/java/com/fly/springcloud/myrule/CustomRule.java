package com.fly.springcloud.myrule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;

/**
 * Created by XianRui on 2020-01-14 21:16
 **/

/**
 * 自定义轮询规则
 */
public class CustomRule extends AbstractLoadBalancerRule {

    private int total = 0;

    private int currentIndex = 0;

    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }

    @Override
    public Server choose(Object o) {

        ILoadBalancer lb = getLoadBalancer();
        if (lb == null) return null;
        Server server = null;
        while (server == null) {
            if (Thread.interrupted()) {
                return null;
            }
            List<Server> reachableServers = lb.getReachableServers();
            List<Server> allServers = lb.getAllServers();
            if (allServers.size() == 0) {
                return null;
            }
            if (total < 4) {
                server = reachableServers.get(currentIndex);
                total++;
            } else {
                total = 0;
                currentIndex++;
                currentIndex = currentIndex % reachableServers.size();
                if (server == null) {
                    Thread.yield();
                    continue;
                }
                if (server.isAlive()) {
                    return server;
                }
                server = null;
                Thread.yield();
            }

        }


        return server;
    }
}
