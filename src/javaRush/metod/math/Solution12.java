package javaRush.metod.math;

public class Solution12 {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.ru", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("У URL-адреса - " + url + ", сетевой протокол - " + protocol + ", домен - " + domain);
        }
    }

    public static String checkProtocol(String url) {
        String result = null;
        if (url.startsWith("https")) {
            result = "https";
        } else if (url.startsWith("http")) {
            result = "http";
        } else {
            result = "неизвестный";
        }
        return result;
    }

    public static String checkDomain(String url) {
        String str = null;
        if (url.endsWith("com")) {
            str = "com";
        } else if (url.endsWith("net")) {
            str = "net";
        } else if (url.endsWith("org")) {
            str = "org";
        } else if (url.endsWith("ru")) {
            str = "ru";
        } else {
            str = "неизвестный";
        }
        return str;
    }
}
