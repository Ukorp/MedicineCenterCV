package com.database.medicine.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Check;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "logs")
@AllArgsConstructor
@NoArgsConstructor
public class Logs {

//    id          bigint generated always as identity primary key,
//    action      text check (action in ('INSERT', 'DELETE', 'UPDATE')),
//    table_name  text,
//    change_time timestamp default now(),
//    details     text

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    public String action;

    public String tableName;

    public LocalDateTime changeTime;

    public String details;


}