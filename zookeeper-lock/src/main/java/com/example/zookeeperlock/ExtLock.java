/**
 * 功能说明:
 * 功能作者:
 * 创建日期:
 * 版权归属:每特教育|蚂蚁课堂所有 www.itmayiedu.com
 */
package com.example.zookeeperlock;

/**
 * @Author Mr.Kong
 * @Description
 * @Date 2020/3/9 15:56
 */
public interface ExtLock {

    // 获取锁
    public void getLock();

    // 释放锁
    public void unLock();
}
