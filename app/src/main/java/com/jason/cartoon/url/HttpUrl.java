package com.jason.cartoon.url;

/**
 * Created by Jason on 2017/10/7.
 */

public class HttpUrl {
    //鼠绘官网
    public static final String APP_HTTP = "http://www.ishuhui.net";
    //返回登录界面，但登录不了
    public static final String GET_ALL_BOOK = "http://www.ishuhui.net/ComicBooks/GetSubscribe";
    //返回非常多的数据29
    public static final String URL_CATEGORY_DATA = "http://www.ishuhui.net/ComicBooks/GetAllBook";
    //返回一些数据，没几条
    public static final String GET_NEW_BOOK = "http://www.ishuhui.net/ComicBooks/GetLastChapterForBookIds?idJson=[1,2,3]";
    //返回空白页面，没数据
    public static final String URL_COMIC_BOOK_DATA = "http://www.ishuhui.net/ComicBooks/GetChapterList";
    //返回System.Web.HttpException。404
    public static final String URL_IMG_CHAPTER = "http://www.ishuhui.net/ReadComicBooksToIso/";
    //跟上面的URL_CATEGORY_DATA一模一样
    public static final String URL_RECOMMEND = "http://www.ishuhui.net/ComicBooks/GetAllBook";
    //跟上面的URL_CATEGORY_DATA一模一样
    public static final String URL_SEARCH_DATA = "http://www.ishuhui.net/ComicBooks/GetAllBook";
    //返回binner的三条数据
    public static final String URL_SLIDE_DATA = "http://7xlkmz.com1.z0.glb.clouddn.com/mousepaintURL_SLIDE_DATA.txt";
    //    public static final String URL_SLIDE_DATA = "http://two.ishuhui.com/imgs.html";
    //跟上面的URL_CATEGORY_DATA一模一样
    public static final String URL_SUBCRIBE_USER = "http://www.ishuhui.net/ComicBooks/GetAllBook";
    //网址不一样但返回和GET_ALL_BOOK一样的登录界面，
    public static final String URL_USER_LOGIN = "http://www.ishuhui.net/UserCenter/Login";
    //返回404
    public static final String URL_USER_REGISTER = "http://www.ishuhui.net/UserCenter/Regedit";
    //返回登录界面
    public static final String URL_USER_SUBSCRIBE = "http://www.ishuhui.net/Subscribe";
    //跟上面的URL_CATEGORY_DATA一模一样
    public static final String URL_WEEK_SEVEN = "http://www.ishuhui.net/ComicBooks/GetAllBook";

}
