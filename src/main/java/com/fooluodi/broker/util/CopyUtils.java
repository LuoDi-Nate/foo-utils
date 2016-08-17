package com.fooluodi.broker.util;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by di on 7/8/2016.
 */
public class CopyUtils {
    public static <E, T> List<T> copyList(List<E> list, Class clazz){
        List<T> resultList = new ArrayList<T>();

        try{
            for (E e : list) {
                T newInstance = (T)clazz.newInstance();
                org.springframework.beans.BeanUtils.copyProperties(e, newInstance);
                resultList.add(newInstance);
            }
        }catch (Exception e){}

        return resultList;
    }
}
