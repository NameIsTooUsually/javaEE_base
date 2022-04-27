package com.chenhao.homework.test1;

import java.math.BigDecimal;
import java.util.concurrent.*;

/*
使用线程池,分别开启三条线程,生成10个1到100的随机数,
然后计算他们的平均数, 最后计算这三个平均数的平 均数.(使用Callable)
 */
public class Test1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建一个mycallable对象
        MyCallable mc1 = new MyCallable();


        //创建一个线程池
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,
                5,
                10L, TimeUnit.SECONDS,
                new ArrayBlockingQueue(5),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
        //提交三条线程
        Future f1 = pool.submit(mc1);
        Future f2 = pool.submit(mc1);
        Future f3 = pool.submit(mc1);

        //打印三条线程返回的结果
        System.out.println("线程f1计算的平均数是"+f1.get());
        System.out.println("线程f2计算的平均数是"+f2.get());
        System.out.println("线程f3计算的平均数是"+f3.get());
        //对结果进行累加
        BigDecimal add = ((BigDecimal) f1.get()).add((BigDecimal) f2.get()).add((BigDecimal) f3.get());

        //取平均值并打印
        System.out.println(add.divide(new BigDecimal(3),2,BigDecimal.ROUND_HALF_UP));

        pool.shutdown();
    }
}
