package cn.iisheng.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.function.Predicate;

/**
 * @author iisheng
 * @date 2019/11/22 11:41:46
 */
public class PredicateStudy {
    public static void main(String[] args) {
        /**
         * 1、判断数字是否大于7
         */
        //设置一个大于7的过滤条件
        Predicate<Integer> predicate = x -> x > 7;
        System.out.println(predicate.test(10)); //输出 true
        System.out.println(predicate.test(6));  //输出 fasle
        List list = new ArrayList<>();
        CompletionStage c;
    }
}
