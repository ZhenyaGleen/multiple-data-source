package com.example.multipledatasource.repository.cardholder;

import com.example.multipledatasource.model.cardholder.CardHolder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardHolderRepository extends JpaRepository<CardHolder, Long> {
}