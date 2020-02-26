package cn.iisheng.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author iisheng
 * @date 2019/12/02 11:53:49
 */
public class LocalDateTimeStudy {
    static String pattern = "yyyy-MM-dd HH:mm:ss";

    public static void main(String[] args) {
//        LocalDateTime value = LocalDateTime.now();
//        String format = value.format(DateTimeFormatter.ofPattern(pattern));
//        System.out.println(format);


//        String p = "2019-11-28T20:14:36";
//        LocalDateTime parse = LocalDateTime.parse(p,DateTimeFormatter.ofPattern(pattern));
//        System.out.println(parse);


//        String[] strCategoryIds = new String[]{"62","8"};
//        List<Integer> listIds = Arrays.asList(strCategoryIds).stream().map(s -> Integer.parseInt(s.trim())).collect(Collectors.toList());
//        System.out.println(listIds);

        System.out.println(LocalDateTime.now());
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(LocalDateTime.now());
    }

}
