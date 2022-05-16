package com.nanum.nanumserver.Item;

import com.nanum.nanumserver.Item.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ItemRepository extends JpaRepository<Item,Long> {
    Optional<Item> findByItemId(Long itemId);
}
