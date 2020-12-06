package com.kaida.service.impl;

import com.kaida.dao.ProviderMapper;
import com.kaida.entity.Provider;

import java.util.List;

public class ProviderServiceImpl implements ProviderMapper {
    private ProviderMapper providerDao;

    public ProviderMapper getProviderDao() {
        return providerDao;
    }

    public void setProviderDao(ProviderMapper providerDao) {
        this.providerDao = providerDao;
    }

    @Override
    public List<Provider> selectProvider() {
        return providerDao.selectProvider();
    }
}
