package com.beanScanner;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MapperJavaProxy implements InvocationHandler {
 
    private BaseMapper baseMapper;
 
    private Class<?> interfaceClass;
 
    public MapperJavaProxy(BaseMapper baseMapper, Class<?> interfaceClass) {
        this.baseMapper = baseMapper;
        this.interfaceClass = interfaceClass;
    }
 
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (!interfaceClass.isInterface()) {
            throw new IllegalArgumentException("mapperInterface is not interface.");
        }
 
        if (baseMapper == null) {
            baseMapper = new CustomBaseMapper();
        }
        return method.invoke(baseMapper, args);
    }
}