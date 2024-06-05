package com.backend.backend.application;

import com.backend.backend.infrastructure.entity.ArtEntity;

import java.util.List;

public interface IArtService {
    List<ArtEntity> findAll(); //TEST
    ArtEntity save(ArtEntity entity); //
    void delete(int index);
}
