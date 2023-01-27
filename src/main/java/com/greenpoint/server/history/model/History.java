package com.greenpoint.server.history.model;


import com.greenpoint.server.common.BaseEntity;
import com.greenpoint.server.customer.model.Customer;
import com.greenpoint.server.store.model.Store;
import lombok.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Where(clause = "deleted = false")
@SQLDelete(sql = "UPDATE history SET deleted = true Where id = ?")
public class History extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long customerId;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private Store store;
    private int cost;
    private int savedPoint;
    private int usedPoint;


    public static History from(Store store, HistoryRequest request){
        return History.builder()
                .customerId(request.getCustomerId())
                .store(store)
                .cost(request.getCost())
                .savedPoint(request.getSavedPoint())
                .usedPoint(request.getUsedPoint())
                .build();
    }


}
