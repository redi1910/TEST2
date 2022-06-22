package com.msc.B2Cconfig.service;

import java.util.List;

public interface BaseService<Entity, Dto> {

    Dto create(Dto toCreate);
    Entity createEntity(Entity toCreate);

    Dto update(Dto toUpdate);

    List<Dto> updateAll(List<Dto> dtoList);

    void delete(Long entityId);

    Dto findById(Long entityId);
}
