package crawler.zhihu;

import crawler.zhihu.service.ZhihuUserCrawler;

/**
 * @Description: 运行主函数
 * 1. 获取某个问题下的图片，并存到本地
 * 2. 爬取知乎用户信息，并持久化到数据库，然后进行分析
 * @Author: tong
 */
public class CrawlerMain {
    public static void main(String[] args) {
        // 爬取某个问题下的图片 下载到本地浏览
        // picSpider();

        //爬取用户信息
        userSpider();
    }

    /**
     * 爬取知乎用户信息，持久化到数据库
     * url为个人主页如："https://www.zhihu.com/people/chen-qiang-95-5/following"
     */
    public static void userSpider() {
        //定义爬虫入口url 以我的知乎链接为入口  （可换成知乎一些名人进行爬取）
        String url = "https://www.zhihu.com/people/chen-qiang-95-5/following";

        try {
            ZhihuUserCrawler.startCrawler(url);
        } catch (InterruptedException e) {
            System.out.println("线程意外终止！！");
            e.printStackTrace();
        }
    }
}
