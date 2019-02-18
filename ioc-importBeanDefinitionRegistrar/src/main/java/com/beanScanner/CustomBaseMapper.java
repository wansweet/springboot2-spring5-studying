package com.beanScanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CustomBaseMapper implements BaseMapper {

    private final Logger LOG = LoggerFactory.getLogger(this.getClass().getName());
    private List<String> dataList = new CopyOnWriteArrayList<>();
 
    /**
     * @param value
     */
    @Override
    public void add(String value) {
        LOG.info("添加数据:" + value);
        dataList.add(value);
    }
 
    /**
     * @param key
     */
    @Override
    public void remove(String key) {
        if (dataList.isEmpty()){
            throw new IllegalArgumentException("Can't remove because the list is Empty!");
        }
    }
}