package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author jzx
 * @create 2022-10-29-12:49
 */
@Component
public class MyLB implements LoadBalancer{

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public final int getAndIncrement() {
        int current;
        int next;
        do {
            current = this.atomicInteger.get();
            //next = current >= 2147483647 ? 0 : current + 1;
            next = current >= Integer.MAX_VALUE ? 0 : current + 1;
        } while (!this.atomicInteger.compareAndSet(current, next));
        System.out.println("======第几次访问，次数 next: " + next);
        return next;
    }

    /**
     * 负载均衡算法：rest 接口第几次请求数 % 服务器集群总数量 = 实际调用服务器位置下标   每次服务重启动后 rest 接口计数从 1 开始
     * @param serviceInstances 服务实例
     * @return {@code ServiceInstance}
     */
    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
        int index = getAndIncrement() % serviceInstances.size();
        return serviceInstances.get(index);
    }

}
