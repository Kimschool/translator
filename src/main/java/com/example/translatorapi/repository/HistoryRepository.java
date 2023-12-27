package com.example.translatorapi.repository;

import com.example.translatorapi.entity.History;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoryRepository extends JpaRepository<History, Integer> {
}
