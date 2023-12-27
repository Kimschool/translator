package com.example.translatorapi.repository;

import com.example.translatorapi.entity.History;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HistoryRepository extends JpaRepository<History, Integer> {
    List<History> findById(String userId);
}
