package com.example.multipledatasource.repository.card;


import com.example.multipledatasource.model.card.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long> {
}