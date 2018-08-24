package com.xupt.edu.bishi.lianjia.mianshi;

/**
 * @author: zhaowanyue
 * @date: 2018/8/24
 * @description:
 * 首先当一个线程发出请求后，会先检查instance是否为null，如果不是则直接返回其内容，这样避免了进入synchronized块所需要花费的资源。
 * 其次，即使第2节提到的情况发生了，两个线程同时进入了第一个if判断，那么他们也必须按照顺序执行synchronized块中的代码，
 * 第一个进入代码块的线程会创建一个新的Singleton实例，而后续的线程则因为无法通过if判断，而不会创建多余的实例。
 */
public class LockSingleton {
    private static volatile LockSingleton lockSingleton=null;
    private LockSingleton()
    {
        System.out.println("LockSingleton 私有构造");
    }
    public static LockSingleton getLockSingleton()
    {
        if(lockSingleton==null)
        {
            synchronized (LockSingleton.class)
            {
                if(lockSingleton==null)
                {
                   lockSingleton=new LockSingleton();
                }
            }
        }
        return lockSingleton;
    }
    public static void main(String[] args) {
        LockSingleton lockSingleton=new LockSingleton();
    }
}
